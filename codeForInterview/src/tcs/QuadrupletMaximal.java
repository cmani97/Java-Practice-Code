package tcs;
import java.io.*;
import java.util.*;

public class QuadrupletMaximal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter numbers:");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(arr.length);
		Arrays.sort(arr);
//		for(int i=0;i<size;i++)
//			System.out.println(arr[i]);
		if(size<4) {
			System.out.println("No Output");
		}else {
			double maximal = 0;
			for(int i=0;i<size-3;i++) {
				int count = 1;
				for(int j=i;j<i+4;j++) {
					count *= arr[j];
				}
				System.out.println(count);
				if(maximal<count) {
					maximal = count;
				}
			}
			System.out.println("maximal is "+maximal);
		}
		
	}

}
