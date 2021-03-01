package some
package two

import scala.math.BigDecimal.RoundingMode.HALF_UP

object PotatoCrispsWeight {
  def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
    val mass: BigDecimal = weight * (1-potatoWaterRatio) / (1-crispsWaterRatio)
    mass.setScale(scale = 5, mode = HALF_UP)
  }
}
