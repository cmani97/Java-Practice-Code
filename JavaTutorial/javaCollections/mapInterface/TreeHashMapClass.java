package mapInterface;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
 * Java TreeMap class is a red-black tree based implementation. 
 * It provides an efficient means of storing key-value pairs in sorted order.
 * Java TreeMap contains values based on the key. 
 * It implements the NavigableMap interface and extends AbstractMap class.
 * Java TreeMap contains only unique elements.
 * Java TreeMap cannot have a null key but can have multiple null values.
 * Java TreeMap is non synchronized.
 * Java TreeMap maintains ascending order.
 * 
 */

public class TreeHashMapClass {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	    map.put(100,"Amit");    
	    map.put(102,"Ravi");    
	    map.put(101,"Vijay");    
	    map.put(104,"Akki");    
	    map.put(103,"Rahul"); 
	    for(Map.Entry m:map.entrySet())    
	        System.out.println(m.getKey()+" "+m.getValue()); 
	    map.remove(102);      
	    System.out.println("After invoking remove() method");  
	    System.out.println("descendingMap: "+map.descendingMap());
	    System.out.println("headMap: "+map.headMap(102,true));  
	    //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	    System.out.println("tailMap: "+map.tailMap(102,true));  
	    //Returns key-value pairs exists in between the specified key.  
	    System.out.println("subMap: "+map.subMap(100, false, 102, true));
	    
	    System.out.println("headMap: "+map.headMap(102));  
	    //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	    System.out.println("tailMap: "+map.tailMap(102));  
	    //Returns key-value pairs exists in between the specified key.  
	    System.out.println("subMap: "+map.subMap(100, 102));
	    
	    System.out.println("max key = "+map.firstEntry().getKey());
		System.out.println("min key = "+map.lastEntry().getKey());
		
//		System.out.println("max value = "+map.values().stream().max(Integer::compare).get());
//		System.out.println("min value = "+map.values().stream().min(Integer::compare).get());
		
	    
	}
	
}
