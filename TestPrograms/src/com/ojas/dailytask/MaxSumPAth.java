package com.ojas.dailytask;

public class MaxSumPAth {
	public static int findMaxsum( int[] arr,int[] arr1) {
		int sum=0;
		int Arr_sum=0;
		int Arr1_sum=0;
		int i=0,j=0;
		while(i<arr.length &&j<arr1.length) {
			while(i<arr.length-1 && arr[i]==arr[i+1] ) {
				Arr_sum +=arr[i++];
				
			}
			while(j<arr1.length-1 && arr1[j]==arr1[j+1] ) {
				Arr1_sum +=arr1[j++];
		}
		if(arr1[j]<arr[i]) {
			Arr1_sum +=arr1[j];
			j++;
		}else {
			Arr_sum+=Integer.max(Arr_sum, Arr1_sum)+arr[i];
			i++;
			j++;
			Arr_sum=0;
			Arr1_sum=0;
		}
		}
		while(i<arr.length) {
			Arr_sum +=arr[i++];
		}
		while(j<arr1.length) {
			Arr1_sum+=arr1[j++];
			
		}
		Arr_sum+=Integer.max(Arr_sum, Arr1_sum);
		return Arr_sum-1;
	}

	public static void main(String[] args) {
		int[] x= {3,6,7,8,10,12,15,18,100};
		int[] y= {1,2,3,5,7,9,10,11,15,16,18,25,50};
		
		System.out.println("the max sum is:"+findMaxsum(x, y));

	}

}
