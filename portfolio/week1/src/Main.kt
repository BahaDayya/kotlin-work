// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    val sideOne = args[0].toDouble(); val sideTwo = args[1].toDouble(); val sideThree = args[2].toDouble()
    val perimeter = 0.5 * (sideOne + sideTwo + sideThree)
    val area = sqrt(perimeter*(perimeter - sideOne)*(perimeter - sideTwo)*(perimeter - sideThree))
    println("Area = %.5f".format(area))

}
