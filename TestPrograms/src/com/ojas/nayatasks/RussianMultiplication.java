package com.ojas.nayatasks;


	public class RussianMultiplication {
	    
	    public static int getProduct(int num1, int num2) {
	        if (num1 <= 0 || num2 <= 0) {
	            return -1;
	        }
	        
	        int halving = num1;
	        int doubling = num2;
	        int product = 0;
	        
	        while (halving > 0) {
	            if (halving % 2 != 0) {
	                product += doubling;
	            }
	            halving /= 2;
	            doubling *= 2;
	        }
	        
	        return product;
	    }
	


	public static void main(String[] args) {
		int a=11;
		int b=12;
		System.out.println(getProduct(a, b));

	}

}
