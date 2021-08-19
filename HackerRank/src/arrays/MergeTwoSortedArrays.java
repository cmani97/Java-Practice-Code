package arrays;

import java.util.Scanner;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements in arr1");
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		for(int i=0;i<n1;i++)
			arr1[i] = sc.nextInt();
		System.out.println("Enter no of elements in arr2");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for(int i=0;i<n2;i++)
			arr2[i] = sc.nextInt();
		int arr[] = mergeArrays(arr1, arr2);
		for(int a:arr)
			System.out.println(a);

	}

	private static int[] mergeArrays(int[] arr1, int[] arr2) {
		int n1 = arr1.length, n2 = arr2.length;
		int a[] = new int[n1+n2];
		int i=0, j=0, k=0;
		while(i<n1 && j<n2) {
			if(arr1[i]<=arr2[j])
				a[k++] = arr1[i++];
			else
				a[k++] = arr2[j++];
		}
		while(i<n1)
			a[k++] = arr1[i++];
		while(j<n2)
			a[k++] = arr2[j++];
		return a;
	}

}
