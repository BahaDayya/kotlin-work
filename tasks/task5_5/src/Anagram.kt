// Task 5.5: anagramOf() function

infix fun String.anagramOf(secondThis: String): Boolean {
    if (this.length != secondThis.length) {
        return false
    }
    val firstChars = this.lowercase().toList().sorted()
    val secondChars = secondThis.lowercase().toList().sorted()
    return firstChars == secondChars
}
