package com.ojas.nayatasks;

public class NumbersPattern {
	public static String NumberPattern4(int rows) {
		if (rows <= 0) {
			return "-2";
		}

		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				sb.append(count * j).append(" ");
			}
			sb.append("\n");
			count++;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		int rows = 5;
		System.out.println(NumberPattern4(rows));

	}

}
