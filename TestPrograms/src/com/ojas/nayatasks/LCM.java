package com.ojas.nayatasks;

public class LCM {

	public static int findLCM(int num1, int num2) {
		if (num1 < 0 || num2 < 0) {
			return -1;
		}
		int max = Math.max(num1, num2);
		int lcm = max;
		while (true) {
			if (lcm % num1 == 0 && lcm % num2 == 0) {
				return lcm;
			}
			lcm += max;
		}
	}

	public static void main(String[] args) {
		System.out.println(findLCM(10, 20));
	}

}
