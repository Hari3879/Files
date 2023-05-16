package com.ojas.test4;

import java.util.Arrays;

public class QuickSortBinaryArray {
	public static void quickSort(int[] arr) {
		int j=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<1) {
				j++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		int[] arr={ 1, 0, 1, 0, 1, 0, 0, 1 };
		quickSort(arr);
		

	}

}
