// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Write tests here
    @Test
    fun `Mark of 0 gives a Pass`() {
        assertEquals("Fail", grade(0))
    }

    @Test
    fun `Mark of 25 gives a Pass`() {
        assertEquals("Fail", grade(25))
    }   

    @Test
    fun `Mark of 39 gives a Pass`() {
        assertEquals("Fail", grade(39))
    }

    @Test
    fun `Mark of 40 gives a Pass`() {
        assertEquals("Pass", grade(40))
    }   

    @Test
    fun `Mark of 45 gives a Pass`() {
        assertEquals("Pass", grade(45))
    }

    @Test
    fun `Mark of 70 gives a Pass`() {
        assertEquals("Pass", grade(70))
    }   

    @Test
    fun `Mark of 70 gives a Distinction`() {
        assertEquals("Distinction", grade(70))

    }

    @Test
    fun `Mark of 75 gives a Pass`() {
        assertEquals("Distinction", grade(75))
    }

    @Test
    fun `Mark of 100 gives a Pass`() {
        assertEquals("Distinction", grade(100))
    }   

    @Test
    fun `Mark of 101 gives a ?`() {
        assertEquals("?", grade(101))
    }

    @Test
    fun `Mark of -1 gives a ?`() {
        assertEquals("?", grade(-1))
    }   

    @Test
    fun `Mark of 1000 gives a ?`() {
        assertEquals("?", grade(1000))
    } 

    @Test
    fun `Mark of -1000 gives a ?`() {
        assertEquals("?", grade(-1000))
    }   

}
