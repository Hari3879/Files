package com.ojas.dailytask;


import java.util.Arrays;

public class FindQudruplets {
	
	public static void find(int[] A,int n,int s ) {
		// Select the first element and find other three
		for (int i = 0; i < n - 3; i++)
		{
		    // Select the second element and find other two
		    for (int j = i + 1; j < n - 2; j++)
		    {
		         
		        // Select the third element and find the fourth
		        for (int k = j + 1; k < n - 1; k++)
		        {
		            // Find the fourth element
		            for (int l = k + 1; l < n; l++)
		            if (A[i] + A[j] + A[k] + A[l] == s) //Comparing the sum with S
		                
		            System.out.println(" "+A[i]+" "+A[j]+" "+A[k]+" "+A[l]);
		        }
		    }
		}
			
		}
		

	
		
	

	public static void main(String[] args) {
		int[] A = { 2, 7, 4, 0, 9, 5, 1, 3 };
		int s= 20;
		int n=A.length;
		
		find(A,n,s);
	}

}
