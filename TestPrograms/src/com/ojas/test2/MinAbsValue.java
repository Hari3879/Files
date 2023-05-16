package com.ojas.test2;

public class MinAbsValue {

	public static void minAbsValue(int[] arr) {
		int min = -1;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]+arr[j]==min)
					
					System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = { -6, -5, -3, 0, 2, 4, 9 };
		minAbsValue(arr);
	}

}
