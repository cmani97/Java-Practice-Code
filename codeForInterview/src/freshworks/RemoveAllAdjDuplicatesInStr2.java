package freshworks;
/*
You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent 
and equal letters from s and removing them, causing the left and the right side of the deleted 
substring to concatenate together.

We repeatedly make k duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. 
It is guaranteed that the answer is unique.

 

Example 1:

Input: s = "abcd", k = 2
Output: "abcd"
Explanation: There's nothing to delete.
 */
public class RemoveAllAdjDuplicatesInStr2 {

	public static void main(String[] args) {
		String s = "yfttttfbbbbnnnnffbgffffgbbbbgssssgthyyyy"; //deeedbbcccbdaa
		System.out.println(removeDuplicates(s, 4));
	}
	
	
	
	public static String removeDuplicates(String s, int k) {
        char[] ch = new char[s.length()];
        int[] co = new int[ch.length];
        int i=0;
        for(int j=0;j<s.length();j++){
            char new_char = s.charAt(j);
            if(i>0 && ch[i-1] == new_char)
            	co[i-1]++;
            else {
            	ch[i] = new_char;
            	co[i] = 1;
            	i++;
            }
            if(co[i-1]==k){
                i--;
            }
        }
        String result = "";
        for(int a=0;a<i;a++){
            for(int b=0;b<co[a];b++)
                result += Character.toString(ch[a]);
        }
        return result;
        
//           or
        /*
        Stack<int[]> stack = new Stack<>();
        for(int j=0;j<s.length();j++){
            char new_char = s.charAt(j);
            if(!stack.isEmpty() && stack.peek()[0] == new_char)
            	stack.peek()[1]++;
            else 
                stack.push(new int[]{new_char, 1});
            if(stack.peek()[1]==k){
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            int[] top = stack.pop();
            while(top[1]-->0)
                sb.append((char) top[0]);
        }       
        return sb.reverse().toString();
         */
    }
	
//	public String removeDuplicates(String s, int k) {
//        int count = 1;
//        for(int i=1;i<s.length();i++){
//            if(s.charAt(i) == s.charAt(i-1))
//                count++;
//            else count = 1;
//            if(count == k){
//                String red = s.substring(0,i-k+1)+s.substring(i+1);
//                return removeDuplicates(red, k);
//            }
//        }
//        return s;
//    }
	
//	 public static String removeDuplicates(String s, int k) {
//	        char[] c = new char[s.length()];
//	        int i=0;
//	        for(int j=0;j<s.length();j++){
//	            char new_char = s.charAt(j);
//	            if(i>=k-1){
//	                int flag=0;
//	                for(int a=i-1;a>i-k;a--){
//	                    if(c[a]==new_char)
//	                        flag++;
//	                }
//	                if(flag==k-1)
//	                    i = i-k+1;
//	                else
//		                c[i++] = new_char;
//	            }
//	                
//	            else
//	                c[i++] = new_char;
//	        }
//	        return new String(c, 0, i);
//	    }

}
