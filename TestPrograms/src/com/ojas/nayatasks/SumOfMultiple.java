package com.ojas.nayatasks;

import java.util.Scanner;

public class SumOfMultiple {
	public static int sumOfMultiples(int number1, int number2, int number3) {

		int n1 = ((number1 / 10) + 1) * 10;
		int n2 = ((number2 / 10) + 1) * 10;
		int n3 = ((number3 / 10) + 1) * 10;
		int sum = n1 + n2 + n3;
		int sum1 = number1 + number2 + number3;
		int s1r = ((sum1 / 10) + 1) * 10;
		if ((number1 < 0 && number1 == 0) && (number2 < 0 && number2 == 0) && (number3 < 0 && number3 == 0)) {
			return -1;
		} else if (sum % 10 != 0) {

			return sum;
		} else

			return s1r;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr three number");

		System.out.println(sumOfMultiples(sc.nextInt(), sc.nextInt(),sc.nextInt()));

	}

}
