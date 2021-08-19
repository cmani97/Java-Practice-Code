package javaPrograms;

import java.util.Scanner;

public class Anagrams {
	
	static boolean isAnagram(String a, String b) {
        String s1 = a.toLowerCase(), s2 = b.toLowerCase(), s = "";
        int l1 = s1.length(), l2 = s2.length();
        if(l1 == l2){
            for(int i=0;i<l1;i++){
                if(!s.contains(Character.toString(s1.charAt(i)))) {
                    s += Character.toString(s1.charAt(i));
                }
            }
            for(int i=0;i<s.length();i++){
                char temp = s.charAt(i);
                int c1 = 0, c2 = 0;
                for(int j=0;j<l1;j++){
                    if(s1.charAt(j) == temp) c1++;
                    if(s2.charAt(j) == temp) c2++;
                }
                if(c1 != c2) return false;
            }
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
        
        
        
	}

}
