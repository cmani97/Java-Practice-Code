package tcs_digital;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorClinic {

	public static void main(String[] args) {
		ArrayList<Integer> p = new ArrayList<Integer>();
		int i, total=0;
		String temp;
		boolean b = false;
		
		Scanner sc = new Scanner(System.in);
		for(i=0;;) {
			temp = sc.nextLine();
			if(temp.isEmpty()) {
				break;
			}
			int s = Integer.parseInt(temp);
			p.add(s);
			if(s<=0 & s>120)
				b = true;
		}
		System.out.println();
		if(!b & p.size()<=20) {
			for(i=0;i<p.size();i++) {
				int t = p.get(i);
				if(t<=17)
					total += 200;
				else if(t>17 & t<40)
					total += 400;
				else if(t>=40)
					total += 300;
				
			}
			System.out.println("Total Income "+total+" INR");
		}
		
	}

}
