// Task 12.9: demo program for class implementing Static Factory Method

import kotlinx.datetime.LocalDate

fun main() {
    val p = Person.create("Sarah", LocalDate(2005, 7, 16))
    val firstPerson = Person.create("Sami", LocalDate(2001,1,1))
    val alsoFirstPerson = Person.create("Sami", LocalDate(2001,1,5))
    println(firstPerson.name)
    println(alsoFirstPerson.name)
}
