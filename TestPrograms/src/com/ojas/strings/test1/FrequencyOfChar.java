package com.ojas.strings.test1;

public class FrequencyOfChar {

	public static void main(String[] args) {
		String str = "helloAll";
		Freq(str);
	}

	public static void Freq(String str) {
		str = str.trim();
		char arr[] = str.toCharArray();
		int[] fr = new int[arr.length];
		int n = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;

					fr[j] = n;

				}
			}
			if (fr[i] != n)
				fr[i] = count;

		}

		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != n)
				System.out.print("" + arr[i] + ":" + fr[i] + "  ");
		}

	}
}
