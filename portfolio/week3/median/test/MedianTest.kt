// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here

    "Gives correct number when size=1" {
        median(listOf(1f)) shouldBe 1f
    }

    "Gives correct number when size=2" {
        median(listOf(2.73f,4.29f)) shouldBe (3.51f plusOrMinus(tolerance))
    }

    "Gives correct number when size=3" {
        median(listOf(2.73f,4.29f,15.42f)) shouldBe 4.29f
    }

    "Gives correct number when size=4" {
        median(listOf(2.73f,4.29f,15.42f,52.52f)) shouldBe (9.855f plusOrMinus(tolerance))
    }
})
