package com.ojas.test2;

public class DuplicatesWithinaRange {
	public static boolean duplicateswithinarange(int[] arr, int k) {

		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			int range = k;
			while (range > 0 && j < arr.length) {
				if (arr[i] == arr[j]) {
					//System.out.println("element " + arr[i] + " is repeated with in the raange " + k);
					return true;
				}
				j++;
				range--;

			}
		}

		return false;

	}

	public static void main(String[] args) {
		int[] arr = { 5, 6, 8, 2, 4, 6, 9 };
		int[] arr1={ 5, 6, 8, 2, 4, 6, 9 };
		 int nums[] = { 1, 2, 3, 2, 1 };

		if (duplicateswithinarange(arr, 4)) {
			System.out.println("Duplicates found");
		} else {
			System.out.println("not found");
		}
		if (duplicateswithinarange(arr1, 2)) {
			System.out.println("Duplicates found");
		} else {
			System.out.println("not found");
		}
		
		if (duplicateswithinarange(nums, 7)) {
			System.out.println("Duplicates found");
		} else {
			System.out.println("not found");
		}

	}

}
