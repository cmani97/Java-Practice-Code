import java.io.*;
import java.util.*;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Scanner sc = new Scanner(System.in); 
		// Initialize sum and count of input elements 
//		int sum = 0, count = 0; 
//
//		// Check if an int value is available 
//		while (sc.hasNextInt()) 
//		{ 
//			// Read an int value 
//			int num = sc.nextInt(); 
//			sum += num; 
//			count++; 
//		} 
//		int mean = sum / count; 
//		System.out.println("Mean: " + mean);
		
		 final int arr1[] = {1, 2, 3, 4, 5}; 
	       int arr2[] = {10, 20, 30, 40, 50}; 
	       arr2 = arr1; 
//	       arr1 = arr2;
//	       arr1 = arr2;   
	       for (int i = 0; i < arr2.length; i++) { 
	          System.out.println(arr2[i]);
	       }
	}

}
