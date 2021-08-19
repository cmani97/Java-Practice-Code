package dynamicProgramming;

/*

Input: arr[] = {3, 10, 2, 1, 20}
Output: Length of LIS = 3
The longest increasing subsequence is 3, 10, 20

Input: arr[] = {50, 3, 10, 7, 40, 80}
Output: Length of LIS = 4
The longest increasing subsequence is {3, 7, 40, 80}

 */
public class LongestIncreasingSubsequence {
	static int max_ref = 1;
	public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        System.out.println("Reccursive Approch \nLength of Longest Increasing Subsequence is " + recursiveLIS(arr, n));
        System.out.println("Itterative/Tabulatioin Approch \nLength of Longest Increasing Subsequence is " + itterAndTabulationLST(arr, n));

	}
	static int recursiveLIS(int[] arr, int n) {
		max_ref = 1;
		_recursiveLIS(arr, n);
 
		return max_ref;
	}
	static int _recursiveLIS(int[] arr, int n) {
		if(n == 1) return 1;
		
		int res, max_ending_here = 1;
		
		for(int i=1;i<n;i++) {
			res = recursiveLIS(arr, i);
			if(arr[i-1]<arr[n-1] && res+1>max_ending_here) 
				max_ending_here = res+1;
		}						
		if (max_ref < max_ending_here)
            max_ref = max_ending_here;
		return max_ending_here;
	}
	static int itterAndTabulationLST(int[] arr, int n) {
		int max = 0;
		int[] lis = new int[n];
		for(int i=0;i<n;i++) lis[i] = 1;
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j] && lis[i]<lis[j]+1)
					lis[i] = lis[j]+1;
			}
		}
		for(int i=0;i<n;i++)
			if(lis[i]>max)
				max = lis[i];
		return max;
	}
}
