package org.bianqi.wangyi.music.comment

import java.sql.{Connection, DriverManager, PreparedStatement}
import java.text.SimpleDateFormat
import java.util.Date

import org.apache.spark.{SparkConf, SparkContext}
import org.bianqi.wangyi.music.person.PersonMap.{personDataInsert, searchProvince}

/**
  * 网易云音乐用户评论时间段
  * 2018.03.08
  */
object CommentInterval {

  val commentIntervalDataInsert = (iterator:Iterator[(String,Int)]) =>{
    var conn:Connection = null
    var ps:PreparedStatement = null
    val sql = "insert into comment_interval(intervalTime,intervalCount) values(?,?)"
    try{
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yuncun","root","123")
      iterator.foreach(line=>{
        ps = conn.prepareStatement(sql)
        ps.setInt(1,line._1.toInt)
        ps.setInt(2,line._2)
        ps.executeUpdate()
      })
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

  def getHourByMill(mill:Long): Int ={
    val date = new Date()
    date.setTime(mill)
    val sdf = new SimpleDateFormat("HH")
    val year = sdf.format(date)
    year.toInt
  }

  def searchHour(lines:Array[(String,String)],hour:Long):Int = {
    lines.zipWithIndex.find(_._1._1.toLong == hour).map(_._2).getOrElse(32)
  }

  def deleteData():Unit = {
    var conn:Connection = null
    var ps:PreparedStatement = null
    val sql = "delete from comment_interval"
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
    val conf = new SparkConf().setMaster("local[2]").setAppName("IntervalLocation")
    val sc = new SparkContext(conf)
    deleteData()
    val intervalRulesRdd = sc.textFile("E://interval.csv")
      .map(line=>{
        val fields = line.split(",")
        val interval_id = fields(1)
        val interval_name = fields(2)
        (interval_id,interval_name)
      })
    val provinceRuleArray = intervalRulesRdd.collect()
    // 使用广播变量
    val IntervalBoardcast = sc.broadcast(provinceRuleArray)
    val intervalRdd = sc.textFile("E://comments.dat").map(line=>{
    val fields = line.split("\t")
      getHourByMill(fields(2).toLong)
    })

    println(intervalRdd.collect().toBuffer)

    val result = intervalRdd.map(intervalId=>{
      val index = searchHour(IntervalBoardcast.value,intervalId.toLong)
      val info = IntervalBoardcast.value(index)
      info
    }).map(t=>(t._2,1)).reduceByKey(_+_)

    println(result.collect().toBuffer)
    result.foreachPartition(commentIntervalDataInsert(_))
    sc.stop()
  }
}
