package tcs;

import java.util.Scanner;

public class NumberSeries5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubNumberSeries4 ns= new NumberSeries4();
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		char c[] = {'a','e','i','o','u'};
		String S1 = "";
		String S2 = "";
		String S3 = "";
		char s;
		
		for(int i=0;i<s1.length();i++) {
			s = s1.charAt(i);
			int flag=0;
			for(int j=0;j<c.length;j++) {
				if(s==Character.toLowerCase(c[j])) {flag=1;break;}
			}
			if(flag==0)
				S1 += s;
			else
				S1 += "\"";
		}
		for(int i=0;i<s2.length();i++) {
			s = s2.charAt(i);
			int flag=0;
			for(int j=0;j<c.length;j++) {
				if(s==Character.toLowerCase(c[j])) {flag=1;break;}
			}
			if(flag==0)
				S2 += s;
			else
				S2 += "*";
		}
	}

}
