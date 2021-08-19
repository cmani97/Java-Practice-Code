package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorInterface {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("A");
		arr.add("B");
		arr.add("C");
		arr.add("D");
		arr.add("E");
		Iterator ir = arr.iterator();
		System.out.println("using iterator");
		System.out.println("has next method");
		while(ir.hasNext()) {
			System.out.print(ir.next()+" ");
		}
//		Iterator ird = arr.descendingIterator();
		
		
		
		ListIterator lir = arr.listIterator();
		System.out.print("\n");
		System.out.println("using listIterator");
		System.out.println("Has next method");
		while(lir.hasNext()) {
			System.out.println(lir.next()+" ");
		}
		System.out.print("\n");
		System.out.println("Has previous method");
		while(lir.hasPrevious()) {
			System.out.print(lir.previous()+" ");
		}
		System.out.println();
		
		
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
		Iterator ird = ll.descendingIterator();
		while(ird.hasNext())  
        {  
            System.out.println(ird.next());  
        } 
	}

}
