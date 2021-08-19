package strings;

import java.util.regex.Pattern;

public class MarsExplotion {
	
	public static int marsExploration(String s) {
	    if(s.length()%3!=0)
	        return 0;
	    if(!Pattern.matches(".*[a-z].*",s)){
	        int count = 0;
	        int i=0,j=0;
	        for(i=0;i<s.length()/3;i++){
	            if(s.charAt(j)!='S')
	                count++;
	            if(s.charAt(j+1)!='O')
	                count++;
	            if(s.charAt(j+2)!='S')
	                count++;
	            j = j+3;
	        }
	        return count;
	    }
	    else
	        return 0;
	}

	public static void main(String[] args) {
		String s = "SOSSPSSQSSOR";
		System.out.println(marsExploration(s));

	}

}
