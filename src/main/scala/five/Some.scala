package some
package five

import scala.io.StdIn.readInt

object Some {
  def main(args: Array[String]): Unit = {
    println("Enter int")
    val n = readInt()
    for {
      i <- Range(1, n)
      j <- Range(1, n)
    } if (BigInt(i).gcd(BigInt(j)) == 1) println(s"$i $j")
  }
}
