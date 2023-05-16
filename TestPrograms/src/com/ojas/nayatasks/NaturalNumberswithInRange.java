package com.ojas.nayatasks;

public class NaturalNumberswithInRange {
	
	public static String getNumbersInRange(int start, int end, int step) {
	    if (start < 0 || end < 0 || step < 0) {
	        return "-1"; 
	    }
	    if (start >= end) {
	        return "-3"; 
	    }
	    if (start == end - step || end == start + step) {
	        return "-2"; 
	    }

	    StringBuilder result = new StringBuilder();
	    for (int i = start + step; i < end; i += step) {
	        result.append(i).append(" ");
	    }

	    return result.toString();
	}


	public static void main(String[] args) {
		int start = 10;
		int end = 30;
		int step = 2;

		String numbersInRange = getNumbersInRange(start, end, step);
		if ("-1".equals(numbersInRange)) {
		    System.out.println("Invalid input: values must not be negative");
		} else if ("-2".equals(numbersInRange)) {
		    System.out.println("Invalid input: values must not be the same or the step value is too large");
		} else if ("-3".equals(numbersInRange)) {
		    System.out.println("Invalid input: start value must not be greater than end value");
		} else {
		    System.out.println(numbersInRange);
		}

	}

}
