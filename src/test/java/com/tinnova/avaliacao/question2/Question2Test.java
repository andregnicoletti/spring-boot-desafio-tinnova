package com.tinnova.avaliacao.question2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Question2Test {

    private final Question2 question2 = new Question2();

    @Test
    public void testBubbleSort() {
        Integer[] expected = {0, 1, 2, 3, 4, 5, 6, 7};
        Integer[] ordered = question2.bubbleSort(Question2.ORIGINAL_ARRAY);
        assertArrayEquals(expected, ordered);
    }

}
