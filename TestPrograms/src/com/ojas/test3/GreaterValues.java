package com.ojas.test3;

public class GreaterValues {
	public static void great(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			
			if(arr[i]<arr[i-1]  ) {
				
				System.out.println(arr[i-1]);
				if(i-1==0)
					break;
				
			}
			
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 4, 6, 3, 5 };
		great(arr);
	}

}
