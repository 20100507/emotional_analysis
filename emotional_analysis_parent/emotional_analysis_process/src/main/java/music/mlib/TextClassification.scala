package org.bianqi.wangyi.music.mlib

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.ml.feature.HashingTF
import org.apache.spark.ml.feature.IDF
import org.apache.spark.ml.feature.Tokenizer
import org.apache.spark.mllib.classification.{NaiveBayes, NaiveBayesModel}
import org.apache.spark.ml.linalg.{SparseVector, Vector}
import org.apache.spark.mllib.linalg.Vectors
import org.apache.spark.mllib.regression.LabeledPoint
import org.apache.spark.sql.Row

/**
  搜狗词库分类预测 相关训练数据在当前目录已经上传
*/
object TextClassification {

  case class RawDataRecord(category: String, text: String)


  def main(args : Array[String]) {

    val conf = new SparkConf().setMaster("local[*]").setAppName("aa")
    val sc = new SparkContext(conf)

    val sqlContext = new org.apache.spark.sql.SQLContext(sc)
    import sqlContext.implicits._

    var srcRDD = sc.textFile("E://sougou-train//C000010.txt").map {
      x =>
        var data = x.split(",")
        RawDataRecord(data(0),data(1))
    }
    println(srcRDD.collect().toBuffer)
    //70%作为训练数据，30%作为测试数据
    val splits = srcRDD.randomSplit(Array(0.9, 0.1))
    var trainingDF = splits(0).toDF()
    var testDF = splits(1).toDF()
    //将词语转换成数组
    var tokenizer = new Tokenizer().setInputCol("text").setOutputCol("words")
    var wordsData = tokenizer.transform(trainingDF)
    println("output1：")
//    wordsData.select($"category",$"text",$"words").take(1).foreach(println)
    //计算每个词在文档中的词频
    var hashingTF = new HashingTF().setNumFeatures(500000).setInputCol("words").setOutputCol("rawFeatures")
    var featurizedData = hashingTF.transform(wordsData)
    println("output2：")
//    featurizedData.select($"category", $"words", $"rawFeatures").take(1).foreach(println)
//
//
    //计算每个词的TF-IDF
    var idf = new IDF().setInputCol("rawFeatures").setOutputCol("features")
    var idfModel = idf.fit(featurizedData)
    var rescaledData = idfModel.transform(featurizedData)
    println("output3：")
//    rescaledData.select($"category", $"features").take(1).foreach(println)

    //转换成Bayes的输入格式
    var trainDataRdd = rescaledData.select($"category",$"features").rdd.map {
      case Row(label: String, features: SparseVector) =>
        LabeledPoint(label.toDouble, Vectors.dense(features.toArray))
    }
    println("output4：")
//    trainDataRdd.take(1).foreach(println)
    //训练模型
    val model = NaiveBayes.train(trainDataRdd, lambda = 1.0, modelType = "multinomial")
    //测试数据集，做同样的特征表示及格式转换
    var testwordsData = tokenizer.transform(testDF)
    var testfeaturizedData = hashingTF.transform(testwordsData)
    var testrescaledData = idfModel.transform(testfeaturizedData)
    var testDataRdd = testrescaledData.select($"category",$"features").map {
      case Row(label: String, features: SparseVector ) =>
        LabeledPoint(label.toDouble, Vectors.dense(features.toArray))
    }
    //对测试数据集使用训练模型进行分类预测
    val testpredictionAndLabel = testDataRdd.map(p => (model.predict(p.features), p.label))
    //统计分类准确率
    println(testpredictionAndLabel.show())
    var testaccuracy = 1.0 * testpredictionAndLabel.filter(x => x._1 == x._2).count() / testDataRdd.count()
    println("output5：")
    println(testaccuracy)
  }
}