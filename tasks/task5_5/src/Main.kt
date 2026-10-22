// Task 5.5: main program

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Please enter only 2 words")
        return
    }
    if (args[0] anagramOf args[1]) {
        println("They're anagrams!")
        return
    }
        else {
            println("They're not anagrams!")
            return
        }
    }
