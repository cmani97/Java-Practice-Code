package dynamicProgramming;

import java.util.Arrays;

public class MatrixChainMultiplication {
	static int[][] dp = new int[100][100];
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 3 };
        int n = arr.length;
 
        for (int[] row : dp)
            Arrays.fill(row, -1);
        System.out.println("Minimum number of multiplications is "+ recursMCM(arr, 1, n - 1));
        System.out.println("Minimum number of multiplications is "+ memoizMCM(arr, 1, n - 1));
        System.out.println("Minimum number of multiplications is "+ tabulaMCM(arr, n));
        
	}

	static int recursMCM(int[] p, int i, int j) {
		if (i == j)
            return 0;
 
        int min = Integer.MAX_VALUE;
        
        for (int k = i; k < j; k++) {
            int count = recursMCM(p, i, k)
                        + recursMCM(p, k + 1, j)
                        + p[i - 1] * p[k] * p[j];
 
            if (count < min)
                min = count;
        }
        
        return min;
	}
	static int memoizMCM(int[] p, int i, int j) {
		if(i==j) return 0;
		if(dp[i][j] != -1)
			return dp[i][j];
		dp[i][j] = Integer.MAX_VALUE;
		for(int k=i;k<j;k++)
			dp[i][j] = Math.min(dp[i][j], memoizMCM(p, i, k)+memoizMCM(p, k+1, j)+p[i-1]*p[k]*p[j]);
		return dp[i][j];
	}
	
	static int tabulaMCM(int[] p, int n) {
		int m[][] = new int[n][n];
        int i, j, k, L, q;
        for (i = 1; i < n; i++)
            m[i][i] = 0;
        
        return 1;
	}
}
