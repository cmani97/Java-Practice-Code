package codeForInterview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AbsoluteDiffOfDiagonalsOfMatrix {
	public static int absolute_sum(int[][] arr)
	{
		int sum = 0;
		int top_left_diagonal = 0;
		int top_right_diagonal = 0;
		int row = arr.length;
		int column = arr[0].length;
		int i = 0, j = 0, l = arr.length-1;
		while(i<row && j<column && l>=0)
		{
			top_left_diagonal += arr[i][j];
			top_right_diagonal += arr[i][l];
			i += 1;
			j += 1;
			l -= 1;
		}
		sum = Math.abs(top_left_diagonal-top_right_diagonal);
		
		return sum;
	}
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String args[]) throws IOException
	{
		//int arr[][] = {{1, 2, 3, 4},{2, 3, 4},{1, 2, 3, 4, 5},{3, 2, 1, 1, 4},{9, 2, 2, 1, 3}};
//		BufferedWriter br = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		System.out.println("enter size");
		int n = sc.nextInt();
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int arr[][] = new int[n][n];
		System.out.println("enter ele");
		for(int i =0;i<n;i++)
		{
//			String[] arrRowItem = sc.nextLine().split(" ");
//			sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			
			for(int j = 0; j<n;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i =0;i<n;i++)
		{
//			String[] arrRowItem = sc.nextLine().split(" ");
//			sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			
			for(int j = 0; j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(absolute_sum(arr));
	}
}
