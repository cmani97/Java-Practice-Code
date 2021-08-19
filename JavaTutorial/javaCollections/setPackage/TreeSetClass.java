package setPackage;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * Java TreeSet class implements the Set interface that uses a tree for storage. 
 * It inherits AbstractSet class and implements the NavigableSet interface. 
 * The objects of the TreeSet class are stored in ascending order.
 
 * Java TreeSet class contains unique elements only like HashSet.
 * Java TreeSet class access and retrieval times are quiet fast.
 * Java TreeSet class doesn't allow null element.
 * Java TreeSet class is non synchronized.
 * Java TreeSet class maintains ascending order.
 * 
 */
public class TreeSetClass {

	public static void main(String[] args) {
		  TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");
		  al.add("Jack");
		  al.add("Michel");  
		  al.add("Mike");
		  al.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  System.out.println("Highest Value: "+al.pollFirst());  
	      System.out.println("Lowest Value: "+al.pollLast()); 
	      System.out.println("Initial Set: "+al);  
          
	      System.out.println("Reverse Set: "+al.descendingSet());  
	           
	      System.out.println("Head Set: "+al.headSet("Ravi", true));  
	          
//	      System.out.println("SubSet: "+al.subSet("Michel", false, "Ajay", true));  
//	           
	      System.out.println("TailSet: "+al.tailSet("Vijay", false)); 
	     
	      System.out.println("al = "+al);
	      System.out.println("al.first = "+al.first());
	      System.out.println("al.last = "+al.last());
	      System.out.println("al.isEmpty = "+al.isEmpty());
	      // Returns the greatest element in this set strictly less than thegiven element, or null if there is no such element.
	      System.out.println("al.lower = "+al.lower("Jack"));
	      System.out.println("al.lower = "+al.lower("Michel"));
	      // Returns the least element in this set strictly greater than thegiven element, or null if there is no such element.
	      System.out.println("al.higher = "+al.higher("Jack"));
	      System.out.println("al = "+al);
	      System.out.println("is the set contain Ravi = "+al.contains("Ravi"));
	}

}


