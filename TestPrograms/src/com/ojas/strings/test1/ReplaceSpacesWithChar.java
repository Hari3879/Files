package com.ojas.strings.test1;

public class ReplaceSpacesWithChar {
	public static void replace(String str) {
		str = str.replaceAll(" ", "s");
		System.out.println(str);
	}

	public static void main(String[] args) {
		String str = "hello worlld hi";
		replace(str);
	}

}
