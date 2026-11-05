// Task 12.8.1: demo program for Day enum class

class NotEnumException(message: String) : Exception(message)

fun main(args: Array<String>) {
    check(args.size == 1)  { "Too many or too little arguments (only accepts 1 string 'day'.)" }
    check(Day.valueOf(args[0]) in Day.entries) { "Invalid day, please mind spelling and include the first letter as uppercase."  }
    val day = Day.valueOf(args[0]) 
    println("You entered ${day}.")

}
