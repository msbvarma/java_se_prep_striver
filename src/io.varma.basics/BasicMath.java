package com.app.varma.basics;

public class BasicMath {
    public static void main(String[] args) {
        int number = 9492;

        countDigits(number);
        count_digits(number);

        reverseANumber(number);

    }

    private static void reverseANumber(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number = number / 10;
        }
        System.out.println(reverse);
    }

    private static void countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        System.out.println(count);
    }

    static void count_digits(int n) {
        int digits = (int) Math.floor(Math.log10(n) + 1);
        System.out.println(digits);
    }
}
