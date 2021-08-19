package javaPrograms;

import java.util.Scanner;

public class Subsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String com = sc.nextLine();
        int num = Integer.parseInt(sc.nextLine());
        
        String[] res = new String[num];
        
        for(int i=0;i<num;i++){
//        	int count = 0;
            String temp = sc.nextLine();
//            int s = 0;
//            for(int j=0;j<temp.length();j++){
//                for(int k=s;k<com.length();k++){
//                    if(temp.charAt(j) == com.charAt(k)){
//                        s = j+i;
//                        count ++;
//                        System.out.print(temp.charAt(j));
//                        break;
//                    }
//                }
//            }
            int j = 0, k = 0;
            int m = temp.length(), n = com.length();
            while(j<m && k<n) {
            	System.out.println(temp.charAt(j)+" "+com.charAt(k));
            	if(temp.charAt(j)==com.charAt(k))
            		j++;
            	k++;
            }
            if(j == m)
            	res[i] = "POSITIVE";
            else
            	res[i] = "NEGATIVE";
        }
        for(int i=0;i<num;i++)
        	System.out.println(res[i]);
	}

}
