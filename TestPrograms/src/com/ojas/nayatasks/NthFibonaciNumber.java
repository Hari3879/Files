package com.ojas.nayatasks;

import java.util.Scanner;

public class NthFibonaciNumber {
	public static int getNthTermOfFibonacciSeries(int n) {
	    if (n <= 0) {
	        return -1;
	    } else if (n == 1) {
	        return 0;
	    } else if (n == 2) {
	        return 1;
	    } else {
	        int a = 0;
	        int b = 1;
	        int c = 1;
	        for (int i = 3; i <= n; i++) {
	            c = a + b;
	            a = b;
	            b = c;
	        }
	        return c;
	    }
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter terms");
		int terms = sc.nextInt();

		System.out.println(getNthTermOfFibonacciSeries(terms));
	}

}
