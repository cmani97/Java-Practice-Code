package tcs;
import java.io.*;
import java.util.*;

public class candiesSale {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= 10;
		int k = 5;
		int m = sc.nextInt();
		if(m<=5 && m>=1) {
			System.out.println("NUMBER OF CANDIES SOLD:"+m);
			System.out.println("NUMBER OF CANDIES AVAILABLE:"+(n-m));
		}else {
			System.out.println("INVALOD INPUT");
			System.out.println("NUMBER OF CANDIES LEFT:"+n);
		}
	}

}
