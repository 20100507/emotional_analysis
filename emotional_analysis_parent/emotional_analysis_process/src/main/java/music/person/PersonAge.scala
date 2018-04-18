package org.bianqi.wangyi.music.person

import java.sql.{Connection, DriverManager, PreparedStatement}
import java.text.SimpleDateFormat
import java.util.Date

import org.apache.spark.{SparkConf, SparkContext}
import org.bianqi.wangyi.music.person.GenderCount.genderDataInsert
import org.bianqi.wangyi.music.person.PersonMap.searchProvince

/**
  * 网易云音乐用户年龄分段[80,85,90,95,00,05,10,15,其他]
  */
object PersonAge {

  val ageDataInsert = (iterator:Iterator[(String,Int)]) =>{
    var conn:Connection = null
    var ps:PreparedStatement = null
    val sql = "insert into user_age(year_range,total_count) values(?,?)"
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

  def getYearByMill(mill:Long): Int ={
    if(mill == -2209017600000L || mill < 315504000000L || mill > 1514736000000L){
        return 0
    }
    val date = new Date()
    date.setTime(mill)
    val sdf = new SimpleDateFormat("yyyy")
    val year = sdf.format(date)
    year.toInt
  }

  def searchAge(lines:Array[(String,String)],age:Long):Int = {
    lines.zipWithIndex.find(_._1._1.toLong == age).map(_._2).getOrElse(32)
  }

  def deleteData():Unit = {
    var conn:Connection = null
    var ps:PreparedStatement = null
    val sql = "delete from user_age"
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
    val conf = new SparkConf().setMaster("local[2]").setAppName("AgeLocation")
    val sc = new SparkContext(conf)
    deleteData()
    val ageRulesRdd = sc.textFile("E://age.csv")
      .map(line=>{
        val fields = line.split("\t")
        val age_id = fields(1)
        val age_name = fields(2)
        (age_id,age_name)
      })

    val genderRuleArray = ageRulesRdd.collect()
    //使用广播变量
    val ageBoardcast = sc.broadcast(genderRuleArray)
    val personAgeRdd = sc.textFile("E://person.dat").map(line=>{
      val fields = line.split(",")
        getYearByMill(fields(1).toLong)
    })

    val result = personAgeRdd.map(genderId=>{
      val index = searchAge(ageBoardcast.value,genderId.toLong)
      val info = ageBoardcast.value(index)
      info
    }).map(t=>(t._2,1)).reduceByKey(_+_)
    result.foreachPartition(ageDataInsert(_))
    sc.stop()
  }
}
