package com.ojas.nayatasks;

import java.util.Scanner;

public class SumOfFactorsOfTheGivenValue {
	public static int getSumOfFactors(int num) {
		if (num < 1) {
			return (num == 0) ? -2 : -1;
		} else {
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					sum += i;
				}
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		System.out.println(getSumOfFactors(number));

	}

}
