package com.ojas.dailytask;

public class MaxDifferenceb_wTwoelements {
	public static int maxDifference( int[] arr) {
		int diff = 0;
		int n=arr.length;
		if(n==0) {
			return diff;
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					diff=Integer.max(diff, arr[j]-arr[i]);
				}
			}
		}
		return diff;
	}

	public static void main(String[] args) {
		//int[] x= {3,6,7,8,10,12,15,18,100};
		int[] Arr1=  { 2, 7, 9, 5, 1, 3, 5 };
		//System.out.println("max difference"+maxDifference(x));
		System.out.println("max difference"+maxDifference(Arr1));
	}

}
