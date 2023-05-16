package com.ojas.strings.test1;

public class RemoveDuplicates {
	static void Print_after_removing_Duplicate_Characters(String s) {
		char[] array_of_char = s.toCharArray();
		System.out.print("String after removing duplicate characters.. : ");
		String res = "";
		for (int i = 0; i < array_of_char.length - 1; i++) {
			if (array_of_char[i] == '0')
				continue;
			for (int j = i + 1; j < array_of_char.length; j++) {
				if (array_of_char[i] == array_of_char[j]) {
					array_of_char[j] = '0';
				}
			}
			res += array_of_char[i];
		}
		System.out.print(res);
	}

	public static void main(String[] args) {
		String str = "abcccddeeee";
		Print_after_removing_Duplicate_Characters(str);
	}
}
