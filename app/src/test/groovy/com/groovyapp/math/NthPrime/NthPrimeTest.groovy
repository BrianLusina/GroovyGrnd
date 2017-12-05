package com.groovyapp.math.NthPrime

import org.junit.Test

import static org.junit.Assert.assertEquals

class NthPrimeTest {
    @Test
    void testFirst() {
        assertEquals 2, new NthPrime().nth(1)
    }

    @Test
    void testSecond() {
        assertEquals 3, new NthPrime().nth(2)
    }

    @Test
    void testSixth() {
        assertEquals 13, new NthPrime().nth(6)
    }

    @Test
    void testBigPrime() {
        assertEquals 104743, new NthPrime().nth(10001)
    }

    @Test(expected = ArithmeticException)
    void testLessThan1() {
        new NthPrime().nth(0)
    }
}
