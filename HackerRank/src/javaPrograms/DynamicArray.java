package javaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {
	
//	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
//	    // Write your code here
//	        List<Integer> a0 = new ArrayList<>();
//	        List<Integer> a1 = new ArrayList<>();
//	        List<Integer> la = new ArrayList<>();
//	        int len = queries.size();
//	        int lastAnswer = 0;
//	        for(int i=0;i<len;i++){
//	            int idx = (queries.get(i).get(1)^lastAnswer)%n;
//	            System.out.println("idx = "+idx);
//	            if(idx ==0) {
//	            	if(queries.get(i).get(0) == 1){
//		                a0.add(queries.get(i).get(2));
//		            }else if(queries.get(i).get(0) == 2){
//		                lastAnswer = a0.get(a0.size()-1);
//		                System.out.println(lastAnswer);
//		            }
//	            }else if(idx ==1){
//	            	if(queries.get(i).get(0) == 1){
//		                a1.add(queries.get(i).get(2));
//		            }else if(queries.get(i).get(0) == 2){
//		                lastAnswer = a1.get(a1.size()-1);
//		                System.out.println(lastAnswer);
//		            }
//	            }
//	            	
//	            
//	        }
//	        return la;
//	    }
//	
	
//	if(queries.get(i).get(0) == 1)                    // query 1 or 0
//    {
//        if(x == 0)                         
//            b[inb++] = queries.get(i).get(2);
//        else
//            c[inc++] = queries.get(i).get(2);
//    }
//    else{
//        if(x == 0)
//            last = b[queries.get(i).get(2)%(inb)];
//        else
//            last = c[queries.get(i).get(2)%(inc)];
//        ll.add(last);
//        System.out.println(last);
//    }
	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<Integer> ll = new ArrayList<>();
        int inc=0,inb=0;
        int last = 0,idx;
        int len = queries.size();
        int  a[][] = new int[len][3];
        int  b[] = new int[100000];
        int  c[] = new int[100000];            
        for(int i = 0; i<len ; i++)
        {
        	int q = queries.get(i).get(0);
        	int x = queries.get(i).get(1);
        	int y = queries.get(i).get(2);
            idx = ((queries.get(i).get(1)^last)%n);
            List<Integer> seq = queries.get(idx);
            if (q == 1) {
                seq.add(y);
            } else if (q == 2) {
                last = seq.get(y % seq.size());
                ll.add(last);
                System.out.println(last);
            }
            
        }
        return ll;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		System.out.println(arr.length);
		
		int n = 2;

        int q = 5;
        
        List<List<Integer>> queries = new ArrayList<>();
        
        for(int i=0;i<q;i++) {
        	List<Integer> ll = new ArrayList<>();
        	for(int j =0;j<3;j++) {
        		ll.add(sc.nextInt());
        	}
        	queries.add(ll);
        }
        List<Integer> la = dynamicArray(n, queries);
	}

}
