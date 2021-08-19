package tcs;

public class DecimalToBinary {

	public static void main(String[] args) {
		int d = 20, b=0,r=0,i=0;
		int bn[]=new int[100];
		while(d!=0) {
			r= d%2;
			d = d/2;
			bn[i] = r;
			i += 1;
		}
		for(int j=i;j>0;j--)
			System.out.print(bn[j-1]);
	}

}
