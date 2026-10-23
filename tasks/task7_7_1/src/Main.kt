// Task 7.7.1: program to compute stats for a numeric dataset

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Please enter one path to a list of numbers")
    }
    val floatingPointList = readData(args[0])
    displayStats(floatingPointList)
}
