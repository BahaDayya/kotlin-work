// Task 5.1.2: main program

fun main(args: Array<String>) {
    if (args.size > 2) {
        println("Please give the number of rolls, then the dice number")
    }
    val numberOfRolls = args[0].toInt()
    val dieNumber = args[1].toInt()
        for (n in 1..numberOfRolls) {
            rollDie(dieNumber)

        }
}
