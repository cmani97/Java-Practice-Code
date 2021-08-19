package freshworks;

import freshworks.DetectLoopInLinkedList.Node;

public class DeleteNodeWithHeadPointer {
	static class Node{
		int data;
		int flag;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
			flag = 0;
		}
	}
	public static void main(String[] args) {
		Node head = new Node(5);
		head.next = new Node(8);
		head.next.next = new Node(12);
		head.next.next.next = new Node(23);
		head.next.next.next.next = new Node(53);
		head.next.next.next.next.next = new Node(34);
		
		printList(head);
		System.out.println();
		
		deleteNode(head.next.next.next.next.next.next);

		System.out.println("After Deletion of a node");
		printList(head);
		System.out.println();
		
	}
	static void deleteNode(Node temp) {
		if(temp == null) {
			System.out.println("given null node");
			return;
		}
		if(temp.next== null) {
			System.out.println("this is last node need another node");
			return;
		}
		temp.data = temp.next.data;
		temp.next = temp.next.next;
	}
	static void printList(Node h) {
		if(h==null)
			return;
		int count = 0;
		while(h!=null) {
			System.out.print(h.data+" ");
			h = h.next;
			count++;
			if(count == 10)
				break;
		}
	}
	

}
