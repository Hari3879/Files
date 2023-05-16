package com.ojas.test3;

import java.util.Arrays;

public class MissingNumber2 {
	public static void missingNumber(int[] arr) {
		int n = arr.length;
		int sum = ((n + 1) * (n + 2)) / 2;


		//Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {

			sum =sum- arr[i];
			
		}
		System.out.println(sum);
		

	}
//
//			}
//		}
//		System.out.println(missingNumber);

	public static void main(String[] args) {
		int[] arr = { 3, 2, 4, 6, 1 };
		int[] arr1= { 3, 2, 4, 5, 6 };
		int[] arr2={ 3, 2, 4, 5, 1 };
		int[] arr3={1, 2, 3, 4, 5, 7, 8, 9, 10};
		
		missingNumber(arr);
		missingNumber(arr1);
		missingNumber(arr2);
		missingNumber(arr3);
	}

}
