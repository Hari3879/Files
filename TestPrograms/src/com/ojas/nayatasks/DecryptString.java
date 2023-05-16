package com.ojas.nayatasks;

import java.util.Scanner;

public class DecryptString {
	public static String decrypt(String cipherText) {
		String plainText = "abcdefghijklmnopqrstuvwxyz";
		String cipher = "zyxwvutsrqponmlkjihgfedcba";
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < cipherText.length(); i++) {
			char c = cipherText.charAt(i);
			int index = cipher.indexOf(c);
			if (index == -1) {
				return null;
			}
			result.append(plainText.charAt(index));
		}
		return result.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String");
		String terms = sc.next();

		System.out.println(decrypt(terms));
	}

}
