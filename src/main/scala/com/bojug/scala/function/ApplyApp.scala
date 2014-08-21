package com.bojug.scala.function

object ApplyApp extends App {
  val error = new Logger(ERROR)
  // apply is called
  error("Network error")
}

class Logger(val level: LEVEL) {
  def apply(message: String) = {
    // pass to LOG4J
    LOG4J.log(level, message)
  }
}

object LOG4J {
  def log(level: LEVEL, message: String) = println(s"$level: $message")
}

trait LEVEL
case object ERROR extends LEVEL
case object INFO extends LEVEL