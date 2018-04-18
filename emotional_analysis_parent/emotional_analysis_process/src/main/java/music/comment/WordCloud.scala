package org.bianqi.wangyi.music.comment

import java.sql.{Connection, DriverManager, PreparedStatement}
import java.util.Properties

import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}
import org.apache.spark.sql.{Row, SQLContext}
import org.apache.spark.{SparkConf, SparkContext}

/**
  * 网易云音乐评论词云数据处理
  * 2018.03.01
  */
object WordCloud {

  def deleteData():Unit = {
    var conn:Connection = null
    var ps:PreparedStatement = null
    val sql = "delete from comment_count"
    try{
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yuncun","root","123")
      ps = conn.prepareStatement(sql)
      ps.executeUpdate()
    }catch{
      case e:Exception => println("Mysql exception")
    }finally{
      if(ps != null){
        ps.close()
      }
      if(conn != null){
        conn.close()
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("Commentcount").setMaster("local[2]")
    val sparkContext = new SparkContext(sparkConf)
    deleteData()
    val sqlContext = new SQLContext(sparkContext)
    val rdd1 = sparkContext.textFile("E://comments1.dat").map(x => {
      val arr = x.split("\t")
      val content = arr(3)
      content
    })
    val value = rdd1.flatMap(_.split(" ")).map((_, 1))
      .reduceByKey(_ + _).sortBy(_._2, false)
      .take(300)
    val personRDD = sparkContext.parallelize(value).map(p => (p._1, p._2))
    val rowRDD = personRDD.map(p => Row(p._1.toString, p._2.toInt))
    println(rowRDD)
    //利用SparkSQL数据存储到mysql
    val schema = StructType(
      List(
        StructField("content", StringType, true),
        StructField("content_count", IntegerType, true)
      )
    )
    //将RDD映射到rowRDD
    //将schema信息应用到rowRDD上
    val personDataFrame = sqlContext.createDataFrame(rowRDD, schema)
    //创建Properties存储数据库相关属性
    val prop = new Properties()
    prop.put("user", "root")
    prop.put("password", "123")
    //将数据追加到数据库
    personDataFrame.write.mode("append").jdbc("jdbc:mysql://localhost:3306/yuncun", "comment_count", prop)
    //停止SparkContext
    sparkContext.stop()
  }
}
