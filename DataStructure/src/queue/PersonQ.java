package queue;

public class PersonQ {
	private Person [] q;
	private int size;
	private int total;
	private int frount;
	private int rear;
	public PersonQ() 
	{
		size=3;
		total=0;
		frount=0;
		rear=0;
		q= new Person[size];
	}
	public PersonQ(int size)
	{
		this.size=size;
		total=0;
		frount=0;
		rear=0;
		q= new Person[this.size];
	}
	public boolean enqueue(Person item)
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
	public Person dequeue()
	{
		if(!isEmpty()) {
			Person  item=q[frount];
			total--;
			//frount++;
			frount=(frount+1)%size;
			return item;
		}
		return null;
		
	}
	public boolean isEmpty() {
		if(total == 0)
			return true;
		else
			return false;
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
				System.out.println(q[f].toString());
				f=(f+1)%size;
			}
		}
		else
			System.out.println("queue is empty");
	}
	
}
