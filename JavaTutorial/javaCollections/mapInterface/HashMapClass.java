package mapInterface;

import java.util.HashMap;
import java.util.Map;

import java.util.Iterator;

/*
 * Java HashMap class implements the Map interface which allows us to store key and value pair,
 * where keys should be unique. If you try to insert the duplicate key,
 * it will replace the element of the corresponding key.
 * It is easy to perform operations using the key index like updation, deletion, etc.
 * HashMap class is found in the java.util package.
 * HashMap in Java is like the legacy Hashtable class, but it is not synchronized.
 * It allows us to store the null elements as well, but there should be only one null key.
 * ince Java 5, it is denoted as HashMap<K,V>, where K stands for key and V for value. 
 * It inherits the AbstractMap class and implements the Map interface.
 * 
 */
public class HashMapClass {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Mango");  //Put elements in Map  
		map.put(2,"Apple");    
		map.put(3,"Banana");   
		map.put(4,"Grapes");
		for(Map.Entry m : map.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}
		map.put(1,"Grapes");
		System.out.println(map);
		System.out.println(map.get(1));
		
		
		System.out.println("Second hasMap");
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	    System.out.println("Initial list of elements: "+hm);  
	    hm.put(100,"Amit");    
	    hm.put(101,"Vijay");    
	    hm.put(102,"Rahul"); 
	    System.out.println(hm);
	    hm.putIfAbsent(103, "Gaurav");
	    System.out.println("putIfAbsent 103, \"Gaurav\""+hm);
	    hm.putIfAbsent(103, "James");
	    System.out.println("putIfAbsent 103, \"James\""+hm);
	    
	    map.putAll(hm);
	    System.out.println(hm);
	    System.out.println(map);
	    
	    map.remove(100);  
	    System.out.println("Updated list of elements: "+map);
	    map.remove(102, "Rahul");  
	    System.out.println("Updated list of elements: "+map);  
	    
	    hm.replace(102, "Gaurav"); 
	    System.out.println(hm);
	    hm.replace(103, "Gaurav", "James");
	    System.out.println(hm);
	    hm.replaceAll((k,v) -> "Ajay"); 
	    System.out.println(hm);
	    
	}

	 
}
