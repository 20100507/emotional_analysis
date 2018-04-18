package org.bianqi.wangyi.music.song

import java.sql.{Connection, DriverManager, PreparedStatement}
import java.util.Properties

import org.apache.spark.sql.{Row, SQLContext}
import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}
import org.apache.spark.{SparkConf, SparkContext}

/**
  * 歌曲的top榜 根据评论的数量
  */
object SongTop {

  def deleteData():Unit = {
    var conn:Connection = null
    var ps:PreparedStatement = null
    val sql = "delete from song_top"
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
    val conf = new SparkConf().setMaster("local[*]").setAppName("aa")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    val rdd1 = sc.textFile("E://comments1.dat").map(x => {
      val arr = x.split("\t")
      val content = arr(0)
      content
    })

    val value = rdd1.map((_,1)).reduceByKey(_+_).sortBy(_._2,false).take(20)

    val personRDD = sc.parallelize(value).map(p => (p._1, p._2))
    val rowRDD = personRDD.map(p => Row(p._1.toInt, p._2.toInt))
    //利用SparkSQL数据存储到mysql
    val schema = StructType(
      List(
        StructField("songid", IntegerType, true),
        StructField("comment_count", IntegerType, true)
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
    personDataFrame.write.mode("append").jdbc("jdbc:mysql://localhost:3306/yuncun", "song_top", prop)
    //停止SparkContext
    sc.stop()
  }
}
