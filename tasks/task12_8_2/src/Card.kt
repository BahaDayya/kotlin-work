// Task 12.8.2: class to represent playing cards

class Card(rank: Rank, suit: Suit) {
    val thisRank = rank
    val thisSuit = suit
    val fullname = "$rank of $suit"        
    override fun toString() = "${thisRank}${thisSuit}"
}
