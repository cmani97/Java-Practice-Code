package character;

import java.util.TreeSet;

public class CharToString {

	public static void main(String[] args) {
		char c = 'A';
		int i = 10;
		String s = "java8";
		String  s1 = Character.toString(c);
		System.out.println("character A to string A = "+s1);
		System.out.println("character A to int = "+(int)c);
		float f=(float)c;
		System.out.println("character A to float = "+f);
		
		int i2 = Integer.parseInt(Character.toString(s.charAt(4)));
		int s4 = Integer.parseInt("200");
		float f1 = Float.parseFloat("200");
		System.out.println("string to int = "+i2);
		System.out.println("string to int = "+s4);
		System.out.println("string to float = "+f1);
		
		String s3 = Integer.toString(60)+" is a string";
		System.out.println("integer 60 to String = "+s3);
//		char c2 = (char)i;
//		String s5= "A";
////		char c3 = (char)s5;
		char c2 = (char)70;
		System.out.println("integer 12 to char = "+c2);
		
		char[] c4 = s.toCharArray();
		System.out.println("stirng to char array");
		for(char C:c4)
			System.out.println(C);
		System.out.println(Character.isDigit('2'));
		
		TreeSet<Character> ts = new TreeSet<>();
		ts.add('a');
		ts.add('b');
		
		
	}

}
