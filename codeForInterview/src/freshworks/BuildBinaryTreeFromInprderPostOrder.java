package freshworks;

import java.util.HashMap;

import freshworks.BuildBinarTreeFromInorderPreOrder.Node;

public class BuildBinaryTreeFromInprderPostOrder {

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
	public static void main(String[] args) {
        int in[] = new int[] { 4, 8, 2, 5, 1, 6, 3, 7 };
        int post[] = new int[] { 8, 4, 5, 2, 6, 7, 3, 1 };
        int n = in.length;
        //Node root = buildTree(in, post, 0, n - 1, 0, n - 1);
        
        Node root = insertIntoMap(in, post, n-1);
        inOrder(root);
	}

	static Node buildTree(int[] in, int[] post, int inS, int inEnd, int postS, int postEnd) {
		if(inS>inEnd) return null;
		
		Node tRoot = new Node(post[postEnd]);
		
		if(inS==inEnd) return tRoot;
		
		int ind = search(in, inS, inEnd, tRoot.data);
		
		tRoot.left = buildTree(in, post, inS, ind-1, postS, postS - inS + ind - 1);
		tRoot.right = buildTree(in, post, ind+1, inEnd, postEnd - inEnd + ind, postEnd-1);
		
		return tRoot;
		
	}
	
	static  HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
	static int index;
	static Node insertIntoMap(int[] in, int[] post, int inEnd) {
		for(int i=0;i<=inEnd;i++)
			mp.put(in[i], i);
		
		index = inEnd;
		return buildUtil(in, post, 0, inEnd);
	}
	
	static Node buildUtil(int in[], int post[], int inStrt, int inEnd) {
	    if (inStrt > inEnd)
	        return null;
	 
	    int curr = post[index];
	    Node node = new Node(curr);
	    (index)--;
	 
	    if (inStrt == inEnd)
	        return node;

	    int iIndex = mp.get(curr);
	 
	    node.right = buildUtil(in, post, iIndex + 1, inEnd);
	    node.left = buildUtil(in, post, inStrt, iIndex - 1);
	    return node;
	}
	
	static int search(int[] in, int inS, int inEnd, int d) {
		int i=0;
		for(i=inS;i<=inEnd;i++)
			if(in[i]==d)
				return i;
		return i;
	}
	
	static void inOrder(Node root) {
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
		
	}
}
