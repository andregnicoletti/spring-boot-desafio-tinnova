package com.tinnova.avaliacao.question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question1Test {

    private final Question1 question1 = new Question1();

    @Test
    public void testPercentValidVotes() {
        double expected = 80.0;
        Double actual = question1.percentValidVotes();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testPercentBlankVotes() {
        double expected = 15.0;
        Double actual = question1.percentBlankVotes();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testPercentNullVotes() {
        double expected = 5.0;
        Double actual = question1.percentNullVotes();
        assertEquals(expected, actual, 0.001);
    }

}
