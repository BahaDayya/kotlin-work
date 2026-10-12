// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
        println("Only one argument please")
        System.exit(2)
    }
    val odd_sum_limit = args[0].toLong()
    // Unsigned as to allow for higher positive numbers
    var total = 0UL
    var adder = 1UL
    // add the last odd number (1 on first iteration) to that number + 2,
    // till you reach the given limit
    for (n in 2..odd_sum_limit step 2) {
        total = total + adder
        adder += 2U
    }
    println("$total")
}
