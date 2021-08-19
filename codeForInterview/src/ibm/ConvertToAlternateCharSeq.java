package ibm;

public class ConvertToAlternateCharSeq {

	public static void main(String[] args) {
		String s = "we are the world";
		
		System.out.println(conCharSeq(s));
	}
	public static String conCharSeq(String s) {
		String res = "";
		int i,j=0;
		for(i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(Character.isLetter(c)&& ++j%2!=0) {
				res += Character.toString(c).toUpperCase();
				
			}else 
				res += Character.toString(c);
		}
		return res;
	}

}
