package com.ojas.nayatasks;

import java.util.Scanner;

public class IsEvenOrOdd {
	public static String isEvenOrOdd(int number) {
	    if (number < 0) {
	        return "Invalid Input";
	    } else if (number % 2 == 0) {
	        return "Even";
	    } else {
	        return "Odd";
	    }
	}


	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		System.out.println(isEvenOrOdd(n));
		
	}

}
