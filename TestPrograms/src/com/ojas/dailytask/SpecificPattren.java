package com.ojas.dailytask;

public class SpecificPattren {

	public static boolean followsPattern(String str, String pattern) {
		int strIndex = 0;
		for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);
			while (strIndex < str.length() && str.charAt(strIndex) != c) {
				strIndex++;
			}
			if (strIndex >= str.length()) {
				return false;
			}
			strIndex++;
		}
		return true;
	}

	public static void main(String[] args) {
		String word = "Techie Delight";
		String pattern = "el";
		if (followsPattern(word, pattern)) {
			System.out.println("Pattern found");
		} else {
			System.out.println("Pattern not found");
		}
	}

}
