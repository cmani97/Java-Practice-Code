package javaPrograms;

import java.util.*;
import java.util.Scanner;

public class LinkedListEx {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> li=new LinkedList<>(); 
        for(int i=0;i<n;i++)
            li.add(sc.nextInt());
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
        	System.out.println("for");
            String temp = sc.next();
            if(temp.equals("Insert")){
                int ind = sc.nextInt();
                int ele =sc.nextInt();
                li.add(ind, ele);
            }else if(temp.equals("Delete")){
                int ind = sc.nextInt();
                li.remove(ind);
            }
        }
        for(int i=0;i<li.size();i++)
            System.out.println(li.get(i));
        
	}

}
