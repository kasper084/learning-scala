package some
package two

import scala.io.StdIn.readLine

object SnakeCase {
  def main(args: Array[String]): Unit = {
    println("Enter text")
    println(regexPattern(getString()))
  }

  def regexPattern(line: String): String  = {
    val alphabetic = """"([a-z])"""".r // main problem should be in a pattern
     line match {
       case alphabetic(value) => "true"
       case _ => "false"
     }
  }

  def getString(): String = {
    val line = readLine()
    line
  }

}
