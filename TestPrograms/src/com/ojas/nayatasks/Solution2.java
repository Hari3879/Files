package com.ojas.nayatasks;

public class Solution2 {
	public static int findOptimalProducts(int[] dims) {
		int length= dims.length-1;
		int a=dims[0]*dims[1];
		int b=dims[1]*dims[2];
		int c=dims[2]*dims[3];
		int total=(a+b)*c;
		//System.out.println(total);
		return total;


	}

	
	
	public static int findOptimalProduct(int[] dims) {
		int len = dims.length - 1;
		int[][] arr = new int[len][len];
		for (int i = 2; i <= len; len++) {
			for (int j = 0; j <= len - 1; i++) {
				int a = j + i - 1;
				arr[j][a] = Integer.MAX_VALUE;
				// System.out.println(arr[j][a]);
				for (int k = j; k < a; k++) {
					int b = arr[j][k] + arr[k + 1][j] + dims[j] * dims[k + 1] * dims[j + 1];
					 System.out.println(b/2);
					//arr[j][a] = Math.min(arr[j][a], b);
					if (b < arr[i][j]) {
						arr[i][j] = b;
					}
				}
			}

		}
		return arr[0][len - 1];
	}

	public static void main(String[] args) {
		int[] arr = { 10, 30, 5, 60 };
		System.out.println(findOptimalProducts(arr));
		System.out.println(findOptimalProduct(arr));
	}

}





















//	int n = dims.length - 1;
//	int[][] dp = new int[n][n];
//	for (int len = 2; len <= n; len++) {
//		for (int i = 0; i <= n - len; i++) {
//			int j = i + len - 1;
//			dp[i][j] = Integer.MAX_VALUE;
//			for (int k = i; k < j; k++) {
//				int cost = dp[i][k] + dp[k + 1][j] + dims[i] * dims[k + 1] * dims[j + 1];
//				dp[i][j] = Math.min(dp[i][j], cost);
//			}
//		}
//	}
//	return dp[0][n - 1];
//}