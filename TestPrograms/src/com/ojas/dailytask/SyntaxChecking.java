package com.ojas.dailytask;

public class SyntaxChecking {
	public static void main(String[] args) {
		String string="The cat sat on the mat ";
		String Pattern="^[A-Z][^\\?\\!\\.]*[\\.\\?\\!]$";
		String pattern1="(\\s\\w+)+\\s?(and|or)?\\s\\w+[^\\.\\?\\!]*[\\.\\?\\!]$";
		boolean isValid=Pattern.matches(Pattern,string)|| Pattern.matches(pattern1,string);
		System.out.println(isValid);
		
		
	}

}
