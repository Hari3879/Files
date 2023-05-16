package com.ojas.strings.test1;

public class LowerUpperCase {
	public static void lowerUpper(String str) {
		str=str.toLowerCase();
		System.out.println(str);
		str=str.toUpperCase();
		System.out.println(str);
		
	}

	public static void main(String[] args) {
		String str = "Hello";
		lowerUpper(str);
	}

}
