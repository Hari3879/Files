package com.ojas.nayatasks;

public class GetCount {
	public static int getCount(int[] arr, int val) {
	    if (arr == null || arr.length == 0) {
	        return -1;
	    }
	    int count = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == val) {
	            count++;
	        }
	    }
	    return count;
	}


	public static void main(String[] args) {
	int[] arr= {1,2,3,4};
	int a=3;
	System.out.println(getCount(arr, a));

	}

}
