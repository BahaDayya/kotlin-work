// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("NO!")
        System.exit(2)
    }

    var current_temp_farenheit = 0f
    var current_temp = args[0].toFloat()
    val maximum_temp = args[1].toFloat()
    val increment = args[2].toFloat()
    val t = Terminal()

    t.println(table {
        borderStyle = blue
        header {
            style = red
            row("Celsius", "Farenheit")
        }
        body {
            style = magenta
            align = TextAlign.LEFT
            while (current_temp <= maximum_temp) {
                current_temp_farenheit = current_temp * 32
                row("%.1f".format(current_temp), "%.1f".format(current_temp_farenheit))
                current_temp += increment
            }
        }
    })
}

