// Task 5.2.1: main program

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Please enter just the radius")
    }
    val radius = args[0].toDouble()
    val area = circleArea(radius)
    val perimeter = circlePerimeter(radius)
    println("Area: %.4f".format(area))
    println("Perimeter: %.4f".format(perimeter))
}
