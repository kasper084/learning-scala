package some
package two

import scala.io.StdIn.readLine

object SnakeCase {
  def main(args: Array[String]): Unit = {
    println("Enter text")
    regexPattern(getString())
  }

  def regexPattern(line: String)  = {

    val alphabetic = "([a-z]+)((_)([a-z]+))*".r
     line match {
       case alphabetic ("_") => println("true")
       case _ => println("false")
     }
  }

  def getString(): String = {
    val line = readLine()
    line
  }

}
