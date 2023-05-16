package com.ojas.strings.test1;

public class PalindromeString {
	public static void palindrome(String str) {
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {
			reverse = reverse + str.charAt(i);
			// System.err.println(reverse);

		}
		if (str.equals(reverse)) {
			System.out.println("given string is palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}

	public static void main(String[] args) {
		String str = "hih";
		palindrome(str);

	}

}
