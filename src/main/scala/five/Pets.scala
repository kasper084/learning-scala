package some
package five

object Pets extends App {
  val pet = Pet("Nakamura", "meow")
  val regex = "([\\w]*[01]+[\\w]*)".r

  val kind = pet match {
    case Pet(_, "meow") => "cat"
    case Pet(_, "nya") => "cat"
    case Pet("Rex", _) => "dog"
    case Pet(_, regex(_)) => "robot"
    case _ => "unknown"
  }
  println(kind)
}
}
