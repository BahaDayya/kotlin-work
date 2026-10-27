// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
        println("Please enter just a file path")
        return
    }

    val weatherList = fetchData(args[0])

    // Gives Record -> Pair<String, Double>
    val lowest = weatherList.minBy { it.second }
    val highest = weatherList.maxBy { it.second }

    // Using average function in Funcs.kt (can be swap by removing lambda function in 2nd print with $average)
    val average = averageTemp(weatherList)

    println("\nHighest:\nStation: %s\nTemperature (C): %.2f\n\nLowest\nStation: %s\nTemperature (C): %.2f\n\n".format(highest.first, highest.second,lowest.first, lowest.second))

    println("Average: ${weatherList.sumOf {it.second} / weatherList.count() }") 

} 
