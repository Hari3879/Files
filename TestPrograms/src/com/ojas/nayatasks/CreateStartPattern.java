package com.ojas.nayatasks;

import java.util.Scanner;

public class CreateStartPattern {
	public static String createStarPattern(int rows) {
		if (rows < 1) {
			return "-1";
		} else if (rows == 1) {
			return "*";
		}

		StringBuilder result = new StringBuilder();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				result.append("* ");
			}
			result.deleteCharAt(result.length() - 1);

			result.append("\n");
		}

		return result.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		System.out.println(createStarPattern(number));

	}

}
