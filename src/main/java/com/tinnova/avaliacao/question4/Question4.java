package com.tinnova.avaliacao.question4;

public class Question4 {

    public static long sumOfMultiplesOf3Or5(long number) {
        long sum = 0;
        for (long n = 1; n < number; n++) {
            if (n % 3 == 0 || n % 5 == 0) {
                sum += n;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        long number = args.length > 0 ? Long.parseLong(args[0]) : 0;
        System.out.println("Input number: " + number);
        System.out.println("Sum of multiples of 3 or 5: " + sumOfMultiplesOf3Or5(number));
    }

}
