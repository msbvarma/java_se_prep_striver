package com.app.varma.basics.arrays.easy;

public class FindAMissingNumber {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 7};
        int n = 7;

        int total_sum = n * (n + 1) / 2;
        int array_sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            array_sum = array_sum + inputArray[i];
        }
        System.out.println("Missing number is:"+(total_sum-array_sum));
    }
}
