package com.ojas.dailytask;

import java.util.Arrays;

public class ReplaceElements {
	public static void repleceElements(int[] arr) {
		int n = arr.length;
		if (n == 0) {
			return;

		}
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = 1;
		for (int i = 1; i < n; i++) {

			left[i] = arr[i - 1] * left[i - 1];
			//System.out.println(left[i]);
		}
		right[n - 1] = 1;
		for (int j = n - 2; j >= 0; j--) {
			right[j] = arr[j + 1] * right[j + 1];
			//System.out.println(right[j] );
		}
		for (int i = 0; i < n; i++) {
			arr[i] = left[i] * right[i];
			//System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		repleceElements(arr);

	}

}
