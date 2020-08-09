package stack;

public class IntStack {
	private int[] stack;
	private int top;
	private int size;
	private int maxSize;
	public IntStack()
	{
		top=-1;
		maxSize=50;
		stack = new int[maxSize];
		size = 0;
		
	}
	public IntStack(int size)
	{
		top=-1;
		this.maxSize=size;
		stack= new int[this.maxSize];
		size = 0;
	}
	public boolean push(int item)
	{
		if(!isFull())
		{
			top++;
			stack[top]=item;
			size += 1;
			return true;
		}
		else
		{
			return false;
		}
	}
	public int pop()
	{
		size -= 1;
		return stack[top--];
	}
	public boolean isEmpty() {
		
		return (top==-1);
	}
	public boolean isFull() {
		
		return (top==stack.length-1);
	}
	public int Length()
	{
		int len=stack.length;
		return len;
	}
	public int Size() {
		return size;
	}
	public void elements()
	{
		int len=Length();
		for(int i=0;i<len;i++)
		{
			System.out.println(stack[i]);
		}
	}
}
