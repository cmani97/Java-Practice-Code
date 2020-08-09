package linkedList;

public class IntLinkedList {
	private Node head;
//	public IntLinkedList()
//	{
//		head=new Node();
//		head.value=null;
//		head.link=null;
//		
//	}
	public IntLinkedList()
	{
		head=new Node();
		head.value=0;
		head.link=null;
		
	}
	
	public boolean insert(int item)
	{
		Node n=new Node();
//		n.value=item;
//		n.link=head;
//		head=n;
//		return true;
		
		Node new_node=new Node();
		new_node=head;
		while(new_node.link!=null)
		{
			new_node=new_node.link;
		}
		n.value=item;
		n.link=null;
		new_node.link=n;
		return true;
	}
	public boolean delete(int item)
	{
		if(head.link.value==item)
		{
			head.link=head.link.link;
			return true;
		}
		else
		{
			Node x=head;
			Node y=head.link;
			while(true)
			{
				
				if(y==null||y.value==item)
				{
					x.link=y.link;
					break;
				}else
				{
					x=y;
					y=y.link;
				}
			}
			if(y!=null)
			{
				x.link=y.link;
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	public void sort()//bubble sort
	{
		int c=0;
		Node a=head.link;
		while(a.link!=null)
		{
			Node b=head.link;
			while(b.link!=null)
			{
				if(b.value<b.link.value)
				{
					c=b.value;
					b.value=b.link.value;
					b.link.value=c;
				}
				b=b.link;
			}
			a=a.link;
		}
	}
	public void showAll()
	{
		System.out.println(head.value);
		Node z=head.link;
		while(z!=null)
		{
			System.out.println(z.value);
			z=z.link;
		}
	}
	class Node
	{
		private int value;
		private Node link;
	}

}
