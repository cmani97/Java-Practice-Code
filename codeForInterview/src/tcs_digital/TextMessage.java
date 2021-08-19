package tcs_digital;
import java.util.*;

public class TextMessage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "", text = "";
		char  vowels[] = {'a','e','i','o','u'};
		int total[] = {0,0,0,0,0};
		char s ;
		boolean v, c=true, d = false;
		message = sc.nextLine();
		for(int i=0;i<message.length();i++) {
			s = message.charAt(i);
			v = false;
			for(int j=0;j<vowels.length;j++) {
				if(s == vowels[j]) {
					total[j] += 1;
					v = true;
					c = false;
					break;
					
				}else if(Character.isDigit(s)) {
					//System.out.println("INVALID INPUT");
					d = true;
					break;
				}
			}
			if(!v) {
				text = text+s;
			}
		}
		if(c) 
			System.out.println("INVALD INPUT");
		else if(d)
			System.out.println("INVALD INPUT");
		else{			
			for(int i=0;i<vowels.length;i++) {
				System.out.println(vowels[i]+": "+total[i]);
			}
			System.out.println(text);
		}
		
	}

}
