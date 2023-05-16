package com.ojas.strings.test1;

public class ReplaceAll {

	public static void main(String[] args) {
		String str="buddy";
		replace(str);

	}

	public static void replace(String str) {
		System.out.println(str);
		str=str.replaceAll("d", "f");
		System.out.println(str);
		
	}

}
