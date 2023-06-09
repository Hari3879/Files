package com.ojas.dailytask;

import java.util.Arrays;

public class MaxHeapToMinHeap {
	private static int LEFT(int i) {
        return (2*i + 1);
    }
 

    private static int RIGHT(int i) {
        return (2*i + 2);
    }
 
    private static void heapify(int[] A, int i, int size)
    {
   
        int left = LEFT(i);
        int right = RIGHT(i);
 
        int smallest = i;

        if (left < size && A[left] < A[i]) {
            smallest = left;
        }
 
        if (right < size && A[right] < A[smallest]) {
            smallest = right;
        }
 
      
        if (smallest != i)
        {
            swap(A, i, smallest);
            heapify(A, smallest, size);
        }
    }
 
 
    private static void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void convert(int[] A)
    {
        int i = (A.length - 2) / 2;
        while (i >= 0) {
            heapify(A, i--, A.length);
        }
    }
}
 
class Main
{
    public static void main(String[] args)
    {
      
        int[] A = { 9, 4, 7, 1, -2, 6, 5 };
 
      
        MaxHeapToMinHeap.convert(A);
 
       
 
        System.out.println(Arrays.toString(A));
    }
}

