package com.ojas.strings.test1;

public class ReverseString {

	public static void main(String[] args) {
		String str = "hello hi fsgdth";
		reverse(str);
	}

	private static void reverse(String str) {
		
		String next="";
		String reverse = "";
		for (int i =0;i< str.length() ; i++) {
			char ch=str.charAt(i);
			 next=ch+next;
			 
			

		}
System.out.println(next);
	}

}
