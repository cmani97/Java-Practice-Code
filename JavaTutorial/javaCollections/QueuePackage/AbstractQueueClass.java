package QueuePackage;

import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class AbstractQueueClass {
	/*
	The AbstractQueue class in Java is a part of the Java Collection Framework and implements the Collection interface and
	 the AbstractCollection class. It provides skeletal implementations of some Queue operations.
	 The implementations in this class are appropriate when the base implementation does not allow null elements.
	 */
	public static void main(String[] args) {
		AbstractQueue<Integer> aq = new LinkedBlockingQueue<Integer>();
		aq.add(10);
		aq.add(20);
		aq.add(30);
		aq.add(40);
		aq.add(50);
		
		System.out.println("AbstracQueue contains:"+aq);
		
		AbstractQueue<Integer> aq1 = new LinkedBlockingQueue<Integer>();
		aq1.addAll(aq);
		System.out.println("AbstractQueue1 contains:"+aq1);
		System.out.println("w use element() to know the head of queue(aq1):"+aq1.element());
		aq1.clear();
		System.out.println("Aafter clearing aq1 "+aq1);
		
	}

}
