package com.ojas.nayatasks;

import java.util.Scanner;

public class GreatestNumber {
	
	public static int getGreatest(int num1, int num2) {
	    if (num1 < 0 || num2 < 0) {
	        return -1;
	    } else if (num1 == 0 || num2 == 0) {
	        return -2;
	    } else {
	        return Math.max(num1, num2);
	    }
	}


	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int n1=sc.nextInt();

		
		System.out.println(getGreatest(n,n1));

	}

}
