package com.ojas.dailytask;

import java.util.ArrayList;

public class IndexRepeating {

	public static void minimumindex(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++)

				if (arr[i] == arr[j])
					list.add(i);
		}
		System.out.println(list.get(2));

	}

	public static void main(String[] args) {
		// int[] arr = { 1,2,3,4,5,6 };
		int[] arr = { 5, 6, 3, 4, 3, 6, 4 };
		minimumindex(arr);
	}
}
