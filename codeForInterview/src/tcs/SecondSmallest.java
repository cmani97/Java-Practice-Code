package tcs;

import java.util.Scanner;

public class SecondSmallest {
	public int sort(int arr[], int n) {
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		SecondSmallest ss = new SecondSmallest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		ss.sort(arr, size);
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);
		System.out.println("second smallest element is "+arr[1]);
	}

}
