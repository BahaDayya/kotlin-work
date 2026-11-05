// Task 13.4: Money class

data class Money(var euros: Int, var cents: Int) {

    init {
        if (euros < 0 || cents < 0) {
            throw IllegalArgumentException("money and cents cannot be negative")
        }
        if (cents > 99) {
            val extraEuro = cents / 100
            val newCents = cents % 100
            euros += extraEuro
            cents = newCents
        }

    }

    operator fun plus(other: Money) = Money(euros + other.euros, cents + other.cents)
}
