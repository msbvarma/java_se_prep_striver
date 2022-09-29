package com.app.varma.basics.hashing;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurances {

	public static void main(String[] args) {
		int[] input = {2,3,4,4,5,1,2,2,2};
		
		//To print
		
		Arrays.stream(input).boxed().collect(Collectors.groupingBy(i->i)).forEach((k,v)-> System.out.println(k +"occured "+v.size()+" times"));
		
		//To get to Map
		Map<Integer, Long> countMap = Arrays.stream(input).mapToObj(i -> (int)i).collect(Collectors.groupingBy(in -> in, Collectors.counting()));
				
			System.out.println(countMap);
			
		usingHashMap(input);

	}

	private static void usingHashMap(int[] input) {
		Map<Integer,Integer> countMap = new HashMap<>();
		
		for(Integer i : input) {
			if(countMap.containsKey(i)) {
				countMap.put(i, countMap.get(i)+1);
			}else {
				countMap.put(i, 1);
			}
		}
		System.out.println("Using Map->"+countMap);
		
	}

}
