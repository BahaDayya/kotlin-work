// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>
// Add isValidTriangle() and triangleArea() functions here
//

fun isValidTriangle(a: Triangle): Boolean {
    val sideOne = a.first; val sideTwo = a.second; val sideThree = a.third
    if (sideOne < sideTwo + sideThree && sideTwo < sideOne + sideThree && sideThree < sideOne + sideTwo) {
        return true
    }
    else {
        return false
    }
}

fun triangleArea(a: Triangle): Double {
    val sideOne = a.first; val sideTwo = a.second; val sideThree = a.third
    val perimeter = 0.5 * (sideOne + sideTwo + sideThree)
    val area = sqrt(perimeter*(perimeter - sideOne)*(perimeter - sideTwo)*(perimeter - sideThree))
    return area


}

