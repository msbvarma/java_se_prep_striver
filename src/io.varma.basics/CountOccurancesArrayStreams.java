package com.app.varma.basics;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurancesArrayStreams {

	public static void main(String[] args) {
		int[] input = {2,3,4,4,5,1,2,2,2};
		Arrays.stream(input).boxed().collect(Collectors.groupingBy(s -> s)).
		forEach((k,v) -> System.out.println(k + "="+v.size()));
		
		String s ="aabcccde";
		Map<Character, Long> counMap = s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		System.out.println(counMap);
	}

}
