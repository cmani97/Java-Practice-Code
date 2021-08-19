package ListPackage;

import java.util.AbstractList;
import java.util.LinkedList;

public class AbstractSequentialCalss {
	/*
	 he AbstractSequentialList class in Java is a part of the Java Collection Framework and
	  implements the Collection interface and the AbstractCollection class. It is used to implement an unmodifiable list,
	  for which one needs to only extend this AbstractList Class and implement only the get() and the size() methods.
	 * */
	public static void main(String[] args) {
		AbstractList<String> abs1 = new LinkedList<String>();
		abs1.add("A");
		abs1.add("B");
		abs1.add("C");
		abs1.add("A");
		abs1.add("D");
		abs1.add("A");
		abs1.add("E");
		for(String s:abs1) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println(abs1);
	}

}
