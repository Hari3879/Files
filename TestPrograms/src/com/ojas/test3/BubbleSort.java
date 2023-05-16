package com.ojas.test3;

import java.util.Arrays;

public class BubbleSort {
	
	public static void BSort(int[] arr) {
		int temp = 0 ;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		int[] arr= {1,3,0,654,54,765};
		BSort(arr);
		// TODO Auto-generated method stub

	}

}
