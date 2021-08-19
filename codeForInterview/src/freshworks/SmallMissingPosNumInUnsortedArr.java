package freshworks;

/*
Given an unsorted array with both positive and negative elements. 
Find the smallest positive number missing from the array in O(n) time using constant extra space. 
It is allowed to modify the original array.


Examples: 
 
Input:  {2, 3, 7, 6, 8, -1, -10, 15}
Output: 1

Input:  { 2, 3, -7, 6, 8, 1, -10, 15 }
Output: 4

Input: {1, 1, 0, -1, -2}
Output: 2 
 */

public class SmallMissingPosNumInUnsortedArr {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 7, 6, 8, -1, -10, 15 };
        int arr_size = arr.length;
         
        int missing = findMissingNo(arr, arr_size);
         
        System.out.println( "The smallest positive missing number is " + missing);
	}

	static int findMissingNo(int[] arr, int arr_size) {
		int val, nextVal;
		for(int i=0;i<arr_size;i++) {
			
//			if value is negative or greater than array size, then it cannot be marked in array. 
//			So move to next element.
			if(arr[i]<=0 || arr[i]>arr_size) 
				continue;
			val = arr[i];
			
//			traverse the array until we reach at an element which is already marked or which could 
//			not be marked.
			while(arr[val-1]!= val) {
				nextVal = arr[val-1];
				arr[val-1] = val;
				val = nextVal;
				if(val<=0 || val>arr_size)
					break;
			}
		}
		
//		find first array index which is not marked which is also the smallest positive missing number.
		for(int i=0;i<arr_size;i++) {
			if(arr[i]!=i+1)
				return i+1;
		}
		
//		if all indices are marked, then smallest missing positive number is array_size + 1
		return arr_size+1;
	}

}
