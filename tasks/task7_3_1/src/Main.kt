// Task 7.3.1: list element access
// Doesn't work (see 7.3.2 for working version)
// (hint: just change numList)

fun main() {
    val numList = listOf(10,20,30,60,50,90)
    println("\nList: $numList")
    println("First Item: [${numList[0]}]")
    println("Sliced List: ${numList.slice(2..4)}")
    println(".first: [${numList.first()}]")
    println(".last: [${numList.last()}]")
    numList[0] = 100
    numList.add(1)
    println("New last: [${numList[6]}]")
}
