package tcs_digital;

import java.util.Scanner;

public class CostOfPaintingProperty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in, ex, inCost = 18, exCost = 12, i;
		float inT=0, exT=0, total;
		in = sc.nextInt();
		ex = sc.nextInt();
		if(in>0) {
			for(i=0;i<in;i++) {
				inT += sc.nextFloat();
			}
		}
		if(ex>0) {
			for(i=0;i<ex;i++) {
				exT += sc.nextFloat();
			}
		}
		total = (exT*exCost)+(inT*inCost);
		System.out.println("Total Estimated Cost: "+total);

	}

}
