package javaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * multiplication of all sub-arrays of an array elements is less than given number
 * 
 */
public class MELGNinSubarray {

	static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		ArrayList<ArrayList<Integer>> list= new ArrayList<>();
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int num = 10;
		int max = 0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				ArrayList<Integer> li = new ArrayList<>();
				int m = 1;
				int sum = 0;
				for(int k=i;k<=j;k++) {
//					System.out.print(arr[k]+" ");
					li.add(arr[k]);
					m *= arr[k];
					sum += arr[k];
				}
				if(m<num) {list.add(li);}
				if(sum>max) max = sum;
			}
		}
		System.out.println(list);
		System.out.println("max sum of subarray in given array is "+max);
		System.out.println("max sum of subarray in given array using 2nd method is "+maxSubArraySum(arr));
	}

}
