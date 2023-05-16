package com.ojas.nayatasks;

import java.util.Scanner;

public class IsEvenOrMultipleOf10 {

	public static int oddRounder(int number) {
	    if (number % 2 == 0) {
	        return number;
	    } else {
	        return (number / 10 + 1) * 10;
	    }
	}

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
System.out.println(oddRounder(n));
	}

}
