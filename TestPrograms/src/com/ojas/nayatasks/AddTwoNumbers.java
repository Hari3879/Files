package com.ojas.nayatasks;

public class AddTwoNumbers {
	public static String getSum(int a, int b) {
	    if (a <= 0 || b <= 0) {
	        return "Error";
	    } else {
	        int sum = a + b;
	        return String.valueOf(sum);
	    }
	}


	public static void main(String[] args) {
		int a=10;
		int b=30;
		System.out.println(getSum(a, b));

	}

}
