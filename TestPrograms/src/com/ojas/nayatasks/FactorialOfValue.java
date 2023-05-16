package com.ojas.nayatasks;

import java.util.Scanner;

public class FactorialOfValue {
	public static int getFactorial(int n) {
		// Check for negative or zero value
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return -2;
		}
		// Compute the factorial
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		System.out.println(getFactorial(number));
	}

}
