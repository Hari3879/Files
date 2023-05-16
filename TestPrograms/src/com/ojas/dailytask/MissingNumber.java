package com.ojas.dailytask;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingNumber {
	public static int missingNumber(int[] arr) {
		Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
		int index = 1;
		while (true)
		{
			if (!set.contains(index)) {
				return index;
			}
			index++;
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println("missing smallest numberis:"+missingNumber(arr));

	}

}
