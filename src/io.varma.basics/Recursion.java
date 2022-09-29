package com.app.varma.basics;

public class Recursion {
 static int counter =0;
	public static void main(String[] args) {
		//printNNumbers();
		
		//printNameNTimes(1,10);
		
		//printNto1(10,1);
		
		System.out.println(sumOfNNumbers(6));
		System.out.println(factorial(5));
		int[] input = {2,3,4,5,6};
		reverseAnArray(input,0,4);
		

	}

	private static void reverseAnArray(int[] input,int start,int end) {
		if (start >= end/2)
			return;
		//swap(input[start],input[end-start-1]);
		
		
		
	}

	private static int factorial(int i) {
		if(i==0)
			return 1;
		return i*factorial(i-1);
		
	}

	private static int sumOfNNumbers(int i) {
		if(i<0)
			return 0; 
		return (i + sumOfNNumbers(i-1));
	}

	private static void printNto1(int end, int start) {
		if(start >= end)
			return;
		System.out.println(end);
		printNto1(end-1, start);
		
	}

	private static void printNameNTimes(int start,int end) {
		if (start > end){
			return;
		}
		System.out.println("Recursion");
		printNameNTimes(start+1, end);
	}

	private static void printNNumbers() {
		counter++;
		if (counter == 10) {
			return;
		}
		System.out.println(counter);
		printNNumbers();
	
	}

}
