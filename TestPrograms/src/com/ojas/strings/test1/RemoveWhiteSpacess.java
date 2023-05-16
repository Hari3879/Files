package com.ojas.strings.test1;

public class RemoveWhiteSpacess {
	static void removeWhiteSpaces(String s) {
		char c;
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c != ' ') {
				result = result + c;
			}
		}
		System.out.println("After removing Spaces:" + result);
	}

	public static void main(String[] args) {
		String str = "I Love My India";
		removeWhiteSpaces(str);
	}
}
