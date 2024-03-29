package dynamicProgramming;


/*
 Given a cost matrix cost[][] and a position (m, n) in cost[][], write a function that 
 returns cost of minimum cost path to reach (m, n) from (0, 0). Each cell of the matrix 
 represents a cost to traverse through that cell. The total cost of a path to reach (m, n) 
 is the sum of all the costs on that path (including both source and destination). 
 You can only traverse down, right and diagonally lower cells from a given cell, i.e., 
 from a given cell (i, j), cells (i+1, j), (i, j+1), and (i+1, j+1) can be traversed. 
 You may assume that all costs are positive integers.
 
 For example, in the following figure, what is the minimum cost path to (2, 2)?  
 
   {1, 2, 3}
   {4, 8, 2}
   {1, 5, 3}
 
 The path with minimum cost is highlighted in the following figure. 
 The path is (0, 0) �> (0, 1) �> (1, 2) �> (2, 2). The cost of the path is 8 (1 + 2 + 2 + 3).  
 */
public class MinCostPath {
	
	public static void main(String[] args) {
		int cost[][] = { {1, 2, 3},
                		{4, 8, 2},
                		{1, 5, 3} };
		System.out.println("Recursive Approch\nMin Cost Path is = "+ReccurMinCost(cost, 2, 2));
		System.out.println("Time & space Save using DP Approch\nMin Cost Path is = "+DPMinCost1(cost, 2, 2));
		System.out.println("more Space Save using DP another Approch\nMin Cost Path is = "+DPMinCost2(cost, 2, 2));
                 
	}
	static int ReccurMinCost(int[][] cost, int m, int n) {
		if(m<0 || n<0)
			return Integer.MAX_VALUE;
		if(m==0 && n==0)
			return cost[m][n];
		else
			return Math.min(ReccurMinCost(cost, m-1, n-1), Math.min(ReccurMinCost(cost, m-1, n), ReccurMinCost(cost, m, n-1)))+cost[m][n];
	}
	static int DPMinCost1(int[][] cost, int m, int n) {
		int tc[][] = new int[m+1][n+1];
		tc[0][0] = cost[0][0];
		for(int i=1;i<=m;i++)
			tc[i][0] = tc[i-1][0]+cost[i][0];
		for(int j=1;j<=n;j++)
			tc[0][j] = tc[0][j-1]+cost[0][j];
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				tc[i][j] = Math.min(tc[i-1][j-1], Math.min(tc[i-1][j], tc[i][j-1]))+cost[i][j];
			}
		}
		return tc[m][n];
	}
	static int DPMinCost2(int[][] cost, int m, int n) {
		for(int i=1;i<=m;i++)
			cost[i][0] += cost[i-1][0];
		for(int j=1;j<=n;j++)
			cost[0][j] += cost[0][j-1];
		for(int i=1;i<=m;i++)
			for(int j=1;j<=n;j++)
				cost[i][j] += Math.min(cost[i-1][j-1], Math.min(cost[i-1][j], cost[i][j-1]));
		return cost[m][n];
	}
}
