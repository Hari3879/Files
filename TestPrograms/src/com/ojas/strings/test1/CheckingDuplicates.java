package com.ojas.strings.test1;

public class CheckingDuplicates {
	static boolean isContainsDuplicates(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					return true;
			}
		}
		return false;
	}

	static String maxPossibleSubArray(String str) {
		char[] array = str.toCharArray();
		int maxCount = 0, indexStart = 0;

		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = i + 1; j < array.length; j++) {
				String subString = str.substring(i, j);
				count = subString.length();
				if (isContainsDuplicates(subString)) {
					continue;
				} else if (maxCount < count) {
					indexStart = i;
					maxCount = count;
				}
			}
		}
		int indexEnd = indexStart + maxCount;
		String result = "";
		for (int i = indexStart; i < indexEnd; i++) {
			result += str.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
		String str = "aeroplaneisfilledwithemployees";
		String str1 = "abcdbea";
		isContainsDuplicates(str1);
		
		System.out.println("Max possible substring is : " + maxPossibleSubArray(str));
	}
}