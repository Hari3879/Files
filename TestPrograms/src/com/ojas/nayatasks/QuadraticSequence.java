package com.ojas.nayatasks;

public class QuadraticSequence {
	public static String getQuadricSequence(int n) {
		if (n <= 0) {
			return null;
		}
		int[] sequence = new int[n];
		sequence[0] = 1;
		int increment = 2;
		int index = 1;
		while (index < n) {
			for (int i = 0; i < increment && index < n; i++) {
				sequence[index] = sequence[index - 1] + increment;
				System.out.println(sequence[index]);
				increment++;
				index++;
			}
			increment--;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(sequence[i]);
			if (i != n - 1) {
				sb.append(",");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
System.out.println(getQuadricSequence(5));
	}

}
