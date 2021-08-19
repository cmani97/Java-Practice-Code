package strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NoOfWords {
	public static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
//		String s = scan.next().trim(); //only a single token
		String s = scan.nextLine().trim(); //only a line
        System.out.println("s = "+s);
//        String s= "He is a very very good boy, isn't he?".trim();
//        String s= "He is a very".trim();
        String[] s1 = s.split("[!,?._'@\\s]+"); 
        if (s.length() > 0) {
            String[] tokens = s.split("[!,?._'@\\s]+");
            System.out.println(tokens.length);
            for(String token : tokens)
                System.out.println(token);
        } else
            System.out.println(0);
        
        int n = 5, d = 4;
        System.out.println(1%5);
        String regex = ".*[a-z].*";
        String st = "SOSSOS";
        if(Pattern.matches(regex, st))
        	System.out.println("contains lowercase");
        else
        	System.out.println("Does not contain lowercase");
        
	}
//	scan.close();
}
