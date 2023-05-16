package com.ojas.nayatasks;

import java.util.HashSet;
import java.util.Set;

public class SumOfArrayElements {
	public static int sumOfArray(int[] arr) {
	    if (arr == null || arr.length == 0) {
	        return -1; 
	    }
	    
	    Set<Integer> set = new HashSet<Integer>();
	    int sum = 0;
	    
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] < 0) {
	            return -2; 
	        }
	        
	        if (!set.contains(arr[i])) {
	            sum += arr[i];
	            set.add(arr[i]);
	        }
	    }
	    
	    return sum;
	}


	public static void main(String[] args) {
		int[] arry= {1, 2, 3, 2, 4, 1};
		System.out.println(sumOfArray(arry));

	}

}
