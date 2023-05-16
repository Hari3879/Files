package com.ojas.dailytask;

public class K_diifference {


public class K_Difference {
	public static void kdifference(int[] arr,int k) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] - arr[i] == k || arr[i] - arr[j] == k)
					
					System.out.println(arr[i] + "and" + arr[j]);

			}

		}

	}

	public static void main(String[] args) {
		int[] arr= {1, 5, 2, 2, 2, 5, 5, 4};
		kdifference(arr, 3);
		// TODO Auto-generated method stub

	}

}}
