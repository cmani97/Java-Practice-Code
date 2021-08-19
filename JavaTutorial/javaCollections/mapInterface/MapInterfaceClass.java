package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * A map contains values on the basis of key, i.e. key and value pair. 
 * Each key and value pair is known as an entry. A Map contains unique keys.
 * A Map is useful if you have to search, update or delete elements on the basis of a key.
 * There are two interfaces for implementing Map in java: Map and SortedMap, and three classes: 
 * HashMap, LinkedHashMap, and TreeMap. 
 * 
 */
public class MapInterfaceClass {

	public static void main(String[] args) {
		 Map map=new HashMap();  
		 map.put(1,"Amit");  
		 map.put(5,"Rahul");  
		 map.put(2,"Jai");  
		 map.put(6,"Amit");
		 
		 Set set=map.entrySet();//Converting to Set so that we can traverse  
		 Iterator itr=set.iterator();  
		 while(itr.hasNext()){  
			 //Converting to Map.Entry so that we can get key and value separately  
		     Map.Entry entry=(Map.Entry)itr.next();  
		     System.out.println(entry.getKey()+" "+entry.getValue());
		 }
	}

}
