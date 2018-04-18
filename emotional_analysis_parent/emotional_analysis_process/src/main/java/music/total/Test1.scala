package org.bianqi.wangyi.music.total

import org.apache.spark.{SparkConf, SparkContext}

object Test1 {

  case class RawDataRecord(category: String, text: String)

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[*]").setAppName("aa")
    val sc = new SparkContext(conf)

    val sqlContext = new org.apache.spark.sql.SQLContext(sc)
    import sqlContext.implicits._

    var srcRDD = sc.textFile("E://sougou-train//C000024.txt").map {
      x =>
        var data = x.split(",")
        RawDataRecord(data(0),data(1))
    }
    println(srcRDD.collect().toBuffer)
    //70%作为训练数据，30%作为测试数据
    val splits = srcRDD.randomSplit(Array(0.9, 0.1))
    var trainingDF = splits(0).toDF()
    var testDF = splits(1).toDF()



  }
}
