package tcs;
import java.io.*;
import java.util.*;

public class NumberSeries2 {

	public static void main(String[] args) {
		System.out.print("");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(n<1) {
			System.out.println("enter +ve integer");
		}else {
			int a=1;
			int b=1;
			System.out.println(a);
			System.out.println(b);
			for(int i=3;i<=n; i++) {
				if(i%2==0) {
					b *= 3;
					System.out.println(b);
				}else {
					a *= 2;
					System.out.println(a);
				}
			}
			if(n%2==0)
				System.out.println(n+"th element is "+b);
			else
				System.out.println(n+"th element is "+a);
			String s = "ManI";
			System.out.println(s);
		}
		
	}

}
