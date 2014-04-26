package com.bojug.scala

object Definitions extends App {

  def fun(x: Int) = {
    val result = x            // scala variable definition
    result
  }

  def fun1(x: Int) = x        // scala variable definition
}


class Sample(x: Int, p: Int) {
  def instMeth(x: Int, y: Int) = x + y
}

object Sample {
  def staticMeth(x: Int, y: Int) = x * y
}