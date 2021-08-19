package ListPackage;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<String>(); 
	    ll.add("A"); 
	    ll.add("B"); 
	    ll.addLast("C"); 
	    ll.addFirst("D"); 
	    ll.add(2, "E"); 
	
	    System.out.println(ll); 
	
	    ll.remove("B"); 
//	    ll.remove(3); 
//	    ll.removeFirst(); 
//	    ll.removeLast();
	    
	
	    System.out.println(ll); 
	    System.out.println(ll.isEmpty());
	    System.out.println(ll.get(2)); 
	    System.out.println(ll.getFirst()); 
	    System.out.println(ll.getLast()); 
	    System.out.println(ll); 
//	    System.out.println(ll.subList(1, 3)); 
	    System.out.println(ll.size()); 
	    System.out.println(ll.indexOf("D")); 
	    System.out.println(ll.peek()); 
	    System.out.println(ll.set(2, "M")); 
	    System.out.println(); 
	    	
	    
	    
	}

}
