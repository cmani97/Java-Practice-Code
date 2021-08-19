package freshworks;

/*
You are given a string s consisting of lowercase English letters.
A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. 
It can be proven that the answer is unique.

 
Example 1:

Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, 
and this is the only possible move.  The result of this move is that the string is "aaca", 
of which only "aa" is possible, so the final string is "ca".
 */

public class RemoveAllAdjDuplicatesInStr {

	public static void main(String[] args) {
		String s = "abbaca";
		System.out.println(removeDuplicates(s));
	}
	
	public static String removeDuplicates(String s) {
        char[] c = new char[s.length()];
        int i=0;
        for(int j=0;j<s.length();j++){
            char new_char = s.charAt(j);
            if(i>0 && c[i-1]==new_char)
                i--;
            else
                c[i++] = new_char;
        }
        return new String(c, 0, i);
    }
}
