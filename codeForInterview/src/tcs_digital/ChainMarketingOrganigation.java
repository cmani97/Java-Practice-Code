package tcs_digital;

import java.util.Scanner;

public class ChainMarketingOrganigation {

	public static void main(String[] args) {
		String p, c[], hasC, temp;
		Scanner sc = new Scanner(System.in);
		p = sc.nextLine();
		hasC = sc.nextLine();
		if(hasC.equals("Y")) {
			temp = sc.nextLine();
			c = temp.split(",");
			int t = c.length;
			System.out.println("TOTAL MEMBERS: "+(t+1));
			System.out.println("COMISSION DETAILS");
			System.out.println(p+": "+(500*t)+" INR");
			for(int i=0;i<c.length;i++) {
				System.out.println(c[i]+": 250 INR");
			}
		}else {
			System.out.println("TOTAL MEMBERS: 1");
			System.out.println("COMISSION DETAILS");
			System.out.println(p+": 250 INR");
		}

	}

}
