package com.ojas.nayatasks;

import java.util.Scanner;

public class FactorsOfTheGivenValue {
	public static String getFactors(int num) {
		if (num < 0) {
			return "-1";
		} else if (num == 0) {
			return "-2";
		} else {
			String factors = "";
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					factors += i + " ";
				}
			}
			return factors.trim();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		System.out.println(getFactors(number));
	}

}
