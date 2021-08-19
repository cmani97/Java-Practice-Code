package ListPackage;

import java.util.Vector;

public class VectorClassEx {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();  
        vec.add("Tiger");  
        vec.add("Lion");  
        vec.add("Dog");  
        vec.add("Elephant");  
        //Adding elements using addElement() method of Vector  
        vec.addElement("Rat");  
        vec.addElement("Cat");  
        vec.addElement("Deer");
          
        System.out.println("Elements are: "+vec); 
        vec.add(1,"Goat");
        vec.addElement("Rat");
        System.out.println("Elements are: "+vec); 
        if(vec.contains("Tiger"))  
        {  
           System.out.println("Tiger is present at the index " +vec.indexOf("Tiger"));  
        }  
        else  
        {  
           System.out.println("Tiger is not present in the list.");  
        } 
        System.out.println("Remove first occourence of element Rat: "+vec.remove("Rat")); 
        System.out.println("Elements are: "+vec); 
        
	}

}
