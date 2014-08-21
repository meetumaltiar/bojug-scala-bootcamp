package com.bojug.scala.function

object FunctionApp extends App {
  val list = "a" :: "b" :: Nil

  val resultList = list map {
    s => s.toUpperCase
  }

  // => "A" :: "B" :: Nil

  val upperCaseFunction: String => String = (s: String) => s.toUpperCase()

  val sameResultList = list map {
    s => upperCaseFunction(s)
  }

  val upperCaseFunction1 = new Function1[String, String] {
    def apply(s: String) = {
      s.toUpperCase()
    }
  }

  val againSameResultList = list map {
    s => upperCaseFunction1(s)
  }
}