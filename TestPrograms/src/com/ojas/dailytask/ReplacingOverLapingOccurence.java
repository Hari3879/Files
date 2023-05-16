package com.ojas.dailytask;

public class ReplacingOverLapingOccurence {
	public static void replaceOccurence() {
		 String string = "ABC ABC X ABC";
		 String Pattern = "ABC";
		 String Character = "@";
		
		 String output = string.replaceAll("(?<!ABC)ABC(?!ABC)", Character);

		 System.out.println(output);
		 
		 
	}

	public static void main(String[] args) {
		replaceOccurence();

	}

}
