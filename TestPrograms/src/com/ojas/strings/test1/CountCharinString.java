package com.ojas.strings.test1;

public class CountCharinString {

	public static void main(String[] args) {
		String str = "hello world hi";
		count(str);

	}

	private static void count(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}

		}
		System.out.println(count);

	}

}
