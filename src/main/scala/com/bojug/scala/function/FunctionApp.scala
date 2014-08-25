package com.bojug.scala.function

object FunctionApp extends App {
  val list = List("a", "b")

  val resultList = list map {
    s => s.toUpperCase
  }

  val upperCaseFunction: String => String = (s: String) => s.toUpperCase()

  val upperCaseFunction1 = new Function1[String, String] {
    def apply(s: String) = {
      s.toUpperCase()
    }
  }

  val sameResultList = list.map(upperCaseFunction)

  val againSameResultList = list.map(upperCaseFunction1)
}