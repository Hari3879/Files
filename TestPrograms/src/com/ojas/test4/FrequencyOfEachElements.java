package com.ojas.test4;

import java.util.Arrays;

public class FrequencyOfEachElements {
	public static void frequency(int[] arr) {
		int[] fr = new int[arr.length];
		int n = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;

					fr[j] = n;

				}
			}
			if (fr[i] != n)
				fr[i] = count;

		}

		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != n)
				System.out.print("" + arr[i] + ":" + fr[i] + "  ");
		}

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 2, 2, 4, 4, 4, 5, 5, 6, 8, 8, 9 };
		frequency(arr);
	}

}
