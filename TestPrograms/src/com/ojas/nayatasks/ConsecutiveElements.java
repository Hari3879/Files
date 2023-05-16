package com.ojas.nayatasks;

	public class ConsecutiveElements {
	    
	    public static boolean containsConsecutiveElements(int[] a, int target) {
	        int sum = 0;
	        int start = 0;
	        for (int i = 0; i < a.length; i++) {
	            sum += a[i];
	            while (sum > target && start <= i) {
	                sum -= a[start];
	                start++;
	            }
	            if (sum == target) {
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    public static int validateInputs(int[] a, int target) {
	        if (a.length == 0) {
	            return -1;
	        }
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] <= 0) {
	                return -2;
	            }
	        }
	        if (target <= 0) {
	            return -3;
	        }
	        return 1;
	    }
	
	public static void main(String[] args) {
		int[] a = {1, 3, 5, 7, 9};
		int target=15;
System.out.println(containsConsecutiveElements(a, target));
	}

}
