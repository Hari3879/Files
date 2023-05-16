package com.ojas.test4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ranking {
	public static void rank(int[] arr) {
		Map<Integer, Integer> map=new TreeMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], i);
			
		}
		int rank=1;
		for(var val:map.values()) {
			//System.out.println(arr[val]);
			arr[val]=rank++;
			
		}
		
	}
	 

	public static void main(String[] args) {
		int[] arr={ 10, 8, 15, 12, 6, 20, 1 };
		rank(arr);
		System.out.println(Arrays.toString(arr));

	}

}
