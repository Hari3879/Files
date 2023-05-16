package com.ojas.test4;

public class NumberOfZeros {
	public  static void findzeros( int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0)
				count++;
			
		}
		System.out.println("number of 1's present in array is:"+count);
		
		
		
	}

	public static void main(String[] args) {
		int[] arr= {0, 0, 0, 0, 1, 1, 1};
		int[] arr1= {0, 0, 1, 1, 1, 1, 1};
		findzeros(arr);
		findzeros(arr1);

	}

}
