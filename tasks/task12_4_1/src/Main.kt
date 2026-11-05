// Task 12.4.1: main program

fun main() {
    val circlePoint = Point(0.0, 0.0)
    val pointOne = Point(2.0, 0.0)
    val pointTwo = Point(3.0, 0.0)
    val pointThree = Point(5.0, 0.0)
    val circleOne = Circle(circlePoint, 3.0)

    println("""
    (Area and Perimeter rounded to two decimal places)
    Circle Center: (${circleOne.centre.x},${circleOne.centre.y})
    Radius: ${circleOne.radius}
    Area: %.2f
    Perimeter: %.2f
    Is it in the circle? (True or False):
    (${pointOne.x},${pointOne.y}) - ${circleOne.contains(pointOne)}
    (${pointTwo.x},${pointTwo.y}) - ${circleOne.contains(pointTwo)}
    (${pointThree.x},${pointThree.y}) - ${circleOne.contains(pointThree)}
    """.format(circleOne.area(),circleOne.perimeter()))
}
