package com.ojas.nayatasks;

public class CreateStarPattern {
	public static String createStarPattern(int numRows) {
	    if (numRows < 1) {
	        return "-1"; 
	    } else if (numRows == 1) {
	        return "*"; 
	    }

	   
	    StringBuilder pattern = new StringBuilder();
	    for (int i = 1; i <= numRows; i++) {
	        
	        for (int j = 1; j <= i; j++) {
	            pattern.append("* ");
	        }
	        pattern.append("\n"); 
	    }

	    return pattern.toString();
	}


	public static void main(String[] args) {
		int numRows = 4;
		String pattern = createStarPattern(numRows);
		System.out.println(pattern);


	}

}
