package com.ojas.dailytask;

import java.util.Scanner;

public class MultipleOf100 {
	public static int getMultipleof100(int number) {
		return ((number/100)+1)*100;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter your number");
		int number=sc.nextInt();
		System.out.println(getMultipleof100(number));
	}

}
