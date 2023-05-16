package com.ojas.nayatasks;

import java.util.Scanner;

public class StepNumber {
	public static boolean isStepNumber(int num) {
		System.out.println(num % 10);
		int prevDigit = num % 10;
		System.out.println(num / 10);
		num /= 10;
 
		while (num > 0) {
			int currDigit = num % 10;
			System.out.println(currDigit);
			if (Math.abs(currDigit - prevDigit) != 1) {
				return false;
			}

			prevDigit = currDigit;
			num /= 10;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		System.out.println(isStepNumber(num));
	}

}
