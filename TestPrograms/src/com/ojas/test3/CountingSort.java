package com.ojas.test3;

import java.util.Arrays;

public class CountingSort {
	
	public static void countingSort(int[] arr) {
		int max=0;
		int c = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			
		}
		//System.out.println(max);
		//int[] temp=new int[max+1];
		
		//System.out.println(Arrays.toString(temp));	
		int[] newarr=new int[max+1];
		//System.out.println(Arrays.toString(newarr));
		for(int i=0;i<arr.length;i++) {
			newarr[arr[i]]++;
//			System.out.println(newarr[arr[i]]);
			
		}
		for(int i=0;i<newarr.length;i++) {
			for(int j=0;j<newarr[i];j++) {
				arr[c++]=i;
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr= {2,5,4,8,10,6};
		countingSort(arr);
		//System.out.println(Arrays.toString(arr));
	
	}

}
