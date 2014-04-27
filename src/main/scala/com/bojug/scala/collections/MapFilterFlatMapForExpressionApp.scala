package com.bojug.scala.collections

object MapFilterFlatMapForExpressionApp {
  val xs = List(1, 2, 3)
  val ys = xs map (x => x + 1)
  println(ys)
  // val ys = xs map (_ + 1)  this is equivalent to map function xs map (x => x + 1)
  val zs = ys filter (_ % 2 == 0)
  println(zs)

  val as = ys map (0 to _)
  println(as)
  val bs = as.flatten
  println(bs)

  // val bs = ys flatMap (0 to _) this is equivalent to above combination of map and flatten

  val fruits = Vector("apples", "oranges", "ananas")
  println(fruits)
  println(fruits groupBy (_.head))

  val likeAMap = for (x <- xs) yield x + 1
  println(likeAMap)
  val likeAFilter = for (x <- likeAMap if x % 2 == 0) yield x
  println(likeAFilter)

  val likeAFlatMap = for (x <- xs; y <- 0 to x) yield y
  println(likeAFlatMap)
}