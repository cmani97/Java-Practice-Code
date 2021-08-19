package tcs;

public class OctalToBinary {

	public static void main(String[] args) {
		int oct = 67, dec = 0, binary = 0, i = 0; // 17,67
		while(oct>0) {
			dec += oct%10*Math.pow(8, i);
			oct = oct/10;
			i +=1;
		}
		System.out.println("decimal format of "+oct+" is "+dec);
		i = 1;
		while(dec>0) {
			binary += dec%2 *i;
			dec = dec/2;
			i *= 10;
		}
		System.out.println("binary format of "+oct+" is "+binary);

	}

}
