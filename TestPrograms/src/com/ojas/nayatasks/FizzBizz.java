package com.ojas.nayatasks;

public class FizzBizz {
	public static String getFizzBizz(int num) {
	    if (num <= 0) {
	        return "Error";
	    }
	    
	    if (num % 3 == 0 && num % 5 == 0) {
	        return "FIZZBIZZ";
	    } else if (num % 3 == 0) {
	        return "FIZZ";
	    } else if (num % 5 == 0) {
	        return "BIZZ";
	    } else {
	        return String.valueOf(num);
	    }
	}

	public static void main(String[] args) {
		System.out.println(getFizzBizz(15));
	}

}
