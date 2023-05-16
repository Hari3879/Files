package com.ojas.dailytask;
public class N_digit_Increasing {
    
    // Bottom-up approach
    public static void printIncreasingNumbersBottomUp(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        while (true) {
            printArray(arr);
            int i;
            for (i = n-2; i >= 0; i--) {
                if (arr[i] < arr[i+1]) {
                    break;
                }
            }
            if (i < 0) {
                break;
            }
            int j = findSmallestGreaterThan(arr, i);
            swap(arr, i, j);
            reverse(arr, i+1, n-1);
        }
    }
    
    // Top-down approach
    public static void printIncreasingNumbersTopDown(int n) {
        int[] arr = new int[n];
        printIncreasingNumbersTopDownHelper(arr, 0, 1);
    }
    
    private static void printIncreasingNumbersTopDownHelper(int[] arr, int i, int start) {
        if (i == arr.length) {
            printArray(arr);
            return;
        }
        for (int j = start; j <= 9; j++) {
            arr[i] = j;
            printIncreasingNumbersTopDownHelper(arr, i+1, j+1);
        }
    }
    
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
    private static int findSmallestGreaterThan(int[] arr, int i) {
        int smallest = i+1;
        for (int j = i+2; j < arr.length; j++) {
            if (arr[j] > arr[i] && arr[j] < arr[smallest]) {
                smallest = j;
            }
        }
        return smallest;
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    
    // Test the implementation
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Bottom-up approach:");
        printIncreasingNumbersBottomUp(n);
        System.out.println("Top-down approach:");
        printIncreasingNumbersTopDown(n);
    }
}
