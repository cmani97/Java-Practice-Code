package javaPrograms;

import java.util.*;
import java.io.*;
import java.lang.*;

/*
 * t = test cases(no of time has to loop)
 * We use the integers a, b, and n to create the following series:

You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of  space-separated integers.

*/
public class Loop2 {

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
		for(int i=0;i<t;i++){
			System.out.println("for");
		    int a = in.nextInt();
		    int b = in.nextInt();
		    int n = in.nextInt();
		    for(int j=1;j<=n;j++){
		        int r = a;
		        for(int k=0;k<j;k++){
		            r += Math.pow(2,k)*b;
		        }
		        System.out.print(r+" ");
		    }
		    System.out.println();
		}

	}

}
