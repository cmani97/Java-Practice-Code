package multiThreading;

/*
->it is a java feature that allows concurrent multiple threads or programs simultaneously for maximum utilization of CPU.Each part of such program is called "Thread".
->Thread is basically a lightweight sub-process, a smallest unit of processing.Multithreading and multiprocessing are used to achieve "MultiTHreading".
->Thread shares common memory area, because of this we use multiThreading more than multiprocessing. So thread saves memory.
-> MultiTasking is process of executing multiple tasks simultaneously.It can be achieved two ways.
	1.process-Based multitasking(multiprocessing)
	2.Thread-Based multiTasking(multiThreading)
->Thread are independent

Life cycle of Thread
	1. New // create a new thread // start()		
	2. Runnable // thread Scheduler is not started yet
	3. Running // Thread scheduler stated //run()
	4. Non-Runnable(Blocked/waiting)
	5.Terminate // dead state when its run() method exits

*/
class JavaThread extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("our Thread id:"+Thread.currentThread().getId());
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class MultiThread{

	public static void main(String[] args) {
		JavaThread jt = new JavaThread();
		jt.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread id:"+Thread.currentThread().getId());
		}
	}

}
