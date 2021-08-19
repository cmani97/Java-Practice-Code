package kickStart;

import java.io.*;
import java.util.*;

class buyHouses{
	public static void noOfHouses(int[] houses,int T,int b){
	    int sum = 0;
	        if(houses[0]>b){
	            System.out.println("Case #"+T+": 0");
	        }else{
	            for(int i=0;i<houses.length;i++){
	               sum += houses[i];
	               if(sum>b){
	                sum = sum - houses[i];
	                System.out.println("Case #"+T+": "+(i+1-1));
	                break;
	               }
	            }
	        }
	}
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        int T = sc.nextInt();
	        for(int i=1;i<=T;i++){
	            int n = sc.nextInt();
	            int b = sc.nextInt();
	            int[] houses = new int[n];
	            for(int j=0;j<n;j++){
	                houses[j]=sc.nextInt();
	            }
	            Arrays.sort(houses);
	            noOfHouses(houses,i,b);
	        }
	    }
}