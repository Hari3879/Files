package com.ojas.dailytask;

import java.util.ArrayList;

public class MinimumIdex {
	public static void minIdex(int[] arr) {

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					list.add(i);

				} 
			}

		}
		System.out.println("minimum index value of duplicates " + list.get(0));
	}

	public static void main(String[] args) {
		int[] arr = { 5, 6, 3, 4, 3, 6, 4 };
		//int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		minIdex(arr);

		

	}

}