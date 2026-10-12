// Task 4.7: finding the longest line in a file
import kotlin.io.path.readText

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("\nPlease give one valid file path")
    }
    val path = java.io.File("${args[0]}")
    path.useLines {
        var lineNumber = 1
        var lineSize = 0
        var maxLineNumber = 0
        for (line in it) {
            if (line.length >= lineSize) {
                lineSize = line.length
                maxLineNumber = lineNumber
            }
            lineNumber += 1
        }
        println("Line #$maxLineNumber\nSize $lineSize")
    }
}
