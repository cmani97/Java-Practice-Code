package ibm;

import java.util.Scanner;
import java.util.TreeMap;

public class AtomicConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeMap<Character, Integer> tm = new TreeMap<>();
		tm.put('H', 1);
		tm.put('C', 12);
		tm.put('N', 14);
		tm.put('O', 16);
		tm.put('S', 32);
		
		String s = "S1H2";  // NH2O, C6H12O6, H2O, C6H6, S1H2
		
		int result = convertToNum(tm, s);
		
		System.out.println(result);
	}

	public static int convertToNum(TreeMap<Character, Integer> tm, String s) {
		int result = 0;
		int i=0;
		int len = s.length();
		while(i<len) {
			if(Character.isLetter(s.charAt(i)) && tm.containsKey(s.charAt(i))) {
				int atom = tm.get(s.charAt(i));
				String count = "";
				int j=i+1, val;
				while(j<len && Character.isDigit(s.charAt(j))) {
					count += s.charAt(j);
					j++;
				}
				if(count.length()!=0) 
					val = Integer.parseInt(count);
				else 
					val = 1;
				result += atom*val;
				i=j;
			}else if(!tm.containsKey(s.charAt(i)))
					return 0;
		}
		return result;
	}
}
