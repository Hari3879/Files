package com.ojas.dailytask;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class SmallestPositiveMissingNumber {
	public static int  smallestPositiveMissingNumber(int[] arr) {
    Set<Integer> distinct = Arrays.stream(arr).boxed().collect(Collectors.toSet());
    int index = 1;
    while (true)
    {
        if (!distinct.contains(index)) {
            return index;
        }
        index++;
    }
}
	public static void main(String[] args) {
		 int[] arr = {1,2,3,4,5};
		 int[] arr1={0,-10,1,3,-20};
		 
	        System.out.println("The smallest missing positive number from the array is "
	                + smallestPositiveMissingNumber(arr));
	        System.out.println("The smallest missing positive number from the array is "
	                + smallestPositiveMissingNumber(arr1));

	}

}
