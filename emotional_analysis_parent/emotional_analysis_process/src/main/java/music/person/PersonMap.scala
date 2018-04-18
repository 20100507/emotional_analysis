package org.bianqi.wangyi.music.person

import java.sql.{Connection, DriverManager, PreparedStatement}

import org.apache.spark.{SparkConf, SparkContext}

/**
  * 网易云音乐人物全国地图分布
  */
object PersonMap {

  val personDataInsert = (iterator:Iterator[(String,Int)]) =>{
    var conn:Connection = null
    var ps:PreparedStatement = null
    val sql = "insert into user_location(location,total_count) values(?,?)"
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

  def searchProvince(lines:Array[(String,String)],province:Long):Int = {
    lines.zipWithIndex.find(_._1._1.toLong == province).map(_._2).getOrElse(32)
  }

  def deleteData():Unit = {
    var conn:Connection = null
    var ps:PreparedStatement = null
    val sql = "delete from user_location"
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
    val conf = new SparkConf().setMaster("local[2]").setAppName("ProvinceLocation")
    val sc = new SparkContext(conf)
    deleteData()
    val provinceRulesRdd = sc.textFile("E://provinces.csv")
      .map(line=>{
         val fields = line.split("\t")
         val province_id = fields(1)
         val province_name = fields(2)
        (province_id,province_name)
      })
    val provinceRuleArray = provinceRulesRdd.collect()
    //使用广播变量
    val provinceBoardcast = sc.broadcast(provinceRuleArray)
    val personRdd = sc.textFile("E://person.dat").map(line=>{
         val fields = line.split(",")
        fields(3)
    })
    val result = personRdd.map(provinceId=>{
      val index = searchProvince(provinceBoardcast.value,provinceId.toLong)
      val info = provinceBoardcast.value(index)
      info
    }).map(t=>(t._2,1)).reduceByKey(_+_)
    result.foreachPartition(personDataInsert(_))
    sc.stop()
  }
}
