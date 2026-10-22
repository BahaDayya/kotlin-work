// Task 5.1.2: main program

fun main(args: Array<String>) {
    if (args.size > 2 || args.size == 0) { // No arguments, and more than 2 arguments arent accepted
        println("Please give the number of rolls, and dice number (defaults to D6)")
        return
    }
    val numberOfRolls = args[0].toInt() // This argument is always needed

    if (args.size == 2) { // Give the dice number (2nd command line argument) if given
    val dieNumber = args[1].toInt() // This argument is only needed if explicitly given
        for (n in 1..numberOfRolls) {
            rollDie(dieNumber)
        }
    }

    else {
        for (n in 1..numberOfRolls) { // Otherwise, just roll a D6
            rollDie()
        }
    }
}
