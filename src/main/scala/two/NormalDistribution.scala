package some
package two

import scala.math.{pow, sqrt}

object NormalDistribution {
  def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
    val c = x - mu
    val d = 2 * math.Pi
    math.exp(- pow(c, 2) / pow(d, 2)) / sigma / sqrt(d)
  }
}
