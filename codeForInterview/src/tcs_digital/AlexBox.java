package tcs_digital;

import java.util.ArrayList;
import java.util.Scanner;

public class AlexBox {

	public static void main(String[] args) {
		ArrayList<Integer> p = new ArrayList<Integer>();
		int i, sum = 0;
		String n, temp;
		Scanner sc = new Scanner(System.in);
		n=sc.nextLine();
		while(true) {
			temp = sc.nextLine();
			if(temp.isEmpty())
				break;
			int s = Integer.parseInt(temp);
			p.add(s);
			
		}
		if(p.size()==Integer.parseInt(n)) {
			for(i=0;i<p.size()-1;i++) {
				if(p.get(i)==p.get(i+1))
					p.set(i+1, p.get(i+1)+1);
				sum += p.get(i);
					
			}
			sum += p.get(p.size()-1);
			System.out.println(sum);
		}else
			System.out.println("INVALID INPUT");

	}

}
