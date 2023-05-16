package com.ojas.dailytask;

import java.util.Arrays;

public class RplaceElementsWithProduct {

	public static void findProduct(int[] Product) {

		int num = Product.length;

		if (num == 0) {
			return;
		}
		int[] left = new int[num];
		int[] right = new int[num];

		left[0] = 1;
		for (int i = 1; i < num; i++) {
			left[i] = Product[i - 1] * left[i - 1];
		}

		right[num - 1] = 1;
		for (int j = num - 2; j >= 0; j--) {
			right[j] = Product[j + 1] * right[j + 1];
		}

		for (int i = 0; i < num; i++) {
			Product[i] = left[i] * right[i];
		}
	}

	public static void main(String[] args) {

		int[] Product = { 1, 2, 3, 4, 5 };

		findProduct(Product);

		System.out.println(Arrays.toString(Product));
	}

}
