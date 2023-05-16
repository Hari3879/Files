package com.ojas.nayatasks;

import java.util.Scanner;

public class NextEvenOddNumber {
	public static int nextNum(int n) {
		int evenCount = 0, oddCount = 0;
		int temp = n;

		while (temp > 0) {
			int digit = temp % 10;
			if (digit % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			temp /= 10;
		}

		if (evenCount > oddCount) {
			return (n % 2 == 0) ? n + 2 : n + 1;
		} else if (oddCount > evenCount) {
			return (n % 2 == 0) ? n + 1 : n + 2;
		} else {
			return n;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int num = sc.nextInt();
		System.out.println(nextNum(num));

	}

}
