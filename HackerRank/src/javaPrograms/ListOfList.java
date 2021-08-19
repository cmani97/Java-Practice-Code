package javaPrograms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author manisha
 *
 * Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. 
 * Try to solve this problem using Arraylist.
 * You are given n lines. In each line there are zero or more integers. 
 * You need to answer a few queries where you need to tell the number located in yth position of xth line.
n =  5
   d
1. 5 41 77 74 22 44
2. 1 12
3. 4 37 34 36 52
4. 0
5. 3 20 22 33
q = 5
x y
1 3
3 4
3 1
4 3
5 5
 *Take your input from System.in.
 */
public class ListOfList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> lol = new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> a = new ArrayList<Integer>();
            int d= sc.nextInt();
            for(int j =0;j<d;j++)
                a.add(sc.nextInt());
            lol.add(a);
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            try{
                System.out.println(lol.get(x-1).get(y-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }

	}

}
