// Task 12.3.2: demo of Person class with secondary constructor

import kotlinx.datetime.LocalDate

fun main() {
    val guyOneDate = LocalDate(2007,4,23)
    val guyOne = Person("", guyOneDate)  
    println("Name: ${guyOne.name}\nDate of Birth: ${guyOne.birth}\nMarried?: ${guyOne.isMarried}")
}
