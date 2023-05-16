package com.ojas.strings.test1;

public class ReverseStringsinsentence {
	static String reverseString(String str) {
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			res += str.charAt(i);
		}
		return res;
	}

	static void reverseWordsInSentence(String s) {
		String a[] = s.split(" ");
		String res = "";
		for (int i = 0; i < a.length; i++) {
			res += reverseString(a[i]);
			if (i != a.length - 1)
				res += " ";
		}
		System.out.println("Before reversing words : ");
		System.out.println(s);
		System.out.println("After reversing words : ");
		System.out.println(res);

	}

	public static void main(String[] args) {
		String str = "Fear leads to anger anger leads to hatred hatred leads to conflict conflict leads to suffering";
		reverseWordsInSentence(str);
	}
}
