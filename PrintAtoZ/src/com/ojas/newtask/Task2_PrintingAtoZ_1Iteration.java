package com.ojas.newtask;

import java.util.Scanner;

public class Task2_PrintingAtoZ_1Iteration {
	public static void print(int num) {

		for (int i = 0; i < num; i++) {
			for (char c = 'a'; c <= 'z'; c++) {
				System.out.println(c + " ");
			}
			System.out.print("");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number  rounds: ");
		int number = scanner.nextInt();
		print(number);
	}

}
