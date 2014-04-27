package com.bojug.scala.collections

object MultipleAssignmentApp {
  val people = List(Person("John", 23), Person("Jack", 13), Person("Mary", 17), Person("May", 43))
  val (minors, adults) = people partition (_.age < 18)
  println(minors)
  println(adults)
}

case class Person(name: String, age: Int)