package com.ojas.dailytask;

class TransformedString {

	public static boolean checkEditDistance(String first, String second) {

		if (first == null || second == null) {
			return false;
		}

		int m = first.length();
		int n = second.length();

		if (Math.abs(m - n) > 1) {
			return false;
		}

		int edits = 0;

		int i = 0, j = 0;

		while (i < m && j < n) {
			if (first.charAt(i) != second.charAt(j)) {

				if (m > n) {
					i++;
				}

				else if (m < n) {
					j++;
				}

				else {
					i++;
					j++;
				}

				edits++;
			}

			else {
				i++;
				j++;
			}
		}

		if (i < m) {
			edits++;
		}

		if (j < n) {
			edits++;
		}

		return (edits == 1);
	}

	public static void main(String[] args) {
		System.out.println(checkEditDistance("xyz", "xz")); // true
		System.out.println(checkEditDistance("xyz", "xyyz")); // true
		System.out.println(checkEditDistance("xyz", "xyx")); // true
		System.out.println(checkEditDistance("xyz", "xxx")); // false
	}
}