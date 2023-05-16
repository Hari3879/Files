package com.ojas.dailytask;
public class MinimumIdexDiffrence {

	public static void findDiffIndex(int []array){
		int x=3,y=2;
		int diff=0;
		int k=0;
		int p=0;
		for(int i=0;i<array.length;i++){
			
			for(int j=i+1;j<array.length;j++){
				
				if(y==array[j]){
					 k=j;
				}
				if(x==array[j]){
					 p=j;
				}
				diff=p-k;
				
			}
		}
		if(diff>0){
			System.out.println("index differece gap is "+diff);
		}
		
	}

	public static void main(String[] args) {
		int []arr = { 1, 3, 5, 4, 8, 2, 4, 3, 6, 5 };
		int x = 3, y = 2;
		findDiffIndex(arr);
	}
}
