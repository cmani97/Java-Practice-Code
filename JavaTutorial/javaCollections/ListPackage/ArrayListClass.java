package ListPackage;

import java.util.*;

public class ArrayListClass {
	/*ArrayList is a part of collection framework and is present in java.util package. It provides us with dynamic arrays in Java.
	 *  Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.
	 *  This class is found in java.util package.
	 *  */
	
//	static int cookies(int k, int[] A) {
//        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(A));
//        while(true){
//            Collections.sort(al);
//            if(al.get(0)>=k)
//                return al;
//            int a = al.remove(0);
//            int b = al.remove(0);
//            al.insert(0, 1*a+2*b);
//        }
//    }
	
	public static void main(String[] args) {
//		ArrayList<String> al = new ArrayList<>(); 
//	    al.add("Jurney"); 
//	    al.add("Java"); 
//	    al.add(1, "For"); 
//	    for (int i = 0; i < al.size(); i++) { 
//	        System.out.print(al.get(i) + " "); 
//	    }
//	    System.out.println();
//	    for (String str : al) 
//	        System.out.print(str + " "); 
//		}
		
		ArrayList<ArrayList<Integer>> x = new ArrayList<>();
		ArrayList<Integer> li1 = new ArrayList<>();
		li1.add(100);
		li1.add(102);
		li1.add(103);
		li1.add(104);
		li1.add(105);
		System.out.println(li1);
		li1.add(3, 117);
		System.out.println(li1);
		x.add(li1);
//		System.out.println(x.get(0).get(2));
		System.out.println(x.isEmpty());
		System.out.println(x.size());
		System.out.println();
		System.out.println();
		int n1 = li1.remove(0);
		int n2 = li1.remove(0);
		int temp = (n1*1)+(n2*2);
        li1.add(temp);
		System.out.println(li1);
		System.out.println(li1.get(0));
	}
}
