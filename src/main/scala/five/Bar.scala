package some
package five

object Bar extends App {
  val num = 10
  println(bar(num)) //6

  def bar(n: Int): Option[Int] = {
    Option.apply(n - 4)
  }

  //ex.5.6.2
  def flatten(options: List[Option[Int]]): List[Int] = {
    options.collect{case e if e.nonEmpty => e.get}
  }

}
