package com.ojas.nayatasks;

public class GetPrimeNumber {
	
	public static String getPrimeNumbers(int num1, int num2) {
	    if (num1 < 0 || num2 < 0) { 
	        return "-1";
	    } else if (num1 >= num2) { 
	        return "-2";
	    }

	    String result = ""; 

	    for (int i = num1; i <= num2; i++) {
	        boolean isPrime = true;

	        if (i == 1) { 
	            isPrime = false;
	        } else {
	            for (int j = 2; j <= Math.sqrt(i); j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        if (isPrime) {
	            result += i + " "; 
	        }
	    }

	    return result.trim(); 
	}


	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		String primeNumbers = getPrimeNumbers(num1, num2);
		System.out.println(primeNumbers); 


	}

}
