package ListPackage;

import java.util.Iterator;
import java.util.Stack;


/*
 * The stack is a linear data structure that is used to store the collection 
 * of objects. It is based on Last-In-First-Out (LIFO). 
 * Java collection framework provides many interfaces and classes to store the 
 * collection of objects. One of them is the Stack class that provides different
 * operations such as push, pop, search, etc.
 * 
 */
public class StackClass {

	public static void main(String[] args) {
		Stack <Integer> stk = new Stack<>();
		stk.push(119);  
		stk.push(203);  
		stk.push(988);
		stk.push(540);  
		stk.push(243);  
		stk.push(999);
		System.out.println(stk.pop());
		System.out.println(stk.isEmpty());
		System.out.println(stk.empty());
		System.out.println(stk.peek());
		System.out.println(stk.search(988));
		System.out.println("The stack size is: "+stk.size());
		Iterator iterator = stk.iterator();
		while(iterator.hasNext())  
			System.out.println(iterator.next());
	}

}
