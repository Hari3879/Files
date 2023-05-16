package com.ojas.nayatasks;

import java.util.Scanner;

public class StringEncrypt {
	public static String encrypt(String text) {
	    if (text.matches("[a-z]+")) {
	        StringBuilder encryptedText = new StringBuilder();
	        for (int i = 0; i < text.length(); i++) {
	            int index = text.charAt(i) - 'a';
	            System.out.println(index);
	            char encryptedChar = (char) ('z' - index);
	            System.out.println(encryptedChar);
	            encryptedText.append(encryptedChar);
	            
	        }
	        return encryptedText.toString();
	    } else {
	        return null;
	    }
	}


	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter String");
		String terms = sc.next();

		System.out.println(encrypt(terms));
	}

}
