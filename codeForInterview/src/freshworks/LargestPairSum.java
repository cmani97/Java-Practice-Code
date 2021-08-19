package freshworks;

/*
Given an unsorted of distinct integers, find the largest pair sum in it. 
For example, the largest pair sum in {12, 34, 10, 6, 40} is 74.
Expected Time Complexity: O(n) [Only one traversal of array is allowed]
 */
public class LargestPairSum {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,9,10,5,6,7,8};
		largestPairSum(arr);
	}
	static void largestPairSum(int[] arr) {
		int fstMax = Integer.MIN_VALUE;
		int sndMax = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>fstMax) {
				sndMax = fstMax;
				fstMax = arr[i];
				
			}
		}
		System.out.println(fstMax+sndMax);
	}
}
