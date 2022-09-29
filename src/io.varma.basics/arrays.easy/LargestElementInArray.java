package com.app.varma.basics.arrays.easy;

import java.util.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] inputArray = { 111, 2, 3, 4, 55, 22, 4, 0};
        findLargestUsingArrays(inputArray);
        
        findLargestUsingIteration(inputArray);
    }

    private static void findLargestUsingIteration(int[] inputArray) {
        int max = inputArray[0];
        for (Integer i : inputArray){
            if(i > max){
                max =i;
            }
        }
        System.out.println("Max value is:"+max);
        // Time Complexity: O(n)
        // Space Complexity: O(n)
    }

    private static void findLargestUsingArrays(int[] inputArray) {
        Arrays.sort(inputArray);
        System.out.println("Input Array after sorting: "+ inputArray);
        System.out.println("Largest is:"+ inputArray[inputArray.length-1]);

        // Time Complexity: O(N*log(N))
        // Space Complexity: O(n)
    }
}
