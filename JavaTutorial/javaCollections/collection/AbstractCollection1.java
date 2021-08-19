package collection;

import java.util.AbstractCollection;
import java.util.TreeSet;

public class AbstractCollection1 {

	public static void main(String[] args) {
		AbstractCollection<String> abs1 = new TreeSet<String>();
		abs1.add("Welcome");
		abs1.add("to");
		abs1.add("the");
		abs1.add("java");
		abs1.add("with");
		abs1.add("java");
		abs1.add("Collection");
		
		System.out.println(abs1);
		
		AbstractCollection<String> abs2 = new TreeSet<String>();
		System.out.println(abs2);
		abs2.addAll(abs1);
		System.out.println(abs2);
		abs2.clear();
		System.out.println(abs2);
		System.out.println("abs2 is empty? "+abs2.isEmpty());
		abs1.remove("Collection");
		System.out.println("After removing the 'collection' String "+abs1);
		System.out.println("size of abs1 is = "+abs1.size());
		System.out.println("does abs1 contains 'java' in it? "+abs1.contains("java"));
		
		
		
		
	}

}
