package ListPackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.LinkedList;

public class AbstractListClass {
	/*The AbstractList class in Java is a part of the Java Collection Framework 
	 * and implements the Collection interface and the AbstractCollection class. 
	 * It is used to implement an unmodifiable list, for which one needs to only 
	 * extend this AbstractList Class and implement only the get() and the size() methods.
	 * */
	public static void main(String[] args) {
		AbstractList<String> abs = new LinkedList<String>();
		abs.add("java");
		abs.add("Abstrct");
		abs.add("List");
		abs.add("Class");
		
		System.out.println("AbstracList= "+abs);
		abs.remove(3);
		System.out.println("AbstracList= "+abs);
		System.out.println("getting 1 index element "+abs.get(1));
		System.out.println("setting 0 index element to JAVA= "+abs.set(0, "JAVA"));
		Iterator i = abs.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\n");
		
		
		AbstractList<String> abs2 = new LinkedList<String>();
		abs2.add("A");
		abs2.add("B");
		abs2.add("C");
		abs2.add("A");
		abs2.add("D");
		abs2.add("A");
		abs2.add("E");
		
		for(String s:abs2) {
			System.out.print(s+" ");
		}
		abs2.set(0, "M");
		System.out.println();
		System.out.println("LastIndexOf A element in the list given above = "+abs2.lastIndexOf("A"));
		System.out.println("IndexOf M element in the list(it results -1 if it not present in the list) = "+abs2.indexOf("M"));
		
		AbstractList<String> abs3 = new LinkedList<String>();
		abs3.addAll(abs);
		System.out.println("copying all elements in the abs list into this abs3 list using assAll() = "+abs3);
		System.out.println("Are both abs and abs3 equal = "+abs.equals(abs3));
		System.out.println("hashCOde of abs2 is = "+abs2.hashCode());
		abs3.clear();
		System.out.println("after clearing the abs3 = "+abs3);
		System.out.println("removing 3r index form abs2 "+abs2.remove(3));
		System.out.println("After removing 3 index from abs2"+abs2);
	}
	

}
