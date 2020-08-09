package BinarySearchTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
	int data;
	Node left;
	Node right;
}

class BST {
	public Node createNode(int key) {
		Node newNode = new Node();
		newNode.data = key;
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}
	public Node insert(Node node, int key) {
		if(node == null) {
			return createNode(key);
		}
		if(key < node.data) {
			node.left = insert(node.left, key);
		} else if(key > node.data) {
			node.right = insert(node.right, key);
		}
		return node;
	}
	public Node delete(Node node, int key) {
		if(node == null) {
			return null;
		}
		else {
			if(key < node.data) {
				node.left = delete(node.left, key);
			} else if (key > node.data) {
				node.right = delete(node.right, key);
			}else {
				if(node.left == null || node.right == null) {
					Node temp = null;
					temp = node.left == null ? node.right : node.left ;
					
					if(temp == null) {
						return null;
					} else {
						return temp;
					}
				} else {
					Node successor = getSuccessor(node);
					node.data = successor.data;
					node.right = delete(node.right, node.data);
					return node;
				}
			}
		}
		return node;
	}
	
	public Node getSuccessor(Node node) {
		if (node == null) {
			return null;
		}
		Node temp = node.right;
		while(temp.left != null) {
			temp = temp.left;
		}
		return temp;
	}
	
}

public class BSTree {
	
	public static void main(String args[]) throws IOException {
		int value;
	
		System.out.println();
		BST bst = new BST();
		Node root = null;
		root = bst.insert(root, 8);
		root = bst.insert(root, 3);
		root = bst.insert(root, 6);
		root = bst.insert(root, 10);
		root = bst.insert(root, 4);
		root = bst.insert(root, 7);
		root = bst.insert(root, 1);
		root = bst.insert(root, 14);
		root = bst.delete(root, 1);
		root = bst.delete(root, 14);
		root = bst.delete(root, 3);
		
//		while(true)
//		{
//			System.out.print("Enter first letter of show, ");
//			System.out.print("insert, find, delete, or traverse: ");
//			int choice = getChar();
//			switch(choice)
//			{
//				case 's':
//					//bst.displayTree();
//					break;
//				case 'i':
//					System.out.print("Enter value to insert: ");
//					value = getInt();
//					root = bst.insert(root, value);
//					break;
//				case 'f':
//					System.out.print("Enter value to find: ");
//					value = getInt();
//					Node found = bst.find(value);
//					if(found != null)
//					{
//						System.out.print("Found: ");
//						found.displayNode();
//						System.out.print("\n");
//		
//					}
//					else
//						System.out.print("Could not find ");
//					System.out.print(value + "\n");
//					break;
//				case 'd':
//					System.out.print("Enter value to delete: ");
//					value = getInt();
//					root = bst.delete(root, value);
////					if(didDelete)
////						System.out.print("Deleted " + value + '\n');
////					else
////						System.out.print("Could not delete ");
//					System.out.print(value + '\n');
//					break;
//				case 't':
//					System.out.print("Enter type 1, 2 or 3: ");
//					value = getInt();
//					//bst.traverse(value);
//					break;
//				default:
//					System.out.print("Invalid entry\n");
//			} // end switch
//		}
	}
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	public static int getInt() throws IOException
	{
		String s = getString();
		return Integer.parseInt(s);
	}
	public static char getChar() throws IOException
	{
		String s = getString();
		return s.charAt(0);
	}
}
