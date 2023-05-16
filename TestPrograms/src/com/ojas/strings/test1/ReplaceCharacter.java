package com.ojas.strings.test1;

public class ReplaceCharacter {
	static void replaceCharWithOccurenceAtNewCharacter(String str) {
		char array[] = str.toCharArray();
		char res[] = new char[array.length];
		String result = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '0')
				continue;
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					array[j] = '0';
				}
			}
			for (int j = 0; j < res.length; j++) {
				if (i == j)
					res[j] = array[i];
				else if (str.charAt(j) == array[i]) {
					res[j] = (char) (count + 48);
				}
			}
		}
		for (int i = 0; i < res.length; i++) {
			result += res[i];
		}
		System.out.println((result));
	}

	public static void main(String[] args) {
		String str = "abbcccddddd";
		replaceCharWithOccurenceAtNewCharacter(str);
	}
}
