package codeForInterview;

import java.util.Scanner;
/*
 * coronavirus
 * 3
 * abcde -> NEGATIVE
 * narus -> POSITIVE
 * crana -> NEGATIVE
 * 
 */
public class VirusOutbreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String v = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            int j=0,k=0;
           String b = sc.nextLine();
           String r = "";
            while(j<b.length()){
                while(k<v.length()){
                    if(b.charAt(j)==v.charAt(k)){
                        r += Character.toString(v.charAt(k));
                        break;
                    }
                    k++;
                }
                j++;
            }
            if(b.equals(r))
                System.out.println("POSITIVE");
            else
                System.out.println("NEGATIVE");
        }

	}

}
