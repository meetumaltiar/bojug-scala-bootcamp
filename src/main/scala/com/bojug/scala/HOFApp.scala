package com.bojug.scala

object HOFApp extends App {
  val increment = (x: Int) => x + 1
  println(higherOrderFunction(increment, 2))

  def higherOrderFunction(f: Int => Int, x: Int) = f(x) + x
}