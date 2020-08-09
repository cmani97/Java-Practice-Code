package stack;

import java.util.*;

public class Main {
	public static void main(String args[]) {
//		IntStack is = new IntStack();
//		int ch;
//		
////		 if(!is.isFull()) { is.push(9); is.push(3); is.push(5); is.push(7);
////		 is.push(2); } 
////		 System.out.println(is.pop()); 
////		 System.out.println(is.pop());
////		 		  
////		  System.out.print(is.pop()); System.out.print(is.pop());
////		  System.out.println(is.pop());
////		  
////		 System.out.println(is.isFull()); System.out.println(is.isEmpty());
////		 
//		do
//		{
//			System.out.println("1.push\n2.pop\n3.isFull\n4.isEmpty\n15.lenth\n6.size\n7.print all elements in stack");
//			Scanner sc = new Scanner(System.in);
//			int n = sc.nextInt();
//			switch (n) {
//			case 1:
//				System.out.println("Enter element to insert");
//				int push = sc.nextInt();
//				is.push(push);
//				break;
//			case 2:
//				int pop=is.pop();
//				System.out.println("deleted element is "+pop);
//				
//				break;
//			case 3:
//				System.out.println(is.isFull());
//				
//				break;
//			case 4:
//				System.out.println(is.isEmpty());
//				
//				break;
//			case 5:
//				System.out.println("Enter element to insert");
//				
//				break;
//			case 6:
//				System.out.println("length is "+is.Length());
//				
//				break;
//			case 7:
//				is.elements();
//				/*
//				 * for(int i=0;i<len;i++) { System.out.println(is.stack[len]); }
//				 */
//			}
//			System.out.println("1.continue 2.stop");
//			ch=sc.nextInt();
//		}while(ch==1);
		
		Person person1=new Person("mani","9");
		Person person2=new Person("hani","18");
		
		PersonStack ps=new PersonStack();
		ps.push(person1);
		ps.push(person2);
		
		System.out.println(ps.pop());
		System.out.println(ps.pop());
		
	}
}
