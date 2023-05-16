package com.ojas.nayatasks;

public class ScoreOfString {
	public static int getNameScore(String name) {
		if (name == null || name.isEmpty()) {
			return -1;
		}
		int score = 0;
		for (int i = 0; i < name.length(); i++) {

			char c = name.charAt(i);
			if (!Character.isLetter(c)) {

				return -1;

			}
			if (Character.isLowerCase(c)) {

				score += (int) c - 96;

			} else {

				score += (int) c - 64;

			}

		}

		return score;

	}

	public static void main(String[] args) {
		String name = "abc";
		System.out.println(getNameScore(name));;
	}

}
