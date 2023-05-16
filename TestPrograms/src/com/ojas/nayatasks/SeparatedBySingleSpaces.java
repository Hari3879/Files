package com.ojas.nayatasks;

public class SeparatedBySingleSpaces {
	public static String getNumbersInRange(int start_val, int end_val) {
	    if (start_val < 0 || end_val < 0) {
	        return "-1";
	    } else if (start_val == end_val) {
	        return "-2";
	    } else if (start_val < end_val) {
	        return "-3";
	    } else if (start_val - end_val == 1) {
	        return "-4";
	    } else {
	        String result = "";
	        for (int i = start_val - 1; i > end_val; i--) {
	            result += i + " ";
	        }
	        return result.trim();
	    }
	}

	public static void main(String[] args) {
		System.out.println(getNumbersInRange(10, 1));
		

	}

}
