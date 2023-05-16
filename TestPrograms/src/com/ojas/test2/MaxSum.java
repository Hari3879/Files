package com.ojas.test2;

import java.util.Arrays;
import java.util.Comparator;

public class MaxSum {
	public static void maxSum( int[] arr) {
		
		Arrays.sort(arr);
		int x=0;
		for(int i=arr.length-1;i>=0;i=i-2) {
			x=x*10+arr[i];
		}
		int y=0;
		for(int i=arr.length-2;i>=0;i=i-2) {
			y=y*10+arr[i];
		}
		System.out.println("max sum "+x+" and"+y);
	}

	public static void main(String[] args) {
		int[] arr=  { 4, 6, 2, 7, 9, 8 };
		int[] arr1={ 9, 2, 5, 6, 0, 4 };
		maxSum(arr);
		maxSum(arr1);
		
	}

}
