package com.ojas.dailytask;
import java.util.*;
public class GetTheLeastKey { 
	public static void getKey() {
		TreeMap < Integer, Integer > tree_map = new TreeMap < Integer, Integer > ();

		  tree_map.put(1, 17);
		  tree_map.put(2, 15);
		  tree_map.put(3,16);
		  tree_map.put(4,56);
		  tree_map.put(5,12);
		  System.out.println( tree_map);
		  System.out.println("Key greater than or equal to 2: " + tree_map.ceilingKey(2));
		  System.out.println("Key greater than or equal to 5: " + tree_map.ceilingKey(5));
		  System.out.println("Key greater than or equal to 4: " + tree_map.ceilingKey(4));
		 }
		
	
			public static void main(String args[]) {
               getKey();
          }
}
