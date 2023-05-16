package com.ojas.dailytask;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountDistinct {
	public static void findCount(int []array){
		int count=0;
		Set set=new HashSet();
		for(int i=0;i<array.length;i++){
			
				if(array[i]>=0){
					if(set.add(array[i])){
						count++;
					}
				}
			
		}
		
		
		
		System.out.print("total absolute value "+count+" and value");
		System.out.print(set);
	}

	public static void main(String[] args) {
		int []array={ -2, -1, 0, 1, 2, 3 };
		//int[]array={ -1, -1, 0, 1, 1, 1 };
	
		
		findCount(array);
		
	}

}
