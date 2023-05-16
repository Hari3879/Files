package com.ojas.dailytask;

public class RepeatingNumber {

	static void printFirstRepeating(int[] arr, int n) {

		int k = 0;

		int max = n;
		for (int i = 0; i < n; i++)
			if (max < arr[i])
				max = arr[i];

		int[] a = new int[max + 1];

		int[] b = new int[max + 1];
		for (int i = 0; i < n; i++) {

			if (a[arr[i]] != 0) {
				b[arr[i]] = 1;
				k = 1;
				continue;
			} else

				a[arr[i]] = i + 1;
		}

		if (k == 0)
			System.out.println("No repeating element found");
		else {
			int min = max + 1;

			for (int i = 0; i < max + 1; i++)
				if (a[i] != 0 && min > a[i] && b[i] != 0)
					min = a[i];
			System.out.print(arr[min - 1]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 4, 3, 5, 6};

		int N = arr.length;
		printFirstRepeating(arr, N);
	}

}
