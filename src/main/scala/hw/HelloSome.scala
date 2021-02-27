package some
package hw

import scala.io.StdIn.readLine

object HelloSome {
  def main(args: Array[String]): Unit = {
    println("Enter you name below:")
    val inputLine = readLine()
    println(s"hello, $inputLine!")
  }
}
