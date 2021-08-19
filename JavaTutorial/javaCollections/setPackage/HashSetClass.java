package setPackage;

import java.util.HashSet;
import java.util.Iterator;

/*
 * Java HashSet class is used to create a collection that uses a hash table for storage. 
 * It inherits the AbstractSet class and implements Set interface.
 * The important points about Java HashSet class are:
HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75.

A list can contain duplicate elements whereas Set contains unique elements only.
 */
public class HashSetClass {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        } 
        set.remove("Four");  
        System.out.println("After invoking remove(object) method: "+set); 
        HashSet<String> set1=new HashSet<String>();
        set1.addAll(set);
        System.out.println(""+set1);
        set1.add("Ten");
        System.out.println(""+set1);
//        set1.removeAll(set1);  
//        System.out.println("After invoking removeAll() method:set "+set); 
//        System.out.println("After invoking removeAll() method:set1 "+set1); 
        set1.clear();  
        System.out.println("After invoking clear() method: "+set1);  
        
        
        System.out.println(set);
	}

}
