package com.ojas.strings.test1;

public class MaxminChar {

	static void maxMinOccuranceCharacters(String s) {
		char[] arr = s.toCharArray();
		int minRepeatedCount = s.length(), maxRepeatedCount = 0;
		int maxOccuranceCharIndex = 0, minOccuranceCharIndex = 0;
		int repeated_Word_Index = 0;
		boolean bool = true;
		System.out.print("Minimum occured characters are: ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '0')
				continue;
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (arr[i] == arr[j]) {
					arr[j] = '0';
					repeated_Word_Index = i;
					count++;
				}
			}
			if (count > maxRepeatedCount) {
				maxRepeatedCount = count;
				maxOccuranceCharIndex = i;
			}
			if (count == 1) {
				bool = false;
				minRepeatedCount = count;
				minOccuranceCharIndex = i;
				if (repeated_Word_Index != minOccuranceCharIndex) {
					System.out.print(arr[minOccuranceCharIndex] + " ");
				}
			}
			if (count < minRepeatedCount && bool) {
				minRepeatedCount = count;
				minOccuranceCharIndex = i;
			}
		}
		System.out.println("\nMax occurued character is " + s.charAt(maxOccuranceCharIndex) + ", repeated "
				+ maxRepeatedCount + " times");
	}

	public static void main(String[] args) {
		String str = "aahhhhbaabhhhhhhaazhhhhhhqbbbbhhhhhhwqwshhhhhhhhhh";
		maxMinOccuranceCharacters(str);
	}
}
