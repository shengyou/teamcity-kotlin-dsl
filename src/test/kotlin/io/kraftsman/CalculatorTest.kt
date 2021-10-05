package io.kraftsman

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculatorTest {

    @Test
    internal fun shouldReturnTwoWhenOnePlusOne() {
        val calculator = Calculator()

        assertEquals(2, calculator.plus(1, 1))
    }
}