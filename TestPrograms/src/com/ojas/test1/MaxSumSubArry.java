package com.ojas.test1;



public class MaxSumSubArry {
	public static int maxSum(int[] arr) {
		int maxsum = arr[0];
		int curentSum = 0;
		int s=0,start=0,end=0;
		for (int i = 0; i < arr.length; i++) {
			curentSum += arr[i];
			
			if (maxsum <curentSum ) {
				maxsum = curentSum;
				start=s;
				end=i;

			}
			else if(curentSum < 0) {
				curentSum = 0;
				s=i+1;
				
			}
			
		}
		for(int i=start;i<=end;i++) {
			//System.out.println(arr[i]+",");

			
		}
		 return maxsum;
	}

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int[] arr1= {7, -3, -2, -4};
		int[] arr2= {2, 2, -1, 2, 1, 6, -10, 6, 4, -8};
		System.out.println( "arry max sum of subarray: "+maxSum(arr));
		System.out.println( "arry max sum of subarray: "+maxSum(arr1));
		System.out.println( "arry max sum of subarray: "+maxSum(arr2));

	

	}

}
