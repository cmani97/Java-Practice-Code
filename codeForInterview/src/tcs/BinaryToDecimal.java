package tcs;
import java.lang.*;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int b = 101,i=0;
		int r=0;
		int sum = 0;
		while(b!=0) {
			r = b%10;
			System.out.println(r);
			b = b/10;
			sum += r*Math.pow(2, i);
			i += 1;
			
		}
		System.out.println(sum);
	}

}
