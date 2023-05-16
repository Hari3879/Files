package com.ojas.nayatasks;

import java.util.Scanner;

public class GetFibonaciSequence {
	public static String getFibonacciSeries(int terms) {
		if (terms <= 0) {
			return null;
		}

		StringBuilder series = new StringBuilder();
		int first = 0, second = 1;
		series.append(first).append(",");

		if (terms > 1) {
			series.append(second).append(",");
		}

		for (int i = 3; i <= terms; i++) {
			int third = first + second;
			series.append(third).append(",");
			first = second;
			second = third;
		}

		return series.substring(0, series.length() - 1);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter terms");
		int terms = sc.nextInt();

		System.out.println(getFibonacciSeries(terms));
	}

}
