package com.ojas.test2;

public class MaxOccurence {
	public static void maxOcrence(int[] arr) {
		int[] fr = new int[arr.length];
		int n = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;

					fr[j] = n;
					
					
				}
			}
	if (fr[i] != n)
				fr[i] = count;

		}

		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != n)
				System.out.print("" + arr[i] + ":" + fr[i] + "  ");
			
		}
		int max=fr[0];
		
		for(int i=0;i < fr.length;i++) {
			if(fr[i]>max)
				System.out.println(fr[i]);
		}

	}


	public static void main(String[] args) {
		int[] arr={4,5,5,5,5,5, 3, 6, 8, 4, 6, 2, 4, 5, 9, 7, 4};
		maxOcrence(arr);
		// TODO Auto-generated method stub

	}

}
