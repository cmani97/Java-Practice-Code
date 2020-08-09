package multiThreading;

class MultiThread2 extends Thread {
	
	public void run() {
		System.out.println("Thread id : "+ Thread.currentThread().getId());
		System.out.println("Thread priority : "+Thread.currentThread().getPriority());
	}
}

public class PriorityThread {

	public static void main(String args[]) {
		MultiThread2 mt1 = new MultiThread2();
		MultiThread2 mt2 = new MultiThread2();
		mt1.setPriority(1);
		mt2.setPriority(Thread.MAX_PRIORITY);
		mt1.start();
		mt2.start();
	}
}
