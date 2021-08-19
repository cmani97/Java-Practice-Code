package tcs;

import java.util.List;
import java.util.regex.Pattern;

public class LeapYear {

	public static void main(String[] args) {
		int i,j,k;
		
		for(i=0;i<5;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		int n=5;
		for(i=0;i<5;i++) {
			for(j=n;j>0;j--) {
				System.out.print(" ");
			}
			n--;
			for(j=0;j<5;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

	public static String balancedSums(List<Integer> arr) {
        
		
		return "NO";
    }
}
