package com.ojas.test1;

public class MaxProductOfSubSet {
	public static int maxProduct(int[] arr) {

		int maxsum = arr[0];
		int curentSum = 0;
		int s = 0, start = 0, end = 0;
		for (int i = 0; i < arr.length; i++) {
			curentSum *= arr[i];

			if (maxsum < curentSum) {
				maxsum = curentSum;
				start = s;
				end = i;

			} else if (curentSum < 0) {
				curentSum = 0;
				s = i + 1;

			}

		}
		for (int i = start; i <= end; i++) {
			System.out.println(arr[i] + ",");

		}
		return maxsum;
	}

	public static void main(String[] args) {
		int[] arr = { -6, 4, -5, 8, -10, 0, 8 };
		maxProduct(arr);

	}

}
