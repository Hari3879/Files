package com.ojas.strings.test1;

public class RemoveSpecialChar {
	static void removeSpaces(String s) {
		char c;
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if ((c >= 65 && c <= 90) || c >= 97 && c <= 122 || c >= '0' && c <= '9') {
				result += c;
			}
		}
		System.out.println("After removing special characters : " + result);
	}

	public static void main(String[] args) {
		String str = "I_am-dancing+on/the'5th,floor.";
		removeSpaces(str);
	}
}