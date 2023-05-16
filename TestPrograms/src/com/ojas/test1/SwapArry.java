package com.ojas.test1;

import java.util.Arrays;

public class SwapArry {
	public static void swap(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;				}

			}

		}
		System.out.println(Arrays.toString(arr));

	}


	public static void main(String[] args) {
		int[] arr= {3, 8, 6, 7, 5, 9};
		swap(arr);

	}

}
