package com.ojas.test1;

public class MaxProductOfTwoIntegers {
	public  static void  maxPro( int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(max<arr[i]*arr[j]) {
					
					max=arr[i]*arr[j];
				System.out.println(arr[i]+"and"+arr[j]);
				}
				//break;
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr={-10, -3, 5, 6, -2};
		maxPro(arr);
		

	}

}
