package com.tinnova.avaliacao.question2;

import java.util.Arrays;

public class Question2 {

    public static final Integer[] ORIGINAL_ARRAY = {5, 3, 2, 4, 7, 1, 0, 6};

    public Integer[] bubbleSort(Integer[] array) {
        Integer[] values = array.clone();
        for (int i = 0; i <= (values.length - 2); i++) {
            for (int j = (i + 1); j <= (values.length - 1); j++) {
                if (values[i] > values[j]) {
                    int temp = values[j];
                    values[j] = values[i];
                    values[i] = temp;
                }
            }
        }
        return values;
    }

    public static void main(String[] args) {
        Question2 question2 = new Question2();
        System.out.println("Original array: " + Arrays.asList(ORIGINAL_ARRAY));
        System.out.println("Ordered array: " + Arrays.asList(question2.bubbleSort(ORIGINAL_ARRAY)));
    }

}
