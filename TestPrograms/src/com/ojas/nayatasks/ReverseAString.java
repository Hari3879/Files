package com.ojas.nayatasks;

import java.util.Scanner;

public class ReverseAString {
	
	public static String reverse(String input) {
	    String[] words = input.split("\\s+");
	    //System.out.println(input.split("\\s+"));
	    StringBuilder reversed = new StringBuilder();
	    for (String word : words) {
	        StringBuilder wordBuilder = new StringBuilder(word);
	        wordBuilder.reverse();
	        System.out.println(wordBuilder);
	        reversed.append(wordBuilder).append(" ");
	    }
	    return reversed.toString().trim();
	}

	public static void main(String[] args) {
		String input = "rooman technologies hi";
		String reversed = reverse(input);
		System.out.println(reversed);

	}

}
