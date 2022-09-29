package com.app.varma.basics.arrays.easy;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] inputArray = { 2, 3, 4, 5,1};
        System.out.println("Is sorted:"+checkIfSorted(inputArray));
    }

    private static boolean checkIfSorted(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            if( inputArray[i-1] > inputArray[i]){
                return false;
            }
        }
        return true;
    }
    // O(n)
}
