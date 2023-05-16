package com.ojas.practice;

public class LinearSearchExample {
	public static void linearSearch(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0)
			
				System.out.println(arr[i]); ;
			
		}
		
	}

	public static void main(String a[]) {
		int[] a1 = { 10, 20, 30, 50, 70, 90,99 };
		//int key = 50;
		linearSearch(a1);
	}
}
