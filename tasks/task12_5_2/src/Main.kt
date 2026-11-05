// Task 12.5.2: demo program for class with custom getter

import kotlinx.datetime.LocalDate
fun main() {
    val guyOneDate = LocalDate(2007,4,23)
    val guyOne = Person("SawyEer CoWLey", guyOneDate)  
    println("Name: ${guyOne.name}\nDate of Birth: ${guyOne.birth}\nMarried?: ${guyOne.isMarried}")
}
