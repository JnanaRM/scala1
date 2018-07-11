package demo

object List_ex extends App {
  val input = List(List(List("pupu","is","c")))
  val result = input.flatMap(x => x).flatMap(x => x)
  println(result)

}
