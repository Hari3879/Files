package com.ojas.strings.test1;

public class SwapTwoString {
	static void swapTwoStringsWithoutTemp(String s1, String s2) {
		System.out.println("Before swapping: " + s1 + "\t" + s2);
		s1 = s1 + s2;
		//System.out.println(s1);
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After swapping: " + s1 + "\t" + s2);
	}

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "world";
		swapTwoStringsWithoutTemp(str1, str2);
	}
}
