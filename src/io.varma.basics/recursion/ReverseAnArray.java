package com.app.varma.basics.recursion;

import java.util.Arrays;
import java.util.Collections;

/*
 * Approach: The recursive method has an approach almost similar to the iterative one. The approach has been broken down into some steps for simplicity.

Create a function that takes an array ,start index and end index of the array as parameters.
Swap the elements present  at start and end index, 
The portion of array left to be reversed is arr[start+1,end-1]. Make a recursive call to reverse the rest of array. While calling recursion pass start +1  and end – 1 as parameters for the shrinked array. Repeat step 2.
Continue recursion as long as ‘start < end’ condition is satisfied. This is the base case for our recursion.
 */
public class ReverseAnArray {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5, 6 };
		Integer[] input2 = { 1, 2, 3, 4, 5, 6, 7 };  //To reverse using collection please note that we need to use Object classes instead of premitive classes.

		int start = 0;
		int end = input.length - 1;
		printArray(input);
		System.out.println("After Reverse-1 \n");
		
		reverseAnArray(input, start, end);
		printArray(input);
		
		
		System.out.println("*********************");
		printArray(input2);
		reverseUsingCollection(input2);
		System.out.println("After Reverse-2 Using collection \n");
		printArray(input2);
		

	}

	private static void reverseUsingCollection(Integer[] input2) {
		
		Collections.reverse(Arrays.asList(input2));
		
		
	}

	private static void printArray(int[] input) {
		for(int n: input) {
			System.out.print(n);
		}
	}
	
	private static void printArray(Integer[] input) {
		for(Integer n: input) {
			System.out.print(n);
		}
	}

	private static void reverseAnArray(int[] input, int start, int end) {
		if (start < end) {
			int temp = input[start];
			input[start] = input[end];
			input[end] = temp;
			reverseAnArray(input, start + 1, end - 1);
		}

	}

}
