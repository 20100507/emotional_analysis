package org.bianqi.wangyi.music.mlib

import java.sql.{Connection, DriverManager, PreparedStatement}
import java.util.Properties

import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, Word2Vec}
import org.apache.spark.sql.{Row, SQLContext, SaveMode}
import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}
import org.apache.spark.unsafe.types.UTF8String
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.functions._

/**
  * 歌曲分类预测
  */
object SMSClassifier {

  def deleteData(): Unit = {
    var conn: Connection = null
    var ps: PreparedStatement = null
    val sql = "delete from song_classify"
    try {
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yuncun", "root", "123")
      ps = conn.prepareStatement(sql)
      ps.executeUpdate()
    } catch {
      case e: Exception => println("Mysql exception")
    } finally {
      if (ps != null) {
        ps.close()
      }
      if (conn != null) {
        conn.close()
      }
    }
  }

  def main(args: Array[String]): Unit = {

    val VECTOR_SIZE = 1000
    val conf = new SparkConf().setAppName("Song").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    import sqlContext.implicits._
    deleteData()
    val sqlCtx = new SQLContext(sc)
    val parsedRDD = sc.textFile("E://ml.txt").map(_.split(",")).map(eachRow => {
      (eachRow(0), eachRow(1).split(" "))
    })
    val msgDF = sqlCtx.createDataFrame(parsedRDD).toDF("label", "song")
    val labelIndexer = new StringIndexer()
      .setInputCol("label")
      .setOutputCol("indexedLabel")
      .fit(msgDF)
    val word2Vec = new Word2Vec()
      .setInputCol("song")
      .setOutputCol("features")
      .setVectorSize(VECTOR_SIZE)
      .setMinCount(1)
    val layers = Array[Int](VECTOR_SIZE, 6, 5, 2)
    val mlpc = new MultilayerPerceptronClassifier()
      .setLayers(layers)
      .setBlockSize(512)
      .setSeed(1234L)
      .setMaxIter(128)
      .setFeaturesCol("features")
      .setLabelCol("indexedLabel")
      .setPredictionCol("prediction")
    val labelConverter = new IndexToString()
      .setInputCol("prediction")
      .setOutputCol("predictedLabel")
      .setLabels(labelIndexer.labels)
    val Array(trainingData, testData) = msgDF.randomSplit(Array(0.9, 0.1))
    val pipeline = new Pipeline().setStages(Array(labelIndexer, word2Vec, mlpc, labelConverter))
    val model = pipeline.fit(trainingData)
    val predictionResultDF = model.transform(testData)
    val rows = predictionResultDF.
      select("song", "label", "predictedLabel")
      .withColumn("song", concat_ws(",", $"song"))
    val df = rows.registerTempTable("song_classify")
    val sqlcommand = "select * from song_classify"
    val prop = new java.util.Properties
    prop.setProperty("user", "root")
    prop.setProperty("password", "123")
    sqlContext.sql(sqlcommand)
      .write.mode(SaveMode.Append).jdbc("jdbc:mysql://localhost:3306/yuncun", "song_classify", prop)
    //利用SparkSQL数据存储到mysql

    sc.stop
  }
}

case class song_classify(song: String, label: Int, predictedLabel: Int) extends Serializable