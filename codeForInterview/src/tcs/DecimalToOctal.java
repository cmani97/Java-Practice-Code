package tcs;
import java.lang.*;

public class DecimalToOctal {

	public static void main(String[] args) {
		int d=17, o=0, i=1;
//		int arr[]=new int[100];
		String s="";
		while(d!=0) {
			o += d%8*i;
			d = d/8;
			i *= 10;
		}
		
		System.out.println(o);

	}

}
