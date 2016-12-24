package main.scala

/**
  * Created by broy on 10/7/16.
  */
//object SparkMeApp {
//
//}


import org.apache.spark.{SparkContext, SparkConf}

object SparkMeApp {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("SparkMe Application")
    val sc = new SparkContext(conf)

    val fileName = args(0)
    val lines = sc.textFile(fileName).cache

    val c = lines.count
    println(s"There are $c lines in $fileName")
  }
}