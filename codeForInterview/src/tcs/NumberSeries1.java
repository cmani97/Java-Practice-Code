package tcs;
import java.io.*;
import java.util.*;


public class NumberSeries1 {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<16;i++) {
			if(i%2==0) {
				b += 6;
				System.out.println(b);
			}
			else {
				a += 7;
				System.out.println(a);
			}
		}
		System.out.println("15th element in the series is "+a);	

	}

}
