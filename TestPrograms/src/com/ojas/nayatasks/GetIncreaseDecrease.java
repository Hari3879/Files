package com.ojas.nayatasks;

public class GetIncreaseDecrease {
	public static int[] getIncreaseDecrease(int n) {
	    if (n <= 1 || n > 20) {
	        return null;
	    }

	    int[] result = new int[2 * n - 1];
	    int index = 0;

	    for (int i = 1; i <= n; i++) {
	        result[index++] = i;
	    }

	    for (int i = n - 1; i > 0; i--) {
	        result[index++] = i;
	    }

	    return result;
	}

	public static void main(String[] args) {
		int number=5;
		System.out.println(getIncreaseDecrease(number).toString());

	}

}
