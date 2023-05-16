package com.ojas.test1;

public class PairFound {
	
	public static void pairFound(int[] arr,int target) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]+arr[j]==target)
					System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr= {8, 7, 2, 5, 3, 1};
		int target=10;
		pairFound(arr, target);

	}

}
