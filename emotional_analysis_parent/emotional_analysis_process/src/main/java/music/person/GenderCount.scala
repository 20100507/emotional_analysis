package org.bianqi.wangyi.music.person

import java.sql.{Connection, DriverManager, PreparedStatement}

import org.apache.spark.{SparkConf, SparkContext}
import org.bianqi.wangyi.music.person.PersonMap.searchProvince

/**
  * 网易云音乐性别比率统计
  */
object GenderCount {

  def deleteData():Unit = {
    var conn:Connection = null
    var ps:PreparedStatement = null
    val sql = "delete from graph_triangle"
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

  val genderDataInsert = (iterator:Iterator[(String,Int)]) =>{
    var conn:Connection = null
    var ps:PreparedStatement = null
    val sql = "insert into user_gender(gender,gender_count) values(?,?)"
    try{
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yuncun","root","123")
      iterator.foreach(line=>{
        ps = conn.prepareStatement(sql)
        ps.setString(1,line._1)
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

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[2]").setAppName("GenderLocation")
    val sc = new SparkContext(conf)
    deleteData()
    val genderRulesRdd = sc.textFile("E://gender.csv")
      .map(line=>{
        val fields = line.split("\t")
        val gender_id = fields(1)
        val gender_name = fields(2)
        (gender_id,gender_name)
      })

    val genderRuleArray = genderRulesRdd.collect()
    //使用广播变量
    val genderBoardcast = sc.broadcast(genderRuleArray)
    val personGenderRdd = sc.textFile("E://person.dat").map(line=>{
      val fields = line.split(",")
      fields(4)
    })
    val result = personGenderRdd.map(genderId=>{
      val index = searchProvince(genderBoardcast.value,genderId.toLong)
      val info = genderBoardcast.value(index)
      info
    }).map(t=>(t._2,1)).reduceByKey(_+_)
    result.foreachPartition(genderDataInsert(_))
    sc.stop()
  }
}
