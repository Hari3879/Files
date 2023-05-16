package com.ojas.nayatasks;

import java.util.Scanner;

public class IsEven {

	public static int isEven(int number) {
		if (number <= 0) {
			return -1;
		} else if (number % 2 == 0) {
			return 1;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		Scanner sc =new Scanner( System.in);
		System.out.println("enter your number");
		int num=sc.nextInt();
         System.out.println(isEven(num));
	}

}
