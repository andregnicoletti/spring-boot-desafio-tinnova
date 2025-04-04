package com.tinnova.avaliacao.question3;

public class Question3 {

    public static long factorial(long number) {
        long result = 1;
        if (number > 0) {
            for (long i = number; i >= 1; i--) {
                result *= i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        long number = args.length > 0 ? Long.parseLong(args[0]) : 0;
        System.out.println("Fatorial of : " + number + "!");
        System.out.println("Result: " + Question3.factorial(number));
    }

}
