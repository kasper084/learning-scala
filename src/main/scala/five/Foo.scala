package some
package five

object Foo extends App {
  val list = List(1,2,3,4,5,6,7,8,9,10,11,12,13,33,55,66,77,88,99)
  println(foo(list)) //6

  def foo(list: List[Int]): Int = {
    list.find(e => e % 3 == 0).map(e => e * 2).getOrElse(0)
  }
}
