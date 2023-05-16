package com.ojas.nayatasks;

public class IsPalindrome {
	
	public static int isPalindrome(int number) {
	    int originalNumber = number;
	    int reverseNumber = 0;
	    
	    while (number != 0) {
	        int remainder = number % 10;
	        reverseNumber = reverseNumber * 10 + remainder;
	        number /= 10;
	    }
	    
	    if (originalNumber == reverseNumber) {
	        return 1;
	    } else {
	        return 0;
	    }
	}


	public static void main(String[] args) {
		System.out.println(isPalindrome(232));
	

	}

}
