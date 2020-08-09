package queue;

import queue.Person;
import queue.PersonQ;

public class Main {
	public static void main(String args[])
	{
//		IntQ iq=new IntQ();
//		iq.enqueue(9);
//		iq.enqueue(36);
//		iq.enqueue(34);
//		
//		System.out.println("deleted item is "+iq.dequeue());
////		System.out.println("deleted item is "+iq.dequeue());
////		System.out.println("deleted item is "+iq.dequeue());
//		
//		iq.showAll();
		
		Person person2=new Person("hani","18");
		
		PersonQ pq=new PersonQ();
		pq.enqueue(new Person("mani","9"));
		pq.enqueue(new Person("manisha","99"));
		pq.enqueue(person2);
		
		System.out.println("deleted element is "+pq.dequeue()+"\n");
		System.out.println("deleted element is "+pq.dequeue()+"\n");
		System.out.println("deleted element is "+pq.dequeue()+"\n");
		System.out.println("deleted element is "+pq.dequeue()+"\n");
		pq.enqueue(new Person("sweety","100"));
		System.out.println("deleted element is "+pq.dequeue()+"\n");
		pq.showAll();
		

	}
}
