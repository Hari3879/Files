package com.ojas.test1;

import java.util.Arrays;

public class MoveAllZerosToStartPosition {
	public static void moveZeros(int[] arr) {
		int n = arr.length;
		int p = 0;
		int k = n - 1;
		int[] temp=new int[n];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]  == 0) {
				temp[p] = arr[i];
				p++; 
			} else {
				temp[k] = arr[i];
				k--;
			}
		}
	
		System.out.println(Arrays.toString(temp));
		;

	}


	public static void main(String[] args) {
		int[] arr={ 1, 0, 1, 0, 1, 0, 0, 1 };
		moveZeros(arr);

	}

}
