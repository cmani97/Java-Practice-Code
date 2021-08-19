package QueuePackage;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueClass {
	/*
	 ArrayBlockingQueue class is a bounded blocking queue backed by an array. 
	 By bounded it means that the size of the Queue is fixed. Once created, the capacity cannot be changed.
	 Attempts to put an element into a full queue and take an element from empty queue will result operator blocking.
	 
	 */
	public static void main(String[] args) {
		int capacity = 15;
		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(capacity);
		abq.add(10);
		abq.add(20);
		abq.add(30);
		abq.add(40);
		abq.add(50);
		
		System.out.println("ArrayBlockingQueue "+abq);
		
	}

}
