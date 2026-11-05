// Task 12.4.1: Circle class

import kotlin.math.PI

class Circle(val centre: Point, val radius: Double) {
    
    init {
        require(radius > 0) { "Radius must be nonnegative"  }
    }
    fun area() = PI * radius * radius
    fun perimeter() = 2 * PI * radius
    infix fun contains(check: Point) = check.distanceTo(centre) <= radius
}
