package demo

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object SparkVersion extends App{

  val conf = new SparkConf().setAppName("Spark Version").setMaster("local")
  val sc = new SparkContext(conf)
  val ver = sc.version
  println(ver)
}

