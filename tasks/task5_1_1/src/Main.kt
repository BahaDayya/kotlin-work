// Task 5.1.1: main program

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Please enter only 2 words")
        System.exit(2)
    }
    val compareValue = anagrams("${args[0]}","${args[1]}")
    if (compareValue) {
        println("They're anagrams!")
    }
        else {
            println("They're not anagrams!")
        }
        System.exit(3)
    }

