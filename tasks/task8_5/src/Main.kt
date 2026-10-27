// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val text = "A wind and a willow chucked a pin pricked picker, Lo"

    val vowelCount = text.howMany { it.lowercase() in "aeiou" }
    println("Vowel Count: $vowelCount")


    val notVowelCount = text.howMany { it.lowercase() !in "aeiou" }
    println("Not vowel Count: $notVowelCount")


    val loneCharacterCount = text.split("""\s+""".toRegex()).count { """\b$it\b""".toRegex().containsMatchIn(text) && it.length == 1 }
    println("Lone characters: $loneCharacterCount")
}
