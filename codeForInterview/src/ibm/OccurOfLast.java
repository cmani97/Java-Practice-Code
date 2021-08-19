package ibm;

public class OccurOfLast {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(occurOfL(s, 'l'));
	}
	public static int occurOfL(String s, char c) {
		
//		return s.lastIndexOf(c);
//		or
		
		int len = s.length();
		for(int i=len-1;i>=0;i--) {
			if(s.charAt(i)==c)
				return i;
		}
		return -1;
	}

}
