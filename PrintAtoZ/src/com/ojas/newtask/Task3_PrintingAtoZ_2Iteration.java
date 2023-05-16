package com.ojas.newtask;

import java.util.Scanner;

public class Task3_PrintingAtoZ_2Iteration {
	public static void print(int num) {

		for (int i = 0; i < num; i++) {
			for (char c = 'a'; c <= 'z'; c++) {
				System.out.println(c + " ");
			}
			for (char j = 'a'; j <= 'z'; j++) {
				for (char k = 'a'; k <= 'z'; k++) {
					System.out.print(j);
					System.out.println(k);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number  rounds: ");
		int number = scanner.nextInt();
		print(number);
		}

}
