package com.ojas.strings.test1;

public class SortingStringCharecters {
	static void sortStringCharacters(String str) {
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					char temp = c[j];
					c[j] = c[i];
					c[i] = temp;
				}
			}
		}
		str = "";
		for (int i = 0; i < c.length; i++) {
			str += c[i];
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		String str = "hello";
		sortStringCharacters(str);
	}
}
