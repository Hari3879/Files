package com.ojas.dailytask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctCombination {
	
	// Function 
    public static void findCombinations(int[] array, int i, int k,
                                        Set<List<Integer>> subarrays,
                                        List<Integer> out)
    {
    	// invalid input
        if (array.length == 0 || k > array.length) {
            return;
        }
 
        // base case: combination size is `k`
        if (k == 0) {
            subarrays.add(new ArrayList<>(out));
            return;
        }
 
        // start from the next index till the last index
        for (int j = i; j < array.length; j++)
        {
            // add current element `A[j]` to the solution and recur for next index
            // `j+1` with one less element `k-1`
            out.add(array[j]);
            findCombinations(array, j + 1, k - 1, subarrays, out);
            out.remove(out.size() - 1);        // backtrack
        }
    }
 
    public static Set<List<Integer>> findCombinations(int[] A, int k)
    {
        Set<List<Integer>> subarrays = new HashSet<>();
        findCombinations(A, 0, k, subarrays, new ArrayList<>());
        return subarrays;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2, 3, 4};
        int k = 2;
 
        // process elements from left to right
        System.out.println(findCombinations(array, k));

	}

}
