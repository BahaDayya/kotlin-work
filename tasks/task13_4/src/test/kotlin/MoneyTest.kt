// Task 13.4: unit tests for Money class

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class MoneyTest : FreeSpec({
    // Write your unit tests here

    "Can create a Money" {
        val m = Money(2, 99)
        withClue("euros") {m.euros shouldBe 2}
        withClue("cents") {m.cents shouldBe 99}
    }

    "Euro is nonnegative" {
        shouldThrow<IllegalArgumentException> {
            val n = Money(-1,1)
        }
    }

    "Cent is nonnegative" {
        shouldThrow<IllegalArgumentException> {
            val o = Money(1,-1)
        }
    }
    "1.13 + 1.12 = 2.25 Euros" {
        Money(1,12) + Money(1,13) shouldBe Money(2,25) 
    }
    "5 euros and 501 cents should be 10 euros and 1 cent" {
        Money(5, 501) shouldBe Money(10, 1) 
    }
})
