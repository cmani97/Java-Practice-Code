package regularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidate {

	public static boolean isLegalPassword(String pass) {

	     if (!pass.matches(".*[A-Z].*")) return false;

	     if (!pass.matches(".*[a-z].*")) return false;

	     if (!pass.matches(".*\\d.*")) return false;

	     if (!pass.matches(".*[~!@#$%&].*")) return false;

	     return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		if(isLegalPassword(password))
			System.out.println("You Entered Correct password");
		else
			System.out.println("You have Entered Wrong password");
		System.out.println();
		System.out.println("123abc "+Pattern.matches("^[a-z]+$", "123abc"));
		System.out.println();
		System.out.println("abc "+Pattern.matches("^[a-z]+$", "Mabc"));
		System.out.println();
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[-+_!@#$%^&*., ?]).+$";
		Pattern p = Pattern.compile(regex);
		 String str = "#Manisha123Reg@";
		Matcher m = p.matcher(str);
		if (m.matches())
            System.out.println("Yes");
        else
            System.out.println("No");
		System.out.println();
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("only alphabets = "+Pattern.matches("^[a-zA-Z]*$", "mHI"));
		System.out.println("only alphabets = "+Pattern.matches("[a-zA-Z/-]+$", "think?"));
		System.out.println("only alphabets = "+Pattern.matches("[a-zA-Z-]+$", "think-")); //<-- 
		System.out.println("only alphabets = "+Pattern.matches("[a-zA-Z.,?!-]+$", "WE"));
		System.out.println("only alphabets = "+Pattern.matches("[a-zA-Z.,?!-]+$", "test-case"));
		System.out.println("only alphabets = "+Pattern.matches("[a-zA-Z.,?!-]+$", "98"));
		System.out.println("only alphabets = "+Pattern.matches("[a-zA-Z.,?!-]+$", "half-dozen"));
		System.out.println("only alphabets = "+Pattern.matches("[a-zA-Z.,?!-]+$", "bf{l"));
		System.out.println("only alphabets = "+Pattern.matches("[a-zA-Z.,?!-]+$", "he."));
		System.out.println("only alphabets = "+Pattern.matches("[a-zA-Z.,?!-]+$", "mani"));
		System.out.println("only alphabets = "+Pattern.matches("[a-zA-Z.,?!-]+$", "fkldsj,"));
		System.out.println("only alphabets = "+Pattern.matches("[a-zA-Z.,?!-]+$", " "));
		String s = "she is! very Smart-girl. is no't she?   bf{l  ".trim();
		System.out.println(s);
		String s1 = s.replaceAll("[.,?!/s]","");
		System.out.println(s1);
		String s2 = s1.trim();
		System.out.println(s2);
		
	}

}
