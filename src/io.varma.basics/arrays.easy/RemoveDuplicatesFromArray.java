package com.app.varma.basics.arrays.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {
    //Given array is sorted
    public static void main(String[] args) {
        Integer[] inputArray = {111, 2,2, 3,3, 4, 55, 22, 4, 0};
        List arrayList =Arrays.asList(inputArray);
        System.out.println("Streams:"+arrayList.stream().collect(Collectors.toSet()));
        Set<Integer> finalArray = new HashSet<Integer>(arrayList);
        System.out.println(finalArray);
    }
}
