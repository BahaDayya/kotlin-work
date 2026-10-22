// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({
    // Write your tests in here    


    "Marks 0 to 39 gives a Fail" {
    withClue("Mark=0") {grade(0) shouldBe "Fail"}
    withClue("Mark=20") {grade(20) shouldBe "Fail"}
    withClue("Mark=39") {grade(39) shouldBe "Fail"}
    }

    "Marks 40 to 69 gives a Pass" {
    withClue("Mark=40") {grade(40) shouldBe "Pass"}
    withClue("Mark=50") {grade(50) shouldBe "Pass"}
    withClue("Mark=69") {grade(69) shouldBe "Pass"}
    }

    "Marks 70 to 100 gives a Distinction" {
    withClue("Mark=70") {grade(70) shouldBe "Distinction"}
    withClue("Mark=80") {grade(80) shouldBe "Distinction"}
    withClue("Mark=100") {grade(100) shouldBe "Distinction"}
    }

    "Marks 101 and above gives a ?" {
    withClue("Mark=101") {grade(101) shouldBe "?"}
    withClue("Mark=1000") {grade(1000) shouldBe "?"}
    }

    "Marks -1 and below gives a ?" {
    withClue("Mark=-1") {grade(-1) shouldBe "?"}
    withClue("Mark=-1000") {grade(-1000) shouldBe "?"}
    }
})
