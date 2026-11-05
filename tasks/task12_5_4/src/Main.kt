// Task 12.5.4: demo program for class with a computed property

import kotlinx.datetime.LocalDate
fun main() {
    val guyOneDate = LocalDate(2007,4,23)
    val guyOne = Person("Sawyer Cowley", guyOneDate)
    guyOne.name = ""
    println("Name: ${guyOne.name}\nDate of Birth: ${guyOne.birth}\nIn Years: ${guyOne.age}\nMarried?: ${guyOne.isMarried}")
}
