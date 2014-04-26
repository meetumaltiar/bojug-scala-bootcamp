package com.bojug.scala

object PatternMatchApp extends App {
  val employee = Employee("john")

  val result = employee match {
    case Employee("john") => "Hello John!"
    case _ => "Hello there!"
  }

  println(result)
}

case class Employee(name: String)