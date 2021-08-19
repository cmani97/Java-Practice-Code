package dynamicProgramming;

import java.util.Arrays;

/*
Given a value N, if we want to make change for N cents, and we have infinite supply of each of 
S = { S1, S2, .. , Sm} valued coins, how many ways can we make the change? The order of coins doesn’t 
matter.


For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. 
So output should be 4. For N = 10 and S = {2, 5, 3, 6}, there are five solutions: {2,2,2,2,2}, 
{2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}. So the output should be 5.
 */
public class CoinChange {
	public static void main(String args[]) {
		int[] arr = {1,2,3};
		int m = arr.length;
		int n = 4;
		System.out.println("Recursive Approch\nCoin Changes = "+recurCoinChange(arr, m,n));  // time = O()
		System.out.println("Memoization Approch\nCoin Changes = "+table1CoinChange(arr, m,n)); // time = O(mn)
		System.out.println("Recursive Approch\nCoin Changes = "+table2CoinChange(arr, m,n));  //  (reduced)space = O(n)
		
	}
	/*
	 C() --> count()
                             C({1,2,3}, 5)                     
                           /             \    
                         /                 \                  
             C({1,2,3}, 2)                 C({1,2}, 5)
            /       \                      /      \         
           /         \                    /         \   
C({1,2,3}, -1)  C({1,2}, 2)        C({1,2}, 3)    C({1}, 5)
               /    \             /     \           /     \
             /       \           /       \         /        \
    C({1,2},0)  C({1},2)   C({1,2},1) C({1},3)    C({1}, 4)  C({}, 5)
                   / \     / \        /\         /     \         
                  /   \   /   \     /   \       /       \  
                .      .  .     .   .     .   C({1}, 3) C({}, 4)
                                               / \ 
                                              /   \   
                                             .      .
	 */
	static int recurCoinChange(int[] s, int m, int n) {
		if(n==0) return 1;
		if(n<0) return 0;
		if(m<=0 && n>=1) return 0;
		return recurCoinChange(s, m-1,n)+recurCoinChange(s, m, n-s[m-1]);
	}
	static long table1CoinChange(int[] s, int m, int n) {
		long[] t = new long[n+1];
		Arrays.fill(t, 0);
		t[0] = 1;
		for(int i=0;i<m;i++) {
			for(int j=s[i];j<=n;j++) {
				t[j] += t[j-s[i]];
			}
		}
		return t[n];
	}
	static int table2CoinChange(int[] s, int m, int n) {
		int table[]=new int[n+1];
		 
	    table[0] = 1;
	 
	    for(int i=0; i<m; i++)
	        for(int j=s[i]; j<=n; j++)
	            table[j] += table[j-s[i]];
	 
	    return table[n];
	}
}
