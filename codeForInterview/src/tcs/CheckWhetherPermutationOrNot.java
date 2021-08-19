package tcs;

import java.util.Scanner;
import java.util.Arrays;

public class CheckWhetherPermutationOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if(str1.length()!=str2.length())
			return;
  		char ch1[] = str1.toCharArray();
  		char ch2[] = str2.toCharArray();
  		Arrays.sort(ch1);
  		Arrays.sort(ch2);
  		String s1 = new String(ch1);
  		String s2 = new String(ch2);
  		if(s1.equals(s2))
  			System.out.print("permutation");
  		else
  			System.out.print("not permutation");

	}

}
