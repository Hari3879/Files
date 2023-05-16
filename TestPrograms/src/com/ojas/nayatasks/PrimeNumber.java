package com.ojas.nayatasks;

import java.util.Scanner;

public class PrimeNumber {
	public static String checkPrime(int num) {
		if (num < 0) {
			return "-1";
		} else if (num == 0 || num == 1) {
			return "-2";
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return "false";
				}
			}
			return "true";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		System.out.println(checkPrime(number));
	}

}
