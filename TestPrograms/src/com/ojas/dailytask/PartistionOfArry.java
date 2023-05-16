package com.ojas.dailytask;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PartistionOfArry {
	
	public static void printArry(int[] arr,int i,int j) {
		System.out.println(IntStream.rangeClosed(i, j).mapToObj(k->arr[k]).collect(Collectors.toList()));
	}
	
	public static int partition(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int left_sum = 0;
			for (int j = 0; j < arr.length; j++) {
				left_sum += arr[j];

			}
			int right_sum = 0;
			for (int j = i; j < arr.length; j++) {
				right_sum += arr[j];
			}
			if (left_sum == right_sum) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 6, -4, -3, 2, 3 };
		int i=partition(arr);
		if(i!=-1) {
			printArry(arr, 0, i-1);
			printArry(arr, i, arr.length-1);
			
		}else {
			System.out.println("cant ");
		}

	}

}
