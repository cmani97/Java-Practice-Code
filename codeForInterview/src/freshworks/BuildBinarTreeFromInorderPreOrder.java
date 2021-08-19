package freshworks;

import java.util.HashMap;

import freshworks.BuildBinaryTreeFromInprderPostOrder.Node;

public class BuildBinarTreeFromInorderPreOrder {

	static class Node{
		char data;
		Node left;
		Node right;
		Node(char data){
			this.data = data;
			left = null;
			right = null;
		}
		Node(){
			left = null;
			right = null;
		}
	}
	static int preIndex = 0;
	public static void main(String[] args) {
        char in[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' };
        char pre[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' };
        int len = in.length;
//        Node root = buildTree(in, pre, 0, len - 1);
        
        Node root = insertIntoMap(in, pre, len-1);
        postOrder(root);
        
	}
	static void postOrder(Node root) {
		if(root==null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	static Node buildTree(char[] in, char[] pre, int sInd, int eInd) {
		if(sInd>eInd)
			return null;
		Node tRoot = new Node(pre[preIndex++]);
		
		if(sInd == eInd)
			return tRoot;
		int index = search(in, sInd, eInd, tRoot.data);
		
		tRoot.left = buildTree(in, pre, sInd, index-1);
		tRoot.right = buildTree(in, pre, index+1, eInd);
		
		return tRoot;
		
	}
	
	static int search(char[] in, int sInd, int eInd, char c) {
		int i=0;
		for(i=sInd;i<=eInd;i++)
			if(in[i]==c)
				return i;
		return i;
	}
	
	static  HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
	static int index;
	static Node insertIntoMap(char[] in, char[] post, int inEnd) {
		for(int i=0;i<=inEnd;i++)
			mp.put(in[i], i);
		
		index = 0;
		return buildUtil(in, post, 0, inEnd);
	}
	
	static Node buildUtil(char in[], char post[], int inStrt, int inEnd) {
	    if (inStrt > inEnd)
	        return null;
	 
	    char curr = post[index];
	    Node node = new Node(curr);
	    (index)++;
	 
	    if (inStrt == inEnd)
	        return node;

	    int iIndex = mp.get(curr);
	 
	    node.left = buildUtil(in, post, inStrt, iIndex-1);
	    node.right = buildUtil(in, post, iIndex+1, inEnd);
	    return node;
	}
	
}
