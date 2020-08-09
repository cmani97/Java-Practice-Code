package multiThreading;

class MultiThread1 implements Runnable{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread: "+Thread.currentThread().getId()+" is running");
		}
	}
}

public class ImplementingThreadClass {

	public static void main(String[] args) {
		
		MultiThread1 mt = new MultiThread1();
		Thread thread1 = new Thread(mt);
		Thread thread2 = new Thread(mt);
		thread1.start();
		thread2.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("main Thread: "+Thread.currentThread().getId()+" is running");
		}
	}

}
