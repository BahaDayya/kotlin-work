// Task 12.8.2: program to manipulate playing cards

fun main() {

    val deck = buildList {
        for (s in Suit.entries) {
            for (r in Rank.entries) {
                add(Card(r,s))
            }
        }
    }
    println(deck)
    val shuffledDeck = deck.shuffled()
    println(shuffledDeck)
}
