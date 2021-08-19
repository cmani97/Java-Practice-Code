package tcs_digital;

import java.util.Scanner;

public class JarFullOfCandies {

	public static void main(String[] args) {
		int n = 10, k = 5, m;
		Scanner sc= new Scanner(System.in);
		m = sc.nextInt();
		if(n-m>=k & m>0) {
			System.out.println("NUMBER OF CANDIES SOLD: "+m);
			System.out.println("NUMBER OF CANDIES AVAILABLE: "+(n-m));
		}else {
			System.out.println("INVALID INPUT");
			System.out.println("NUMBER OF CANDIES AVAILABLE: "+(n-m));
		}

	}

}
