package some
package five

class MailMatching {

  val olegInput = List("oleg", "oleg@email.com", "7bdaf0a1be3", "a8af118b1a2", "28d74b7a3fe")
  val nameRegex = "([a-zA-Z]+)".r
  val mailRegex = "\\w+@(\\w+.\\w+)".r
  val contactRegex = "([a-zA-Z]+) \\w+@(\\w+.\\w+)".r

  val result = olegInput match {
    case List(nameRegex(name), mailRegex(mail), rest@_*) => s"$name $mail"
    case List(contactRegex(name, mail), rest@_*) => s"$name $mail"
    case _ => "invalid"
  }
  println(result)

}
