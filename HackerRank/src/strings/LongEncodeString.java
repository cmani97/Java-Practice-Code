package strings;

import java.util.*;

public class LongEncodeString {
	
	private static List<Integer> frequency(String str){
		System.out.println("fquency");
		List<Integer> l = new ArrayList<>();
		int arr[] = new int[26];
		int len = str.length(), i=0;
		while(i<len-2) {
			if(str.charAt(i+2)=='#') {
				if(i+3<len && str.charAt(i+3)=='(') {
					String s = str.substring(i, i+2);
					int v = Integer.parseInt(str.substring(i+4, i+5));
					int val = Integer.parseInt(s);
					arr[val-1]+=v;
					i = i+6;
				}else {
					String s = str.substring(i, i+2);
					int val = Integer.parseInt(s);
					arr[val-1]+=1;
					i = i+3;
				}
			}else if(str.charAt(i+1)=='(') {
				String s = str.substring(i, i+1);
				int v = Integer.parseInt(str.substring(i+2, i+3));
				int val = Integer.parseInt(s);
				arr[val-1]+=v;
				i = i+4;
			}else if(Character.isDigit(str.charAt(i))) {
				String s = str.substring(i, i+1);
				int val = Integer.parseInt(s);
				arr[val-1] += 1;
				i++;
			}
		}
		for(int a:arr)
			l.add(a);
		return l;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();  // abzx code = 1226#24#, aabccc code = 1(2)23(3), bajj = 2110#(2), wwxyzwww code = 23#(3)24#25#26#23#(3)  
		List<Integer> a= frequency(s);
//		Integer[] a = frequency(s);
//		for(Integer i:a)
		System.out.println(a);
	}

}
