package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();  
        list.add("C");  
        list.add("Core Java");  
        list.add("Advance Java");
        System.out.println("Initial collection value:"+list);  
        Collections.addAll(list, "Servlet","JSP");  
        System.out.println("After adding elements collection value:"+list);  
        String[] strArr = {"C#", ".Net"};  
        Collections.addAll(list, strArr);  
        System.out.println("After adding array collection value:"+list);
        System.out.println("Value of maximum element from the collection: "+Collections.max(list)); 
        System.out.println("Value of minimum element from the collection: "+Collections.min(list));  
        Collections.sort(list);
        System.out.println("After sorted: "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("After sorted: "+list);
        
        
	}

}
