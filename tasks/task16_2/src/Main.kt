// Task 16.2: main program

fun main() {
    try{

        val smthnMclaren = Car(80)
        smthnMclaren.drive()

        val smthnCaterham = Car(-1)
        smthnCaterham.drive()
    }
    catch (error: IllegalArgumentException) { println("Car: put some more fuel!") }
}
