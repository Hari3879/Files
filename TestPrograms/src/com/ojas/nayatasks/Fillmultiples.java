package com.ojas.nayatasks;


	public class Fillmultiples {
		public static int[] getMultiplesArray(int number) {
			if (number <= 0) {
				return null;
			}

			int[] multiples = new int[10];
			for (int i = 1; i <= 10; i++) {
				multiples[i - 1] = number * i;
			}

			return multiples;
		}

	public static void main(String[] args) {
		int num=10;
		System.out.println(getMultiplesArray(num).toString());

	}

}
