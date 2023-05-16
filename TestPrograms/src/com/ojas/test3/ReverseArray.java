package com.ojas.test3;

public class ReverseArray {
	public static void reverse(int[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
	}

	public static void main(String[] args) {
		int[] arr= {1,5,4,5,6};
		reverse(arr);
		

	}

}
