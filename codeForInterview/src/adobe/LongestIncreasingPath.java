package adobe;

import java.util.*;

public class LongestIncreasingPath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int i,j;
        int[][] arr = new int[m][n];
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                arr[i][j] = sc.nextInt();
        int res = 0;
        int[][] dp = new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(dp[i][j] == 0){
                    dfs(arr, dp, i, j, Integer.MIN_VALUE);
                    res = Math.max(res, dp[i][j]);
                }
            }
        }
        System.out.println(res);
    }
    static int dfs(int[][] arr, int[][] dp, int m, int n, int prev){
    	if(m<0 || m>arr.length-1 || n<0 || n>arr[0].length-1 || arr[m][n] <= prev) return 0;

        if(dp[m][n]!=0) return dp[m][n];

        int left = dfs(arr, dp, m, n-1, arr[m][n]);
        int right = dfs(arr, dp, m, n+1, arr[m][n]);
        int up = dfs(arr, dp, m-1, n, arr[m][n]);
        int down = dfs(arr, dp, m+1, n, arr[m][n]);

        dp[m][n] = Math.max(left, Math.max(right, Math.max(up, down)))+1;

        return dp[m][n];
        
    }

}
