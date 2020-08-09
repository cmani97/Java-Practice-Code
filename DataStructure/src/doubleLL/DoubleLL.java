package doubleLL;



public class DoubleLL {
	private Node head;
//	public IntLinkedList()
//	{
//		head=new Node();
//		head.value=null;
//		head.link=null;
//		
//	}
	public DoubleLL(int item)
	{
		head=new Node();
		head.value=item;
		head.prev=null;
		head.next=null;
		
	}
	
	public boolean insert(int item)
	{
		Node n=new Node();
		n.value=item;
		n.prev=null;
		head.prev=n;
		n.next=head;
		head=n;
		return true;
	}
	public boolean delete(int item)
	{
		if(head.next.value==item)
		{
			head.next=head.next.next;
			return true;
		}
		else
		{
			Node x=head;
			Node y=head.next;
			while(true)
			{
				
				if(y==null||y.value==item)
				{
					x.next=y.next;
					break;
				}else
				{
					x=y;
					y=y.next;
				}
			}
			if(y!=null)
			{
				x.next=y.next;
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	
	public void showAll()
	{
		Node z=head;
		while(z!=null)
		{
			System.out.println(z.value);
			z=z.next;
		}
	}
	class Node
	{
		private int value;
		private Node next;
		private Node prev;
	}

}
