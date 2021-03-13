package some
package five

object PracticalF {
  val log: PartialFunction[Double, Double] = {
    case d if d > 0 => math.log(d)
  }
}
