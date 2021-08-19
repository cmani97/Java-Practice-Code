package freshworks;

public class FingBinaryTreeOrNot {

	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	static Node root=null;
	
	public static void main(String[] args) {
		FingBinaryTreeOrNot fb = new FingBinaryTreeOrNot();
		root = new Node(10);
		root.left = new Node(6);
		root.right = new Node(18);
		root.left.left = new Node(4);
		root.left.right = new Node(8);
		root.right.left = new Node(15);
		root.right.right = new Node(21);
		
		if(fb.findBinaryOrNot(root)) System.out.println("is binary tree");
		else System.out.println("Not a bst");
		
		if(fb.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) System.out.println("is binary tree");
		else System.out.println("Not a bst");
	}
	static boolean findBinaryOrNot(Node r) {
		if(r == null) return true;
		if(r.left!=null && r.left.data>r.data)
			return false;
		if(r.right!=null && r.right.data<r.data)
			return false;
		if(!findBinaryOrNot(r.left) || !findBinaryOrNot(r.right))
			return false;
		return true;
		
	}
	
	static boolean isBST(Node n, int min, int max) {
		if(n == null) return true;
		if(n.data<min || n.data>max)
			return false;
		return (isBST(n.left, min, n.data) && isBST(n.right, n.data, max));
		
	}
}
