package tcs;
import java.util.*;

public class NumberSeries4 {

	public void threeMul(int n) {
		int i, a = 1;
		for(i=2;i<=n;i++) {
			a = a*3;
		}
		System.out.println(a);
	}
	public void twoMul(int n) {
		int i, a = 1;
		for(i=2;i<=n;i++) {
			a = a*2;
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		NumberSeries4 ns= new NumberSeries4();
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int n = sc.nextInt();
		if(n%2==0)
			ns.threeMul(n/2);
		else
			ns.twoMul(n/2+1);
			
		
	}

}
