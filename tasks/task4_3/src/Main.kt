// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    if (args.size != 3) {
        println("NO!")
        System.exit(2)
    }

    val num0 = args[0].toDouble().roundToInt(); val num1 = args[1].toDouble().roundToInt(); val num2 = args[2].toDouble().roundToInt()

    val average = (num0 + num1 + num2) / 3

    val result = when (average) {
        in 0..39   -> "Fail"
        in 40..69  -> "Pass"
        in 70..100 -> "Wow"
        else       -> "?"
    }

    println("Average: $average.toString()\nResult: $result")
}
