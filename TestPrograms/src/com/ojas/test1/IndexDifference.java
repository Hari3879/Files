package com.ojas.test1;

public class IndexDifference {
	public static void diffrencebwIndex(int[] arr, int x, int y) {
		int a = 0;
		int b;
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= 0; j--) {
				if (arr[i] == x && arr[j] == y)
					a = (i - j);

			}

		}
		System.out.println("  index difference:" + a);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 4, 8, 2, 4, 3, 6, 5 };
		diffrencebwIndex(arr, 5, 2);

	}

}
