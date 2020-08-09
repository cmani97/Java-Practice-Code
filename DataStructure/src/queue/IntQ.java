package queue;

public class IntQ {
	private int [] q;
	private int size;
	private int total;
	private int frount;
	private int rear;
	public IntQ() 
	{
		size=100;
		total=0;
		frount=0;
		rear=0;
		q= new int[size];
	}
	public IntQ(int size)
	{
		this.size=size;
		total=0;
		frount=0;
		rear=0;
		q= new int[this.size];
	}
	public boolean enqueue(int item)
	{
		if(isFull())
			return false;
		else
		{
			total++;
			q[rear]=item;
			rear=(rear+1)%size;
			return true;
		}
	}
	public int dequeue()
	{
		int item=q[frount];
		total--;
		//frount++;
		frount=(frount+1)%size;
		return item;
	}
	public boolean isFull()
	{
		if(size==total)
		{
			return true;
		}
		else
			return false;
	}
	public void showAll()
	{
		int f=frount;
		if(total!=0)
		{
			for(int i=0;i<total;i++)
			{
				System.out.println(q[f]);
				f=(f+1)%size;
			}
		}
		else
			System.out.println("queue is empty");
	}
	
}

