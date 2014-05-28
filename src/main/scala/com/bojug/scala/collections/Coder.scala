package com.bojug.scala.collections

class Coder(words: List[String]) {

  private val mnemonics = Map(
    '2' -> "ABC", '3' -> "DEF", '4' -> "GHI", '5' -> "JKL",
    '6' -> "MNO", '7' -> "PQRS", '8' -> "TUV", '9' -> "WXYZ")

  /** Invert mnemonics map from chars 'A' ..... 'Z' to '2' ....... '9' */
  private val charCode: Map[Char, Char] = for ((digit, str) <- mnemonics; ltr <- str) yield (ltr -> digit)

  /** Maps a word to digit string it can represent e.g. "java" -> "5282" */
  private def wordCode(word: String): String = word.toUpperCase map charCode

  /** A map from digit strings to the words that represent them, e.g. "5282" -> Set("JAVA", "KATA", "LAVA", ...) */
  private val wordsForNum: Map[String, List[String]] = (words groupBy wordCode) withDefaultValue List()

  /** Return all ways to encode a number as a list of words */
  def encode(number: String): Set[List[String]] = {
    number.isEmpty match {
      case true => Set(List())
      case false =>
        {
          for {
            splitPoint <- 1 to number.length
            word <- wordsForNum(number take splitPoint)
            rest <- encode(number drop splitPoint)
          } yield word :: rest
        }.toSet
    }
  }

  /** Maps a number to all word phrases that can represent it */
  def translate(number: String): Set[String] = encode(number) map (_ mkString " ")
}

object Coder extends App {
  val coder = new Coder("Scala" :: "rocks" :: List("hello"))
  println(coder.translate("7225276257"))
}