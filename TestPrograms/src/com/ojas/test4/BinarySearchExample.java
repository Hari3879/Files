 package com.ojas.test4;

public class BinarySearchExample{
 public static void binarySearch(int arr[], int first, int last, int key){
   int mid = (first + last)/2;
   while( first <= last ){
      if ( arr[mid] < key ){
    	 // System.out.println(arr[mid]);
        first = mid + 1;   
      }else if ( arr[mid] == key ){
        System.out.println("Element is found at index: " + mid);
        break;
      }else{
         last = mid - 1;
      }
      mid = (first + last)/2;
   }
   if ( first > last ){
      System.out.println("Element is not found!");
   }
 }
 public static void main(String args[]){
		int arr[] = {10,20,30,40,50,70};
		int arr1[]= {2, 3, 5, 7, 9};
		int i=7;
		int key = 20;
        int last=arr.length-1;
		binarySearch(arr,0,last,key);
		binarySearch(arr1, 0, arr1.length-1, i);
		
 }
}
