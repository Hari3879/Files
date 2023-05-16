package com.ojas.test2;

import java.util.Arrays;

public class LeftRotate {

	public static void lefttRotate( int[] arr,int target) {
		int p=1;
		int n=arr.length;
		
			while(p<=target) {
				int last=arr[0];
				for(int i=0;i<n-1;i++) {
					arr[i]=arr[i+1];
					
				
			}
				arr[n-1]=last;
				p++;
				
			
		}
			System.out.println(Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		int[] arr={ 1, 2, 3, 4, 5 };
		lefttRotate(arr, 2);
		
	}

}
