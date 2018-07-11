package demo

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._

object WordCount extends App{

  Logger.getLogger("org").setLevel(Level.ERROR)

  val conf = new SparkConf().setAppName("Spark Version").setMaster("local")
  val sc = new SparkContext(conf)

  val lines = sc.textFile("E:/intellij/wc.txt")
  val words = lines.flatMap(x => x.split(" ")).map(word => (word,1)).reduceByKey((a,b)=> (a+b))
  //val words = lines.flatMap(x => x.split (" ")).countByValue()
  //words.saveAsTextFile("E:/intellij/wcout.txt")
  words.foreach(println)


}
