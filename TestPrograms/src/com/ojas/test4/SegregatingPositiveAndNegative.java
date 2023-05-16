package com.ojas.test4;

import java.util.Arrays;

public class SegregatingPositiveAndNegative {
	public static void MoveZerosToEnd(int[] arr) {
		int n = arr.length;
		int p = n-1;
		int k = 0;
		int[] temp=new int[n];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]< 0) {
				temp[k] = arr[i];
				k++; 
			} else {
				temp[p] = arr[i];
				p--;
			}
		}
	
		System.out.println(Arrays.toString(temp));
		;

	}

	public static void main(String[] args) {
		int[] arr= {9, -3, 5, -2, -8, -6, 1, 3};
		MoveZerosToEnd(arr);
	}

}
