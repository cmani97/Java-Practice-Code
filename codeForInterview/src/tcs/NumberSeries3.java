package tcs;
import java.io.*;
import java.util.*;

public class NumberSeries3 {

	public int prime(int n) {
		int count = 0;
		for(int i=2;i<1000;i++) {
			int flag = 0;
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				count += 1;
				if(count == n) {
					return i;
				}
			}
		}
		return count;
	}
	public int fibonacci(int n) {
		if(n == 1)
			return 1;
		int a = 0;
		int b = 1;
		int temp = 0;
		for(int i=0;i<n;i++)
		{
			temp = a+b;
			a = b;
			b = temp;
		}
		return a;
	}
	public static void main(String[] args) {
		NumberSeries3 ns = new NumberSeries3();
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int n = sc.nextInt();
		if(n%2 == 0)
			System.out.println(ns.prime(n/2));
		else
			System.out.println(ns.fibonacci(n/2+1));

	}

}
