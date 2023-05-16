package com.ojas.test1;

public class MajorityElement {
	public static void majority(int[] arr) {
		int n = arr.length;
		int count = 1;
		int max = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;

			}

			if (count > max) {
				max = count;
				index = i;

			}

		}
		if (max > n)
			System.out.println("majority element :" + arr[index]);

		
	}

	public static void main(String[] args) {
		int[] arr = { 2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2 };
		int[] arr1 = { 1, 3, 1, 1 };
		majority(arr);
		majority(arr1);

	}

}
