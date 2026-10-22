// Task 5.4.1: main program

fun main(args: Array<String>) {
    if (args.size != 1) {
        return
    }
    println("The string is over 20 characters (True or False):\n${args[0].isTooLong()}")
}
