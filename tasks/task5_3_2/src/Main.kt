// Task 5.3.2: main program
// Not programmed to deal with user not following format using one cmd line argument

fun main(args: Array<String>) {

    // Only one argument is accepted
    if (args.size != 1) { 
        println("Please give the number of rolls and dice type in this format:\n'(number)d(dice)' (e.g '5d6' for 5 rolls of the D6)")
        return
    }

    // Splits into a list of two items [number of rolls, dice number ("" if not given)]
    val numberAndType = args[0].split('d')
    val numberOfRolls = numberAndType[0].toInt()
    var noType = 0

    // If only rolls are given (e.g "5d") set noType to 1
    if (numberAndType[1] == "") { 
        noType = 1 
    }

    var cumulativeScore: Int = 0

    // If noType is 0, then the argument has the dice number (e.g "5d6")
    if (noType == 0) {
        // Dice number is only needed if explicitly given, so add it in the if statement
        val dieNumber = numberAndType[1].toInt() 
        // Test roll (for it not to cause a print, printing is now in each for loop, not in Dice.kt)
        var result: Int = rollDie(dieNumber) 

        // a return of -1 from Dice.kt in case the user gives an invalid dieNumber
        if (result == -1) {
            println("Error: cannot have a $dieNumber-sided die")
            return
        }

        println("Rolling a D$dieNumber...")

        for (n in 1..numberOfRolls) {
            result = rollDie(dieNumber)
            println("You rolled $result")
            cumulativeScore += result
        }

    }

    else {
        println("Rolling a D6...")

        for (n in 1..numberOfRolls) { // Otherwise, just roll a D6
            var result: Int = rollDie()
            println("You rolled $result")
            cumulativeScore += result
        }

    }

    println("Your total was $cumulativeScore")
}
