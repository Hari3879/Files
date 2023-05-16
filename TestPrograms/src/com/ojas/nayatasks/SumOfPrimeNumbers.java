package com.ojas.nayatasks;

public class SumOfPrimeNumbers {
	
	public static int getPrimeNumbersSum(int start, int end) {
	    if (start < 0 || end < 0) {
	        return -1;
	    }
	    
	    if (start == 0 || end == 0) {
	        return -2;
	    }
	    
	    if (start >= end) {
	        return -3;
	    }
	    
	    int sum = 0;
	    
	    for (int i = start; i <= end; i++) {
	        boolean isPrime = true;
	        
	        if (i == 1) {
	            isPrime = false;
	        }
	        
	        for (int j = 2; j <= i/2; j++) {
	            if (i % j == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        
	        if (isPrime) {
	            sum += i;
	        }
	    }
	    
	    return sum;
	}


	public static void main(String[] args) {
int a=10;
int b=30;
System.out.println(getPrimeNumbersSum(a, b));
	}

}
