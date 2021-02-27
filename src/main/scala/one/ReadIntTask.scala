package some
package one

import scala.io.StdIn.readInt

object ReadIntTask extends App {

  doSimpleMath()

  def doSimpleMath(): Unit = {
    xMinusY()
    //xAndYAndZ()
  }

  def msg(): Unit = {
    println("Enter int")
  }

  def inputInt(): Int = {
    msg()
    readInt()
  }

  def xMinusY(): Unit = {
    val x = inputInt()
    val y = inputInt()
    val result = x - y
    println(s"$x-$y=$result")
  }

  def xAndYAndZ(): Unit = {
    val x = inputInt()
    val y = inputInt()
    val z = inputInt()
    val result = x * y * z
    println(s"$x*$y*$z=$result")
  }
}
