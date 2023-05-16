package com.ojas.nayatasks;

import java.util.Scanner;

public class ArmStrongNumber {
	public static String checkArmStrong(int num) {
		if (num < 0) {
			return "-1";
		}

		if (num < 1000 || num > 9999) {
			return "-2";
		}

		int sum = 0;
		int temp = num;
		while (temp > 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, 4);
			temp /= 10;
		}
		if (sum == num) {
			return "ArmStrong Number";
		} else {
			return "Not ArmStrong Number";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		System.out.println(checkArmStrong(number));

	}

}
