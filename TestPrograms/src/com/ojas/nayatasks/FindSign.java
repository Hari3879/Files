package com.ojas.nayatasks;

import java.util.Scanner;

public class FindSign {

	public static int findSign(int number) {
		if (number > 0) {
			return 1;
		} else if (number < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		

		
		System.out.println(findSign(n));
	}

}
