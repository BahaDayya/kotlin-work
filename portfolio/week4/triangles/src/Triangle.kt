// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {

    // Add isValidTriangle() and triangleArea() functions here

    val isValidTriangle = (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB)

    val perimeter = sideA + sideB + sideC

    val semiPerimeter = 0.5 * (sideA + sideB + sideC)

    val area = sqrt(semiPerimeter*(semiPerimeter - sideA)*(semiPerimeter - sideB)*(semiPerimeter - sideC))

    override fun toString() = "Triangle($sideA, $sideB, $sideC)"

    init {
        require(isValidTriangle) { "Not a valid triangle" }
    }



}
