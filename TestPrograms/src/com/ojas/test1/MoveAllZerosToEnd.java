package com.ojas.test1;

import java.util.Arrays;

public class MoveAllZerosToEnd {
	public static void MoveZerosToEnd(int[] arr) {
		int n = arr.length;
		int p = n-1;
		int k = 0;
		int[] temp=new int[n];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
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
		int[] arr={ 6, 0, 8, 2, 3, 0, 4, 0, 1 };
		MoveZerosToEnd(arr);

	}

}
