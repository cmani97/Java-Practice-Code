package mapInterface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


/*
 * Java LinkedHashMap class is Hashtable and Linked list implementation 
 * of the Map interface, with predictable iteration order. 
 * It inherits HashMap class and implements the Map interface.
 * Java LinkedHashMap contains values based on the key.
 * Java LinkedHashMap contains unique elements.
 * Java LinkedHashMap may have one null key and multiple null values.
 * Java LinkedHashMap is non synchronized.
 * Java LinkedHashMap maintains insertion order.
 * The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
 * 
 */

public class LinkedHashMapClass {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		hm.put(100,"Amit");  
		hm.put(101,"Vijay");  
		hm.put(102,"Rahul"); 
		for(Map.Entry m:hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		System.out.println("Keys: "+hm.keySet());
		System.out.println("Values: "+hm.values());
		System.out.println("Key-Value pairs: "+hm.entrySet());
		
		hm.remove(102); 
		System.out.println("Before invoking remove() method: "+hm);     
	    hm.remove(102);  
	    System.out.println("After invoking remove() method: "+hm);
	    
	}

}


