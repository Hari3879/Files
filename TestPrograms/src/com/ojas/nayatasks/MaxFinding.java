package com.ojas.nayatasks;

public class MaxFinding {
	public static int findMax(int[] arr) {
	    if (arr == null) {
	        return 0;
	    }
	    int negCount = 0;
	    int max = Integer.MIN_VALUE;
	    for (int num : arr) {
	        if (num < 0) {
	            negCount++;
	            if (num > max) {
	                max = num;
	            }
	        } else if (num > max) {
	            max = num;
	        }
	    }
	    if (negCount < 3) {
	        return -1;
	    }
	    return max;
	}
public static void main(String[] args) {
	int[] arr = {1, 2, 3, -3, -6, -6};
	int max = findMax(arr);
	System.out.println(max);
}

}
