package com.ojas.nayatasks;

import java.util.Scanner;

public class NthQudraticSequenceNumber {

	public static int getNthTerm(int n) {
		if (n <= 0) {
			return -1;
		}
		int term = 1;
		int increment = 2;
		for (int i = 1; i < n; i++) {
			term += increment;
			increment++;
		}
		return term;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int number = sc.nextInt();
		System.out.println(getNthTerm(number));

	}

}
