package trees;

public class Main {
	public static void main(String args[])
	{
		Person p1=new Person("Mani",22);
		Person p2=new Person("hani",21);
		Person p3=new Person("sweety",23);
		Person p4=new Person("shiv",100);
		Person p5=new Person("parvathi",100);
		
		BST bst=new BST();
		bst.insert(p1);
		bst.insert(p2);
		bst.insert(p3);
		bst.insert(p4);
		bst.insert(p5);
		bst.showAll(bst.findNode("shiv"));
		
		Person p=bst.getData(bst.findParent("hani"));
		System.out.println(p.toString());
	}
}
