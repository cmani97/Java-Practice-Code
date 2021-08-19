package tcs_digital;

import java.util.Scanner;

public class MonkeyEat {

	public static void main(String[] args) {
		int n, k, j, m, p, count = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		j = sc.nextInt();
		m = sc.nextInt();
		p = sc.nextInt();
		boolean b=false;
		while(m>0) {
			m = m-k;
			count += 1;
			if(m<k & m>0)
				b = true;
			
		}
		while(p>0) {
			p = p-j;
			count += 1;
			if(p<j & p>0)
				b = true;
		}
		if(b == true)
			count +=1;
		System.out.println("Number of Monkeys left on the tree: "+(n-count));
	}

}
