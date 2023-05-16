package com.ojas.nayatasks;

import java.util.Scanner;

public class SquareAndCube {
	public static int caliculate(int number) {
		if(number%2==0) {
			System.out.println("given number is even");
			return number*number;
			
			
		}else if(number==0 &&number>0) {
			System.out.println("given number is negative or 0");

			return -1;
			
		}else {
			System.out.println("given number is odd");

			return number*number*number;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int num=sc.nextInt();
		System.out.println(caliculate(num));
		

	}

}
