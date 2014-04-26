package com.bojug.scala

object LikeAScript extends App {
  var capitals = Map("US" -> "Washington", "France" -> "Paris")
  println(capitals)
  capitals += ("Japan" -> "Tokyo")
  println(capitals)
  println(capitals("Japan"))
}