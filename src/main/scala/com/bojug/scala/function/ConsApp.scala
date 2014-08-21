package com.bojug.scala.function

object ConsApp extends App {
  val list = List(1, 2, 3, 4, 5)
  // using cons operator
  // Nil is an empty list
  // 1 is head and rest is tail
  val sameList = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
  val againSameList = Nil.::(5).::(4).::(3).::(2).::(1)
  // Method names can contain any character
  // Any method ending in ":" binds to the right
  // If a method takes one argument you can drop dot(.) and parenthesis

  val aString = "Hello" + " world"
  val sameString = "Hello".+(" world")
}