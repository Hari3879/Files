package com.ojas.string.week2;

public class CircularlyRotatingOfString {
	public static void  circularRotating( String string1,String string2) {
		
		
	}

	
	
	public static void main(String[] args) {
		String string1="ABCD";
		String string2="DABC";
		String string3=string1+string1;
		System.out.println(string3);
		System.out.println(string3.substring(3, 7));
		if(string3.substring(3, 7).equals(string2)) {
			
			System.out.println("yes");
			System.out.println("Y can be derived from X by right-rotating it by 1 unit ");
		}else {
			System.out.println("no");
			System.out.println("Y can`t be derived from X by right-rotating it by 1 unit ");
		}

	}

}
