package tcs_digital;
import java.util.*;

public class DivisorOfP {

	public static void main(String[] args) {
		int p,i,j;
		Scanner sc = new Scanner(System.in);
		p = sc.nextInt();
		for(i=1;i<=p;i++) {
//			System.out.println("i= "+i+"; p%i= "+p%i);
//			System.out.println("i= "+i+"; p/i= "+p/i);
			if(p%i==0)
				System.out.print(i+" ");
		}
	}

}
