package com.ojas.nayatasks;

public class RotateString {
	public static String rotate(String str, int no_of_positions) {
		if (str == null) {
			return null;
		}

		int len = str.length();

		if (no_of_positions <= 0) {
			return str;
		}

		int effective_no_of_positions = no_of_positions % len;
		String rotated_str = str.substring(effective_no_of_positions) + str.substring(0, effective_no_of_positions);

		return rotated_str;
	}

	public static void main(String[] args) {
		String s = "aabbccss";
		System.out.println(rotate(s, 2));
	}

}
