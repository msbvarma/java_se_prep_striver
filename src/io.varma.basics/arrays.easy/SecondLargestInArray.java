package com.app.varma.basics.arrays.easy;

import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] inputArray = {111, 12, 3, 4, 55, 22, 4, 100};
        findSecondLargest(inputArray);
        findSecondLargestUsingArrays(inputArray);
    }

    private static void findSecondLargestUsingArrays(int[] inputArray) {
        Arrays.sort(inputArray);
        System.out.println("Second Largest is:" + inputArray[inputArray.length - 2]);

        /*Time Complexity: O(NlogN), For sorting the array
          Space Complexity: O(1)*/
    }

    private static void findSecondLargest(int[] inputArray) {
        int max = inputArray[0], secondMax = 0;
        for (Integer i : inputArray) {
            if (i > max) {
                secondMax = max;
                max = i;
            } else if (i < max && i > secondMax) {
                secondMax = i;
            }
        }
        System.out.println("Max:" + max + " Second Max:" + secondMax);
    }
    /*
    Time Complexity: O(N)
    Space Complexity: O(1)
     */
}
