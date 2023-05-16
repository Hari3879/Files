package com.ojas.test3;

import java.util.Arrays;

public class MergedSortedArrys {
	public static void merge(int[] a, int[] b) {
		int[] arr=new int[a.length+b.length];
		
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length) {
			arr[k++]=a[i++];
		}
		while(j<b.length) {
			arr[k++]=b[j++];
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	int[] arrays1=Arrays.copyOfRange(arr, 0, 5);
	int[] arrays2=Arrays.copyOfRange(arr, 5, arr.length);
	System.out.println(Arrays.toString(arrays1));
	System.out.println(Arrays.toString(arrays2));
		
		

	}
	

	public static void main(String[] args) {
		int[] arr = { 1, 4, 7, 8, 10 };
		int[] arr1 = { 2, 3, 9 };
		merge(arr, arr1);

	}
	

}
