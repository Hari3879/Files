package com.ojas.nayatasks;

public class OddNumberSum {
	public static int getOddSum(int[] arr) {
	    if (arr == null) {
	        return -4;
	    }

	    if (arr.length != 5) {
	        return -1;
	    }

	    int sum = 0;
	    boolean hasOdd = false;

	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] <= 0) {
	            return -2;
	        }
	        if (arr[i] % 2 != 0) {
	            hasOdd = true;
	            sum += arr[i];
	        }
	    }

	    if (!hasOdd) {
	        return -3;
	    }

	    return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr1=  {25,32,4};
		System.out.println(getOddSum(arr1));
		System.out.println(getOddSum(arr));
	}

}
