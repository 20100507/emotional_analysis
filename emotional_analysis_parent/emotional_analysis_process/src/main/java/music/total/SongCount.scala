package org.bianqi.wangyi.music.total

import java.util.Properties

import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.types._
import org.apache.spark.{SparkConf, SparkContext}

/**
  * 统计有多少首歌
  */
object SongCount {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("SQLDemo").setMaster("local")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)

    val personRdd = sc.textFile("E://song.txt").map(line=>{
      val fields = line.split("\t")
      Song(fields(0),fields(1),fields(2),fields(3))
    })
    import sqlContext.implicits._
    val personDf = personRdd.toDF
    personDf.createOrReplaceTempView("song")
    val rows = sqlContext.sql("select count(1) from song").rdd
    val schema = StructType(
      List(
        StructField("song_num", LongType, true)
      )
    )
    //将RDD映射到rowRDD
    //将schema信息应用到rowRDD上
    val personDataFrame = sqlContext.createDataFrame(rows, schema)
    //创建Properties存储数据库相关属性
    val prop = new Properties()
    prop.put("user", "root")
    prop.put("password", "123")
    //将数据追加到数据库
    personDataFrame.write.mode("append").jdbc("jdbc:mysql://localhost:3306/yuncun", "song_count", prop)
    //停止SparkContext
    sc.stop()
  }
}
case class Song(songName:String,singer:String,zhuanji:String,SongUrl:String)

