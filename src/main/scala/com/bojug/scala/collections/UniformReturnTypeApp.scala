package com.bojug.scala.collections

object UniformReturnTypeApp extends App {
  val ys = List(1, 2, 3)
  val xs: Seq[Int] = ys
  val xsResult = xs map (_ + 1)
  val ysResult = ys map (_ + 1)
}