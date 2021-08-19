package dynamicProgramming;

import java.util.Arrays;

/*
 Given two strings str1 and str2 and below operations that can performed on str1. Find minimum number of edits (operations) required to convert ‘str1’ into ‘str2’.  

-> Insert
-> Remove
-> Replace
 
 Input:   str1 = "geek", str2 = "gesek"
Output:  1
We can convert str1 into str2 by inserting a 's'.

Input:   str1 = "cat", str2 = "cut"
Output:  1
We can convert str1 into str2 by replacing 'a' with 'u'.


 */

public class EditDistance {

	public static void main(String[] args) {
		String str1 = "sunday";
	    String str2 = "saturday";
	    
	    int m = str1.length();
	    int n = str2.length();
	    System.out.println("Recursive Approch\n Min number of edits are = "+recursiveEditDist(str1, str2, m, n));  // time complexity = pow(3, m)
	    System.out.println("Tabulation Approch\n Min number of edits are = "+tabulationEditDist(str1, str2, m, n)); // O(m*n)
	    int[][] ed = new int[m + 1][n + 1];
	    for(int i = 0; i < m + 1; i++)
	    	Arrays.fill(ed[i], -1);
	    System.out.println("Memoization Approch\n Min number of edits are = "+memoizationEditDist(str1, str2, m, n, ed));
	    
	}
	static int recursiveEditDist(String str1, String str2, int m, int n) {
		if(m == 0) return n;
		if(n == 0) return m;
		if(str1.charAt(m-1) == str2.charAt(n-1))
			return recursiveEditDist(str1, str2, m-1, n-1);
		else
			return 1+Math.min(recursiveEditDist(str1, str2, m-1, n-1), Math.min(recursiveEditDist(str1, str2, m-1, n), recursiveEditDist(str1, str2, m, n-1)));
		
	}
	static int tabulationEditDist(String str1, String str2, int m, int n) {
		int[][] ed = new int[m+1][n+1];
		
		for(int i=0;i<=m;i++) {
			for(int j=0; j<=n;j++) {
				if(i==0)
					ed[i][j] = j;
				else if(j==0)
					ed[i][j] = i;
				else if(str1.charAt(i-1) == str2.charAt(j-1))
					ed[i][j] = ed[i-1][j-1];
				else
					ed[i][j] = 1+Math.min(ed[i-1][j-1], Math.min(ed[i-1][j], ed[i][j-1]));
			}
		}
		return ed[m][n];
	}
	
	static int memoizationEditDist(String str1, String str2, int m, int n, int[][] ed) {
		if(m==0) return n;
		if(n==0) return m;
		
		if(ed[m][n] != -1)
			return ed[m][n];
		
		if(str1.charAt(m-1) == str2.charAt(n-1)) {
			if(ed[m-1][n-1] != -1)
				return ed[m][n] = ed[m-1][n-1];
			else 
				return ed[m][n] = memoizationEditDist(str1, str2, m-1, n-1, ed);
		}else {
			int m1, m2, m3;
			if(ed[m][n-1]!=-1)
				m1 = ed[m][n-1];
			else 
				m1 = memoizationEditDist(str1, str2, m, n-1, ed);
			if(ed[m-1][n] !=-1)
				m2 = ed[m-1][n];
			else
				m2 = memoizationEditDist(str1, str2, m-1, n-1, ed);
			if(ed[m-1][n-1]!=-1)
				m3 = ed[m-1][n-1];
			else
				m3 = memoizationEditDist(str1, str2, m-1, n-1, ed);
			
			return ed[m][n] = 1+Math.min(m1, Math.min(m2, m3));
		}
		
	}
}
