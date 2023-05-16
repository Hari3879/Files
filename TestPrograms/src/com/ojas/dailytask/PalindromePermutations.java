package com.ojas.dailytask;

import java.util.*;

class PalindromePermutations {

	static int MAX_CHAR = 26;

	static void countFreq(char str[], int freq[], int n) {

		for (int i = 0; i < n; i++)
			freq[str[i] - 'a']++;
	}

	static Boolean canMakePalindrome(int freq[], int n) {

		int count_odd = 0;

		for (int i = 0; i < MAX_CHAR; i++)
			if (freq[i] % 2 != 0)
				count_odd++;

		if (n % 2 == 0) {
			if (count_odd > 0)
				return false;
			else
				return true;
		}

		if (count_odd != 1)
			return false;

		return true;
	}

	static char findOddAndRemoveItsFreq(int freq[]) {

		char odd_char = 'a';

		for (int i = 0; i < MAX_CHAR; i++) {
			if (freq[i] % 2 != 0) {
				freq[i]--;
				odd_char = (char) (i + 'a');
				break;
			}
		}

		return odd_char;
	}

	static boolean findPalindromicString(char[] str, int n) {
		int[] freq = new int[MAX_CHAR];
		countFreq(str, freq, n);

		if (!canMakePalindrome(freq, n))
			return false;

		char odd_char = findOddAndRemoveItsFreq(freq);

		int front_index = 0, rear_index = n - 1;

		for (int i = 0; i < MAX_CHAR; i++) {
			if (freq[i] != 0) {
				char ch = (char) (i + 'a');

				for (int j = 1; j <= freq[i] / 2; j++) {
					str[front_index++] = ch;
					str[rear_index--] = ch;
				}
			}
		}

		if (front_index == rear_index)
			str[front_index] = odd_char;

		return true;
	}

	static void reverse(char[] str, int i, int j) {
		char temp;
		while (i < j) {
			temp = str[i];
			str[i] = str[j];
			str[j] = temp;

			i++;
			j--;
		}
	}

	static Boolean nextPalin(char[] str, int n) {

		if (n <= 3)
			return false;

		int mid = n / 2 - 1;
		int i, j;

		for (i = mid - 1; i >= 0; i--)
			if (str[i] < str[i + 1])
				break;

		if (i < 0)
			return false;

		int smallest = i + 1;
		for (j = i + 2; j <= mid; j++)
			if (str[j] > str[i] && str[j] < str[smallest])
				smallest = j;

		char temp;

		temp = str[i];
		str[i] = str[smallest];
		str[smallest] = temp;

		temp = str[n - i - 1];
		str[n - i - 1] = str[n - smallest - 1];
		str[n - smallest - 1] = temp;

		reverse(str, i + 1, mid);

		if (n % 2 == 0)
			reverse(str, mid + 1, n - i - 2);

		else
			reverse(str, mid + 2, n - i - 2);

		return true;
	}

	static void printAllPalinPermutations(char[] str, int n) {

		if (!(findPalindromicString(str, n))) {

			System.out.print("-1");
			return;
		}

		do {
			System.out.println(str);
		} while (nextPalin(str, n));
	}

	public static void main(String[] args) {

		char[] str = ("xyxzwxxyz").toCharArray();
		int n = str.length;

		printAllPalinPermutations(str, n);
	}
}
