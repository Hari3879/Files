package com.ojas.dailytask;
import java.util.*;



public class ZeroSumSubarray {
    public static boolean hasZeroSumSubarray(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (set.contains(sum) || sum == 0) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        if (hasZeroSumSubarray(arr)) {
            System.out.println("Subarray with zero-sum exists");
        } else {
            System.out.println("Subarray with zero-sum does not exist");
        }
    }
}
	


