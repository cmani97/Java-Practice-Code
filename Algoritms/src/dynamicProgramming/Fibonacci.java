package dynamicProgramming;


/*
 * Dynamic Programming is an algorithmic paradigm that solves a given complex problem by 
 * breaking it into subproblems and stores the results of subproblems to avoid computing 
 * the same results again. Following are the two main properties of a problem that suggests 
 * that the given problem can be solved using Dynamic programming.
 * 
 * 1) Overlapping Subproblems
 * 2) Optimal Substructure
 * 
 * 1) Overlapping Subproblems
 * Like Divide and Conquer, Dynamic Programming combines solutions to sub-problems. 
 * Dynamic Programming is mainly used when solutions of same subproblems are needed again and again. 
 * In dynamic programming, computed solutions to subproblems are stored in a table so that these 
 * don’t have to be recomputed. So Dynamic Programming is not useful when there are no common 
 * (overlapping) subproblems because there is no point storing the solutions if they are not needed 
 * again. For example, Binary Search doesn’t have common subproblems. If we take an example of 
 * following recursive program for Fibonacci Numbers, there are many subproblems which are solved 
 * again and again.
 * 
 *                               
                         fib(5)
                     /             \
               fib(4)                fib(3)
             /      \                /     \
         fib(3)      fib(2)         fib(2)    fib(1)
        /     \        /    \       /    \
  fib(2)   fib(1)  fib(1) fib(0) fib(1) fib(0)
  /    \
fib(1) fib(0)

 * We can see that the function fib(3) is being called 2 times. 
 * If we would have stored the value of fib(3), then instead of computing it again, 
 * we could have reused the old stored value. 
 * There are following two different ways to store the values so that these values can be reused:
 * 
 * a) Memoization (Top Down)
 * b) Tabulation (Bottom Up)

 * -> a) Memoization (Top Down): The memoized program for a problem is similar to the 
 * recursive version with a small modification that it looks into a lookup table before computing 
 * solutions. We initialize a lookup array with all initial values as NIL. Whenever we need 
 * the solution to a subproblem, we first look into the lookup table. If the precomputed value 
 * is there then we return that value, otherwise, we calculate the value and put the result in 
 * the lookup table so that it can be reused later.
 * 
 * 
 *
 * -> b) Tabulation (Bottom Up)
 * The tabulated program for a given problem builds a table in bottom up fashion and returns 
 * the last entry from table. For example, for the same Fibonacci number, we first calculate 
 * fib(0) then fib(1) then fib(2) then fib(3) and so on. So literally, we are building the 
 * solutions of subproblems bottom-up.
 * 
 * 
 * 2) Optimal Substructure: 
 * A given problems has Optimal Substructure Property if optimal solution of the given problem 
 * can be obtained by using optimal solutions of its subproblems.
 * 
 * For example, the Shortest Path problem has following optimal substructure property:
 * If a node x lies in the shortest path from a source node u to destination node v then 
 * the shortest path from u to v is combination of shortest path from u to x and shortest path 
 * from x to v. The standard All Pair Shortest Path algorithms like Floyd–Warshall and Bellman–Ford 
 * are typical examples of Dynamic Programming.

 * On the other hand, the Longest Path problem doesn’t have the Optimal Substructure property. 
 * Here by Longest Path we mean longest simple path (path without cycle) between two nodes. 
 * Consider the following unweighted graph given in the CLRS book. There are two longest paths 
 * from q to t: q→r→t and q→s→t. Unlike shortest paths, these longest paths do not have the 
 * optimal substructure property. For example, the longest path q→r→t is not a combination of 
 * longest path from q to r and longest path from r to t, because the longest path from q to r 
 * is q→s→t→r and the longest path from r to t is r→q→s→t.
 * 
 * 
 */
public class Fibonacci {
	final int MAX = 100;
	final int NIL = -1;
	  
	int lookup[] = new int[MAX];
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
	    int n = 6;
	    f._initialize();
	    System.out.println("Fibonacci number is" + " " + f.fib(n));
	    
	    System.out.println("Tabulation fibb ");
	    System.out.println("Fibonacci number is" + " " + f.tabulationFib(n));
	    
	}
	void _initialize() {
	    for (int i = 0; i < MAX; i++)
	        lookup[i] = NIL;
	}
	int fib(int n) {
	    if (lookup[n] == NIL) {
	      if (n <= 1)
	          lookup[n] = n;
	      else
	          lookup[n] = fib(n-1) + fib(n-2);
	    }
	    return lookup[n];
	}
	int tabulationFib(int n) {
		int f[] = new int[n+1];
	    f[0] = 0;
	    f[1] = 1;
	    for (int i = 2; i <= n; i++)
	          f[i] = f[i-1] + f[i-2];
	    return f[n];
	}
}
