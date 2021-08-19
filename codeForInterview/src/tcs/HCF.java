package tcs;
import java.util.*;


public class HCF {

	public int highestCommonFactor(int n1,int n2) {
		int r = 0;
		while(true) {
			r = n2%n1;
//			System.out.println(r);
			if(r == 0)
				return n1;
			n2 = n1;
			n1 = r;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		HCF h = new HCF();
		System.out.println("HCF is "+h.highestCommonFactor(num1, num2));
		System.out.println("LCM is "+(num1*num2)/h.highestCommonFactor(num1, num2));

	}

}
