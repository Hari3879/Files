package com.ojas.dailytask;

public class CharOfStringFollowSpecificPattern {
	public static void FollowSpecificpattern() {
		String input="ABC123";
		String pattern="^[A-z]{3}\\d{3}$";
		if(input.matches(pattern)) {
			System.out.println("it follows pattern");
		}else{
			System.out.println("not follows pattern");
			
		}
	}

	public static void main(String[] args) {
		FollowSpecificpattern();

	}

}
