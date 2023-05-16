package com.ojas.dailytask;

class UnboundedSearchSortedArray {
	public static int f(int x) {
		return 3 * x - 100;
	}

	public static int binarySearch(int low, int high) {
		if (high < low) {
			return -1;
		}

		int mid = low + ((high - low) / 2);

		if (f(mid) > 0) {

			if (mid == low || f(mid - 1) <= 0) {
				return mid;
			}

			return binarySearch(low, mid - 1);
		}

		return binarySearch(mid + 1, high);
	}

	public static int exponentialSearch() {

		int i = 1;
		while (f(i) <= 0) {
			i *= 2;
		}

		return binarySearch(i / 2, i);
	}

	public static void main(String[] args) {
		int x = exponentialSearch();
		System.out.println("f(x) becomes positive for the first time when x = " + x);
	}
}
