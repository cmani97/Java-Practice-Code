package linkedList;

import linkedList.Person;

public class Main {
	public static void main(String args[])
	{
//		IntLinkedList ill=new IntLinkedList();
//		ill.insert(9);
//		ill.insert(99);
//		ill.insert(18);
//		ill.insert(34);
//		ill.insert(27);
//		ill.showAll();
//		ill.delete(99);
//		System.out.println();
//		ill.showAll();
//		ill.sort();
//		System.out.println();
		
//		System.out.println("delete item is"+ill.delete(99));
//		System.out.println("remaining are");
//		ill.showAll();
		
		Person person1=new Person("mani","9");
		Person person2=new Person("hani","18");
		
		PersonLL pll=new PersonLL(person1);
		pll.insert(person2);
		pll.showAll();
		
	}
}
