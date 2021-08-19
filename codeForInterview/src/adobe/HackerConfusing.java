package adobe;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HackerConfusing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        
        for(int i=2;i<=N;i++){
            if(Pattern.matches("^[^01689]", Integer.toString(i)))
               continue;
            count++;
        }
        System.out.println(count);
	}

}
