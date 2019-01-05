package org.bianqi.wangyi.music.mlib

import org.apache.spark.ml.feature.{HashingTF, IDF, Tokenizer, Word2Vec}
import org.apache.spark.mllib.classification.NaiveBayes
import org.apache.spark.sql.{Column, DataFrame, SQLContext}
import org.apache.spark.{SparkConf, SparkContext}

/**

   行业分类训练与预测 相关训练数据在当前目录已经上传
*/

object Text2Classifier {
  case class Document(docContent:String)
  case class RawDataRecord(text: String)

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("tfidf").setMaster("local[8]")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)

    // data1.txt文件中的所有数据。
    // 总共3行，每行代表一篇文章。
    // 每行格式：docid ^A docContent(word空格word空格word...)
    // 1^A银行 食品 药品 食品 食品 食品 药品
    // 2^A银行 银行业 银行
    // 3^A药品 银行业 银行业 银行业
    val data=sc.textFile("data/data1.txt").map(_.split(" ")).map(doc=>Document(doc(0).trim))
    // RDD转换成DataFrame
    import sqlContext.implicits._
    val docDF=data.toDF()
    // Tokenizer(分词) 把字符串转换成小写，默认按空格切分
    val tokenizer = new Tokenizer().setInputCol("docContent").setOutputCol("words")
    val wordsDF = tokenizer.transform(docDF)
    // hashingTF
    // 1)给每一个词一个hash值，同一个词hash值相同
    // 2)统计每行文本中每个词在该文章中出现的次数
    // 3)每行文本内容转成一个稀疏向量，setNumFeatures(30)代表特征总数，hash代表位置，词频代表值
    val hashingTF = new HashingTF()
      .setInputCol("words").setOutputCol("wordFrequency").setNumFeatures(30)
    val featuresDF = hashingTF.transform(wordsDF)
    // 结果：
    // [3,WrappedArray(药品, 银行业, 银行业, 银行业),(30,[20,24],[3.0,1.0])]
    // [1,WrappedArray(银行, 食品, 药品, 食品, 食品, 食品, 药品),(30,[6,22,24],[1.0,4.0,2.0])]
    // [2,WrappedArray(银行, 银行业, 银行),(30,[6,20],[2.0,1.0])]
    // 结果分析：
    // 词银行业用hash值20代替，在docid=3的文章中出现3次；在docid=2的文章中出现1次
    // 词药品用hash值24代替，在docid=3的文章中出现1次；在docid=1的文章中出现2次
    // 词食品用hash值22代替，在docid=31的文章中出现4次
    // 词银行用hash值6代替，在docid=2的文章中出现2次；在docid=1的文章中出现1次
    // idf
    // 逆文频inverse document frequency
    val idf = new IDF().setInputCol("wordFrequency").setOutputCol("features")
    // fit方法 计算逆文频
    val idfModel = idf.fit(featuresDF)

    val dataFrame = idfModel.transform(featuresDF)

    new Word2Vec()
      .setInputCol("text")
      .setOutputCol("result")
      .setVectorSize(3)

    dataFrame.toDF()




//    val conf = new SparkConf().setAppName("NaiveBayesExample")
//    val sc = new SparkContext(conf)
//    var srcRDD = sc.textFile("E://sougou-train//C000010.txt").map {
//      x =>
//        var data = x.split(",")
//        RawDataRecord(data(0))
//    }
//    //70%作为训练数据，30%作为测试数据
//    val splits = srcRDD.randomSplit(Array(0.9, 0.1))
//    var trainingDF = splits(0).toDF()
//    var testDF = splits(1).toDF()
//
//    val sqlContext = new SQLContext(sc)
//    val lines = sqlContext.read.text("hdfs://node-1.itcast.cn:9000/wc").as[String]
//    //将词语转换成数组
//    var tokenizer1 = new Tokenizer().setInputCol("text").setOutputCol("words")
//    var word = tokenizer1.transform(lines)
//    println("output1：")
//    //计算每个词在文档中的词频
//    var hashTF = new HashingTF().setNumFeatures(500000).setInputCol("words").setOutputCol("rawFeatures")
//    var featurizedData1 = hashTF.transform(word)
//    var idf1 = new IDF().setInputCol("rawFeatures").setOutputCol("features")
//    var idfModel1 = idf1.fit(featurizedData1)
//    var rescaledData1 = idfModel1.transform(featurizedData1)
  }

}
