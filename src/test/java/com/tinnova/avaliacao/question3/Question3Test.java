package com.tinnova.avaliacao.question3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question3Test {

    @Test
    public void testFactorialOfFour() {
        long expected = 24;
        long factorial = Question3.factorial(4);
        assertEquals(expected, factorial);
    }

    @Test
    public void testFactorialOfFive() {
        long expected = 120;
        long factorial = Question3.factorial(5);
        assertEquals(expected, factorial);
    }

    @Test
    public void testFactorialOfSix() {
        long expected = 720;
        long factorial = Question3.factorial(6);
        assertEquals(expected, factorial);
    }
}
