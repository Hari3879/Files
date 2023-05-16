package com.ojas.nayatasks;

public class LastPalindromeNumber {
	public static String getPalindromeList(int num) {
	    if (num <= 0 || num < 100 || num > 999) {
	        return "Error";
	    }
	    
	    StringBuilder output = new StringBuilder();
	    int count = 0;
	    
	    while (count < 20 && !isPalindrome(num)) {
	        output.append(num).append(", ");
	        int reverseNum = reverseNum(num);
	        num += reverseNum;
	        count++;
	    }
	    
	    if (isPalindrome(num)) {
	        output.append(num);
	    }
	    
	    return output.toString();
	}

	public static boolean isPalindrome(int num) {
	    String numStr = String.valueOf(num);
	    int i = 0, j = numStr.length() - 1;
	    while (i < j) {
	        if (numStr.charAt(i) != numStr.charAt(j)) {
	            return false;
	        }
	        i++;
	        j--;
	    }
	    return true;
	}

	public static int reverseNum(int num) {
	    int reverseNum = 0;
	    while (num != 0) {
	        reverseNum = reverseNum * 10 + num % 10;
	        num /= 10;
	    }
	    return reverseNum;
	}


	public static void main(String[] args) {
System.out.println(getPalindromeList(165));
	}

}
