package codeForInterview;

import java.util.Scanner;

public class minNoOfJumps {
	static int min_no_jumps(int arr[], int n)
	{
		int no_of_jumps = 0;
		int i= 0;
		while(i<arr.length-1)
		{
//			if(arr[arr.length-1] == 1 || arr[i+2]==1)
			if(i+2 == arr.length || arr[i+2]==1)
			{
				no_of_jumps += 1;
				i += 1;
			}
			else
			{
				no_of_jumps += 1;
				i += 2;
			}
		}
		
		return no_of_jumps;
	}
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String args[])
	{
		System.out.print("Enter the size of array\n");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		int result = min_no_jumps(arr, n);
		System.out.println(result);
	}
}
