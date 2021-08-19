package tcs;

public class OctalToDesimal {
	public static void main(String args[]) {
		int oct = 1907, dec = 0, i=0;
		while(oct!=0) {
			dec += (oct%10)*Math.pow(8, i);
			oct = oct/10;
			i+=1;
		}
		System.out.println(dec);
	}
}
