package com.ojas.nayatasks;

class Solution1 {
	
    public static int findInversionCount(int[] nums) {
    	
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
		int[] arr= {1, 9, 6, 4, 5};
		System.out.println("Count:"+findInversionCount(arr));
	}
}



