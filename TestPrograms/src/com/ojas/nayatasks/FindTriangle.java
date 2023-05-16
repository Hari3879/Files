package com.ojas.nayatasks;

import java.util.Scanner;

public class FindTriangle {
	public static String findTriangle(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return "-1"; 
		} else if (a < 0 || b < 0 || c < 0) {
			return "-2"; 
		} else if (a + b <= c || a + c <= b || b + c <= a) {
			return "-3"; 
		} else if (a == b && b == c) {
			return "EQUILATERAL"; 
		} else if (a == b || b == c || c == a) {
			return "ISOSCELES"; 
		} else {
			return "SCALENE";
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(findTriangle(a, b, c));

	

	}

}
