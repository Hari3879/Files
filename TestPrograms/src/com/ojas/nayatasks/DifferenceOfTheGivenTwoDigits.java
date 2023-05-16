package com.ojas.nayatasks;

public class DifferenceOfTheGivenTwoDigits {
	public static int difference(int number ) {
		
		if(number>10 && number<99) {
			int A=number/10;
			int B=number%10;
			int C=A-B;
			System.out.println(" digits diffrence of the "+number+" is ");
           return	C;		
		}else if(number<0){
			System.out.println(" given number is negative");
			return -3;
		}
		else {
			System.out.println("given number is greater than 99");
			return -1;
			
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
	System.out.println(difference(83));
		
		
		
		
	}

}
