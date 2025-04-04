package com.tinnova.avaliacao.question4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question4Test {

    @Test
    public void testSumOf10() {
        long expected = 23;
        long factorial = Question4.sumOfMultiplesOf3Or5(10);
        assertEquals(expected, factorial);
    }

}
