package com.bojug.scala.collections

object UsingMapsApp extends App {
  val m = Map(1 -> "ABC", 2 -> "DEF", 3 -> "GHI")
  println(m)
  println(m(2))
  
  val newMap = m + (4 -> "JKL")
  println(newMap)
  
  val flippedMap = newMap map { case (key, value) => (value, key) }
  println(flippedMap)
}