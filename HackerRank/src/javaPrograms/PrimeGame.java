package javaPrograms;

import java.util.*;

public class PrimeGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i=0;i<t;i++){
	        int l = sc.nextInt();
	        int r = sc.nextInt();
	        ArrayList<Integer> al = new ArrayList<>();
	        for(int j=l;j<=r;j++){
	            boolean temp = true;
	            for(int k=2;k<j;k++){
	                if(j%k == 0){
	                    temp = false;
                        break;
                    }
	            }
	            if(temp)
	                al.add(j);
	        }
	        if(al.size()==0)
	            System.out.println("-1");
	        else if(al.size()==1)
	            System.out.println("0");
	        else{
	            int a = al.get(0);
	            int b = al.get(al.size()-1);
	            System.out.println(b-a);
	        }
	    }
	}

}
