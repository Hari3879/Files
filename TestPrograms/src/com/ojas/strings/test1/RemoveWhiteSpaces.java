package com.ojas.strings.test1;

public class RemoveWhiteSpaces {
	public static void removeSpaces( String string) {
	    string=string.replaceAll(" ", "");
		System.out.println(string);
		
	}
	

	public static void main(String[] args) {
		String string= " hello world Are you ok ";
		removeSpaces(string);
		

	}

}
