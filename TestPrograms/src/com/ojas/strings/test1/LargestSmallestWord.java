package com.ojas.strings.test1;

public class LargestSmallestWord {
	static void findLargestSmallestWords(String s) {
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		String[] arr = s.split(" ", count);
		int largest = arr[0].length(), smallest = arr[0].length();
		int largeIndex = 0, smallIndex = 0;
		for (int i = 1; i < count; i++) {
			if (largest < arr[i].length()) {
				largest = arr[i].length();
				largeIndex = i;
			}
			if (smallest > arr[i].length()) {
				largest = arr[i].length();
				smallIndex = i;
			}
		}
		System.out.println("Largest word is: " + arr[largeIndex]);
		System.out.println("Smallest word is: " + arr[smallIndex]);
	}

	public static void main(String[] args) {
		String str = "I am planning a trip to go Meghalaya";
		findLargestSmallestWords(str);
	}
}
