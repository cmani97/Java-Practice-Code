package arrays;

import java.util.*;

public class StarsBetBars {

	private static Vector<Integer> noOfStars(String str, Vector<Integer> si, Vector<Integer> ei) {
		Vector<Integer> c = new Vector<>();
		int sl = si.size();
		int el = ei.size();
		if(sl!=el)
			return c;
		for(int k=0;k<sl;k++) {
			int count = 0;
			String s = str.substring(si.get(k)-1, ei.get(k));
			System.out.println(s);
			int i=0, j=0;
			while(i<s.length()) {
				if(s.charAt(i) == '|') {
					j=i+1;
					int sum = 0;
					while(j<s.length()) {
						if(s.charAt(j) == '*')
							sum++;
						if(s.charAt(j)=='|') {
							count += sum;
							break;
						}
						j++;
					}
				}
				if(j>0)
					i = j;
				else
					i++;
			}
			c.add(count);
			
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a = Integer.parseInt(sc.nextLine());
		Vector<Integer> startInd = new Vector<>();
		for(int i=0;i<a;i++)
			startInd.add(Integer.parseInt(sc.nextLine()));
		int b = Integer.parseInt(sc.nextLine());
		Vector<Integer> endInd = new Vector<>();
		for(int i=0;i<b;i++)
			endInd.add(Integer.parseInt(sc.nextLine()));
		System.out.print("vector is "+noOfStars(s, startInd, endInd));

	}

}
