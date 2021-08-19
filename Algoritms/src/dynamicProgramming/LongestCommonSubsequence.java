package dynamicProgramming;


/*
 LCS Problem Statement: 
 Given two sequences, find the length of longest subsequence present in both of them. 
 A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. 
 For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”.
 
 */
public class LongestCommonSubsequence {
	
	public static void main(String[] args) {
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		String s1 = "AGGTAB";
	    String s2 = "GXTXAYB";
	  
	    char[] X=s1.toCharArray();
	    char[] Y=s2.toCharArray();
	    int m = X.length;
	    int n = Y.length;
	    
	    System.out.println("Reccursive Approch1\nLength of LCS is" + " " +lcs.reccursiveLCS( X, Y, m, n )+"time complexity =  pow(2, n)");
	    System.out.println("Reccursive Approch2\nLength of LCS is" + " " +lcs.LCS( X, Y, m, n, 0, 0)+"time complexity =  pow(2, n)");
	    System.out.println("Tabulation Approch\nLength of LCS is" + " " +lcs.tabulationLCS( X, Y, m, n )+"time complexity =  m*n");
	    
	}
	static int reccursiveLCS(char[] X, char[] Y, int m, int n) {
		
		if(m==0 || n==0) return 0;
		
		if(X[m-1] == Y[n-1])
			return reccursiveLCS(X, Y, m-1, n-1)+1;
		else
			return Math.max(reccursiveLCS(X, Y, m-1, n),  reccursiveLCS(X, Y, m, n-1));
	}
	
	static int LCS(char[] X, char[] Y, int m, int n, int i, int j) {
		
		if(i==m || j==n) return 0;
		
		if(X[i] == Y[j])
			return LCS(X, Y, m, n, i+1, j+1)+1;
		else
			return Math.max(LCS(X, Y, m, n, i+1, j),  LCS(X, Y, m, n, i, j+1));
	}
	
	static int tabulationLCS(char[] X, char[] Y, int m, int n) {
		int[][] lcs = new int[m+1][n+1];
		
		for(int i=0;i<=m;i++) {
			for(int j=0; j<=n; j++) {
				if(i==0 || j==0)
					lcs[i][j] = 0;
				else if(X[i-1] == Y[j-1])
					lcs[i][j] = lcs[i-1][j-1]+1;
				else
					lcs[i][j] = Math.max(lcs[i][j-1],lcs[i-1][j]);
			}
		}
		return lcs[m][n];
	}
}
