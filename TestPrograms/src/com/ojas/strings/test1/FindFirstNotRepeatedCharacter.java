package com.ojas.strings.test1;

public class FindFirstNotRepeatedCharacter {
	static void findFirstNotRepeatedCharacter(String str) {
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '0')
				continue;
			int count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
					c[j] = '0';
				}
			}
			if (count == 1) {
				System.out.println("First not repeated character in given string is : " + str.charAt(i));
				return;
			}
		}
		System.out.println("All characters are repeated.");

	}

	public static void main(String[] args) {
		String str = "abccftsatbf";
		findFirstNotRepeatedCharacter(str);
	}
}
