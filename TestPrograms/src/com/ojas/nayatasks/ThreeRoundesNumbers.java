package com.ojas.nayatasks;

import java.util.Scanner;

public class ThreeRoundesNumbers {
	public static int sumOfRoundedValues(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return -1;
		}

		int roundedA = (a % 10 < 5) ? (a / 10 * 10) : ((a / 10 + 1) * 10);
		int roundedB = (b % 10 < 5) ? (b / 10 * 10) : ((b / 10 + 1) * 10);
		int roundedC = (c % 10 < 5) ? (c / 10 * 10) : ((c / 10 + 1) * 10);

		return roundedA + roundedB + roundedC;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int n2=sc.nextInt();

		
		System.out.println(sumOfRoundedValues(n,n1,n2));

	}

}
