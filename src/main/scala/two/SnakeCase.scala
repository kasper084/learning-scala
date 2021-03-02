package some
package two

import scala.io.StdIn.readLine

object SnakeCase {
  def main(args: Array[String]): Unit = {
    println("Enter text")
    println(regexPattern(getString()))
  }

  def regexPattern(line: String): String  = {
    val alphabetic = """([a-z]+)""".r // checks if string is consisted of lower case letter only
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
