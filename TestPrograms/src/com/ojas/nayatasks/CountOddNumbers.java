package com.ojas.nayatasks;

public class CountOddNumbers {
	public static String getOddCount(int[] arr) {
		//int len = arr.length;
		if (arr == null) {
			return "-4";
		}
		if (arr.length != 5) {
			return "-1";
		}
		int oddCount = 0;
		for (int num : arr) {
			if (num <= 0) {
				return "-2";
			}
			if (num % 2 != 0) {
				oddCount++;
			}
		}
		if (oddCount == 0) {
			return "-3";
		}
		return String.valueOf(oddCount);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr1=  {2,4};
		System.out.println(getOddCount(arr));
		System.out.println(getOddCount(arr1));

	}

}
