package some
package three

object FunctionTasks {
  val accountAmounts = List(100, 200, 500, 300, 700)

  def runTasks(): Unit = {
    fibs(5)
   // sendGift(accountAmounts)
  }

  def fibs(num: Int): Int = {
    if (num == 1) 1
    else if (num == 2) 1
    else fibs(num - 1) + fibs(num - 2)
  }

  def sendGift(currentAmount: Int, gift: => Int) = {
    if (currentAmount >= 500)
      currentAmount + gift
    else
      currentAmount
  }

  def middle[T](data: Iterable[T]): T = {
    data.splitAt(data.size / 2)._2.head
  }

  require(middle("Scala") == 'a')
  require(middle(Seq(1, 7, 5, 9)) == 5)
}
