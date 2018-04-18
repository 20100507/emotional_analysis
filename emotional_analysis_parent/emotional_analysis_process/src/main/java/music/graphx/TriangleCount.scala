package org.bianqi.wangyi.music.graphx

import java.sql.{Connection, DriverManager, PreparedStatement}
import java.util.Properties

import org.apache.spark.graphx.{GraphLoader, PartitionStrategy}
import org.apache.spark.sql.{Row, SQLContext}
import org.apache.spark.sql.types._
import org.apache.spark.{SparkConf, SparkContext}

/**
  * 计算和每一个用户关联的三角形数量
  */
object TriangleCount {

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

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Graphx3").setMaster("local[2]")
    val sc = new SparkContext(conf)
    deleteData()
    val sqlContext = new SQLContext(sc)
    // Load the edges in canonical order and partition the graph for triangle count
    val graph = GraphLoader.edgeListFile(sc, "E:/followers1.dat", true)
      .partitionBy(PartitionStrategy.RandomVertexCut)
    // Find the triangle count for each vertex
    val triCounts = graph.triangleCount().vertices
    // Join the triangle counts with the usernames
    val users = sc.textFile("E:/users1.dat").map { line =>
      val fields = line.split(",")
      (fields(0).toLong, fields(1))
    }
    val triCountByUsername = users.join(triCounts).map { case (id, (username, tc)) =>
      (id,username, tc)
    }
    val triCountBySort = triCountByUsername.sortBy(_._3, false).take(20)
    println(triCountBySort.toBuffer)
    val ranksBySortRDD = sc.parallelize(triCountBySort).map(p => (p._1, p._2, p._3))
    val ranksBySortRDD1 = ranksBySortRDD.map(p => Row(p._1.toInt, p._2.trim, p._3.toFloat))
    //利用SparkSQL数据存储到mysql
    val schema = StructType(
      List(
        StructField("user_id", IntegerType, true),
        StructField("name", StringType, true),
        StructField("triangle_top", FloatType, true)
      )
    )
    //将RDD映射到rowRDD
    //将schema信息应用到rowRDD上
    val ranksDataFrame = sqlContext.createDataFrame(ranksBySortRDD1, schema)
    //创建Properties存储数据库相关属性
    val prop = new Properties()
    prop.put("user", "root")
    prop.put("password", "123")
    //将数据追加到数据库
    ranksDataFrame.write.mode("append").jdbc("jdbc:mysql://localhost:3306/yuncun", "graph_triangle", prop)
    //停止SparkContext
    sc.stop()
  }
}
