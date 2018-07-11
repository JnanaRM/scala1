package demo

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._

object CustomerTime extends App {

  Logger.getLogger("org").setLevel(Level.ERROR)

  val conf = new SparkConf().setAppName("Customer Time").setMaster("local")
  val sc = new SparkContext(conf)

  val lines = sc.textFile("E:/spark scala udemy/SparkScala/SparkScala/customer-orders.csv")
  val fields = lines.map(x => x.split(",")).map(a =>(a(0),a(2).toFloat))
  val res = fields.reduceByKey((a,b) => (a+b))
  val ressort = res.sortByKey()
  ressort.foreach(println)

}
