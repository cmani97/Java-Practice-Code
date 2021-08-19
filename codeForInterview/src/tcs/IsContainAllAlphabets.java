package tcs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class IsContainAllAlphabets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		str = str.replace(" ", "");
//		System.out.println(str);
		List<String> arr = new ArrayList<>();
		char[] ch = str.toCharArray();
		for(char c:ch) {
			if(Character.isLetter(c))
				arr.add(String.valueOf(c));
		}
		Set<String> stringSet = new HashSet<>(arr);
		System.out.println(stringSet);
		if(stringSet.size()==26)
			System.out.println("contain all alphabets");
		else
			System.out.println("does not contain all alphabets");
			
				
	}

}
