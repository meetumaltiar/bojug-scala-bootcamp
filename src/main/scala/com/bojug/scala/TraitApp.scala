package com.bojug.scala

object TraitApp extends App {
  val c = new C
  println(c.abstractMeth(2))
}

trait T {
  val field = "!"
  def abstractMeth(x: Int)
  def concreteMeth(x: String) = x + field
}

class A

class C extends A with T {
  def abstractMeth(x: Int) = {
    println(s"an abstract method implemented $x")
  }
}