package com.ojas.nayatasks;

public class OddPlaindromeNumber {
	public static String getOddPalindromeList(int startNum, int endNum) {
	    if (startNum <= 0 || endNum <= 0) {
	        return "Error";
	    }
	    if (startNum < 100 || endNum > 999) {
	        return "Error";
	    }
	    if (startNum > endNum) {
	        return "Error";
	    }
	    
	    String output = "";
	    for (int i = startNum; i <= endNum; i++) {
	        if (i % 2 == 0) {  
	            continue;
	        }
	        String numStr = Integer.toString(i);
	        String reversedNumStr = new StringBuilder(numStr).reverse().toString();
	        if (numStr.equals(reversedNumStr)) {
	            output += numStr + ",";
	        }
	    }
	    
	    if (output.equals("")) {  
	        return "";
	    } else {
	        return output.substring(0, output.length() - 1);  
	    }
	}


	public static void main(String[] args) {
		System.out.println(getOddPalindromeList(100, 200));

	}

}
