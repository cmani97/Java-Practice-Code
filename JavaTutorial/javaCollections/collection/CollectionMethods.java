package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class CollectionMethods {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Welcome");
		list1.add("to");
		list1.add("java");
		list1.add("Collection");
		list1.add("Methods");
		Vector<String> list2 = new Vector<String>();
		list2.add("Let's");
		list2.add("Begin");
		List list3 = new Vector();
		list3.add("java");
		list3.add("Collections");
		Set<String> list4 = new HashSet<String>();
		list4.add("1");
		list4.add("code");
		list4.add("2");
		list4.add("code");
		list4.add("3");
		list4.add("code");

		/*
		 * */
		System.out.println("Disjoint between list1 and list2 = "+Collections.disjoint(list1, list2));
		System.out.println("Disjoint between list1 and list3 = "+Collections.disjoint(list1, list3));
		System.out.println("Disjoint between list1 and list4 = "+Collections.disjoint(list1, list4));
		
		
		/*Collections.frequency();
		 It counts the frequency of the specified element in the given list. It override the equals() method to perform the comparison to check if the specified Object and the Object in the list are equal or not.
		 */
		System.out.println("'code' frequency "+ Collections.frequency(list4, "code"));
		Integer[] arr = {1,2,3,4,5,1,2,3,1,1,1};
		System.out.println("'1' frequency using array "+ Collections.frequency(Arrays.asList(arr), 1));
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student("Mani",9));
		ar.add(new Student("Mike",2));
		ar.add(new Student("hani",1));
		ar.add(new Student("Mani",9));
		System.out.println("Student object frequency "+Collections.frequency(ar, new Student("Mani",9)));
		/*
		 java.util.Collections.rotate() method is present in java.util.Collections class.
		 It is used to rotate the elements present in the specified list of Collection by a given distance.
		 
		 */

		System.out.println("original list1: "+list1);
		Collections.rotate(list1, 2);
		System.out.println("After rotating list1: "+list1);
		
		/*Sort and revere the array*/
		Collections.sort(Arrays.asList(arr), Collections.reverseOrder());
//		we can also use revere();  Collections.reverse(arr);
		System.out.println("rever the array "+Arrays.asList(arr));
		
		System.out.println("list1: "+list1);
		Collections.shuffle(list1);
		System.out.println("After shuffle list1: "+list1);
	}

}
class Student{
	private String name;
	private int id;
	Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
}
