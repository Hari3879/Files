package com.ojas.dailytask;

public class Lbs {
	public static void findbitonicsubarray(int[] arr) {
		if (arr.length == 0) {
			return;
		}
		int[] increase = new int[arr.length];
		increase[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			increase[i] = 1;
			if (arr[i - 1] < arr[i]) {
				increase[i] = increase[i - 1] + 1;

			}
		}
		int[] decrease = new int[arr.length];
		decrease[arr.length - 1] = 1;
		for (int i = arr.length - 2; i >= 0; i--) {
			decrease[i] = 1;
			if (arr[i] > arr[i + 1]) {
				decrease[i] = decrease[i + 1] + 1;
			}
		}
		int lbslen = 1;
		int begun = 0, end = 0;
		for (int i = 0; i < arr.length; i++) {
			int len = increase[i] + decrease[i] - 1;
			if (lbslen < len) {
				lbslen = len;
				begun = i - increase[i] - 1;
				end = i + decrease[i] - 1;
			}
		}
		System.out.println(lbslen);
		System.out.println(begun + "," + end);
	}

	public static void main(String[] args) {
		int[] arr = { 3, 5, 8, 4, 5, 9, 10, 8, 5, 3, 4 };
		findbitonicsubarray(arr);
	}

}
