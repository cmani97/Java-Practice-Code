package linkedList;

import linkedList.IntLinkedList.Node;

public class PersonLL {
	private Node head;
//	public IntLinkedList()
//	{
//		head=new Node();
//		head.value=null;
//		head.link=null;
//		
//	}
	public PersonLL(Person person)
	{
		head=new Node();
		head.person=person;
		head.link=null;
		
	}
	
	public boolean insert(Person person)
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
		n.person=person;
		n.link=null;
		new_node.link=n;
		return true;
	}
	public boolean delete(String name)
	{
		if(name.equals(head.person.getName()))
		{
			head.link=head.link.link;
			return true;
		}
		else
		{
			Node x=head;
			Node y=head.link;
			while(y!=null||y.person.getName().equals(name))
			{
				x=y;
				y=y.link;
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
//	public void sort()//bubble sort
//	{
//		int c=0;
//		Node a=head.link;
//		while(a.link!=null)
//		{
//			Node b=head.link;
//			while(b.link!=null)
//			{
//				if(b.value<b.link.value)
//				{
//					c=b.value;
//					b.value=b.link.value;
//					b.link.value=c;
//				}
//				b=b.link;
//			}
//			a=a.link;
//		}
//	}
	public void showAll()
	{
		Node z=head;
		while(z!=null)
		{
			System.out.println(z.person.toString());
			z=z.link;
		}
	}
	class Node
	{
		private Person person;
		private Node link;
	}

}
