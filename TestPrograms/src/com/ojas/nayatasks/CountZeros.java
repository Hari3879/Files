package com.ojas.nayatasks;

public class CountZeros {

	public static int countZeros(int num) {
		int count = 0;
		if (num < 0) {
			num = -num;
		} else if (num == 0) {
			return 1;
		}
		while (num > 0) {
			if (num % 10 == 0) {
				count++;
			}
			num /= 10;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countZeros( 1234));
	}

}
