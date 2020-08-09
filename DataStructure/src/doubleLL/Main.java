package doubleLL;


public class Main {
	public static void main(String args[])
	{
		DoubleLL dll=new DoubleLL(2);
		dll.insert(9);
		dll.insert(99);
		dll.insert(18);
		dll.showAll();
		System.out.println();
		
		System.out.println("delete item is "+dll.delete(99));
		System.out.println("remaining are");
		dll.showAll();
		
	}
}
