package adobe;

import java.util.Scanner;

public class Jewelry {

	public static void main(String[] args) {
		;
		System.out.println(java.util.Calendar.getInstance().getTime());
		Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int count = 0, i,j;
        for(i=0;i<s[0].length();i++){
            char c = s[0].charAt(i);
            for(j=0;j<s[1].length();j++){
                if(s[1].charAt(j)==c)
                    count++;
            }
        }
        System.out.println(count);
        System.out.println(java.util.Calendar.getInstance().getTime());
	}

}
