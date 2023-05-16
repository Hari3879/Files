package com.ojas.nayatasks;

import java.util.Scanner;

public class EvenNumbersBw2values {

	public static String getEvenNumbers(int num1, int num2) {
	    if (num1 < 0 || num2 < 0) {
	        return "-1";
	    }
	    if (num1 == 0 || num1 == num2) {
	        return "-2";
	    }
	    if (num1 > num2) {
	        int temp = num1;
	        num1 = num2;
	        num2 = temp;
	    }
	    StringBuilder sb = new StringBuilder();
	    for (int i = num1; i <= num2; i++) {
	        if (i % 2 == 0) {
	            sb.append(i).append(" ");
	        }
	    }
	    return sb.toString().trim();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		int number1 = sc.nextInt();
		System.out.println(getEvenNumbers(number, number1));
		

	}

}
