// Task 12.5.3: demo program for class with custom setter

import kotlinx.datetime.LocalDate
fun main() {
    val guyOneDate = LocalDate(2007,4,23)
    val guyOne = Person("Sawyer Cowley", guyOneDate)
    guyOne.name = ""
    println("Name: ${guyOne.name}\nDate of Birth: ${guyOne.birth}\nMarried?: ${guyOne.isMarried}")
}
