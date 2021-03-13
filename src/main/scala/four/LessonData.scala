package some
package four

object LessonData extends App {

  val list = List(8, 11, 12)

  def searchInArray(cond: Int => Boolean, array: List[Int]): List[Int] = {
    array.filter(cond)
  }

  val searchOdd: List[Int] => List[Int] = LessonData.searchInArray(_ % 2 == 1, _)

  println(searchOdd(list)
    //https://scastie.scala-lang.org/ gives output: List (11)
}
