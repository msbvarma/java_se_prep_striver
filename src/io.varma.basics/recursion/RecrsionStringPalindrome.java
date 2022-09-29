package com.app.varma.basics.recursion;

import java.util.stream.IntStream;

public class RecrsionStringPalindrome {

	public static void main(String[] args) {
		String s = "6 AB A 6";

		int start = 0;
		int end = s.length() - 1;
		System.out.println("-->"+checkPalindromeRecursion(s, start, end));

		checkPalindromeUsingSB(s);
		
		System.out.println("Streams-->"+isPalindromeUsingIntStream(s));

	}
	
	public static boolean isPalindromeUsingIntStream(String text) {
	    String temp  = text.replaceAll("\\s+", "").toLowerCase();
	    
	    
	    return IntStream.range(0, temp.length() / 2)
	      .noneMatch(
	    		  i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1)
	    		  );
	}

	private static boolean checkPalindromeRecursion(String s, int left, int right) {
		while (left < right) {
			char l = s.charAt(left), r = s.charAt(right);
			if (!Character.isLetterOrDigit(l))
				left++;
			else if (!Character.isLetterOrDigit(r))
				right--;
			else if (Character.toLowerCase(l) != Character.toLowerCase(r))
				return false;
			else {
				left++;
				right--;
			}
		}
		return true;
	}

	private static void checkPalindromeUsingSB(String s) {
		StringBuilder sbr = new StringBuilder(s);
		System.out.println(s.equalsIgnoreCase(sbr.reverse().toString()));
	}

}
