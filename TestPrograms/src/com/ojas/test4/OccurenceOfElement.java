package com.ojas.test4;

public class OccurenceOfElement {

	public static void occurence(int[] arr, int a) {
		int n = arr.length;
		int f = -1;
		int l = -1;
		for (int i = 0; i < n; i++) {
			if (a != arr[i])
				continue;
			if (f == -1)
				f = i;
			l = i;
		}
		if (f != -1) {
			System.out.println(f);
			System.out.println(l);
		} else {
			System.out.println("not found");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 5, 5, 6, 6, 8, 9, 9, 9 };
		int[] arr1= {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
		occurence(arr, 5);
		occurence(arr1, 4);

		// TODO Auto-generated method stub

	}

}
