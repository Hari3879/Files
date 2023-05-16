package com.ojas.test4;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		

		for(int i=0;i<arr.length-1;i++) {
			int minidx=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minidx])
				minidx=j;
			}
			int temp=arr[minidx];
			arr[minidx]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr= {9,2,6,4,1};
		selectionSort(arr);

	}

}
