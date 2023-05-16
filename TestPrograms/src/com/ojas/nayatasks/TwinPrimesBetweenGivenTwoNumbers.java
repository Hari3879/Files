package com.ojas.nayatasks;

import java.util.ArrayList;
import java.util.List;

public class TwinPrimesBetweenGivenTwoNumbers {
	public static String getTwinPrimes(int num, int num1) {
		if (num < 0 && num1 < 0) {
			return "error";
		} else if (num > 100) {
			return "Error";

		} else if (num >= num1) {
			return "error";

		} else {
			List<Integer> prime = new ArrayList<>();
			for (int i = num; i <= num1; i++) {
				if (isPrime(i)) {
					prime.add(i);
				}
			}
			for (int i = 0; i < prime.size(); i++) {
				int p1 = prime.get(i);
				int p2 = prime.get(i + 1);
				if (p2 - p1 == 2) {
					System.out.println("(" + p1 + "," + p2 + ")");
				}

			}
		}
		return null;
	}

	public static Boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println(getTwinPrimes(10, 100));
	}

}
