package leetcode;

import java.util.HashSet;

public class LinkedListClass {

	/*Reverse a Linked List*/
	public Node reverseLL(Node head) {
		Node curr = head;
		Node prev = null;
		Node next = null;
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	/* Palindrom Linked List*/
	public boolean poilndromLL(Node head) {
//		Stack<Integer> s = new Stack<>();
//		Node curr = head;
//		while(curr!=null) {
//			s.push(curr.data);
//			curr = curr.next;
//		}
//		curr = head;
//		while(curr!=null) {
//			if(curr.data != s.pop())
//				return false;
//			curr = curr.next;
//		}
//		return true;
		
//		     or
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		slow  = reverseLL(slow);
		fast = head;
		
		while(slow!=null) {
			if(slow.data != fast.data)
				return false;
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}
	
	/* convent a linked list into odd even list */
	/* Input: head = [1,2,3,4,5]     Output: [1,3,5,2,4] 
	 * Input: head = [2,1,3,5,6,4,7] Output: [2,3,6,7,1,5,4]
	 * */
	public Node oddEvenLinkedList(Node head) {
		if(head == null) return null;
		Node odd = head;
		Node even = odd.next;
		Node evenHead = even;
		while(even!= null && even.next!=null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		return head;
	}
	
	/* cycle detection*/
	public boolean cycleDetect(Node head) {
		if(head == null) return false;
//		Node slow = head;
//		Node fast = head;
//		while(fast!=null && fast.next!=null) {
//			slow = slow.next;
//			fast = fast.next.next;
//			if(slow == fast)
//				return true;
//		}
//		return false;
//					or 
		HashSet<Integer> hs = new HashSet<>();
		while(head!=null) {
			if(hs.contains(head.data))
				return true;
			hs.add(head.data);
			head = head.next;
		}
		return false;
		
	}
	
	/* merge two sorted linked list*/
	public Node mergeLL(Node n1, Node n2) {
		if(n1==null) return n2;
		if(n2==null) return n1;
		Node n = new Node(0);
		Node temp = n;
		while(n1!=null && n2!= null) {
			if(n1.data<n2.data) {
				temp.next = n1;
				n1 = n1.next;
			}else {
				temp.next = n2;
				n2 = n2.next;
			}
			temp = temp.next;
		}
		return n.next;
	}
	
	/* middle of linked list */
	public Node middleLL(Node head) {
		if(head == null) return null;
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	/* swap node in pair */
	public Node swapNode(Node head) {
		if(head == null) return null;
		
		// swaping nodes;
		Node temp = new Node(0);
		temp.next = head;
		Node curr = temp;
		while(curr.next!=null && curr.next.next!=null) {
			Node first = curr.next;
			Node second = curr.next.next;
			first.next = second.next;
			curr.next = second;
			curr.next.next = first;
			curr = curr.next.next;
		}
		return temp.next;
		
		// swaping data of nodes;
//		Node curr = head;
//		while(curr!=null && curr.next!=null) {
//			int t = curr.data;
//			curr.data = curr.next.data;
//			curr.next.data = t;
//			curr = curr.next.next;
//		}
//		return head;
	}
	
	/*
	 * Partition List
	 * 
	 * Given the head of a linked list and a value x, partition it such that all nodes less than x 
	 * come before nodes greater than or equal to x.

		You should preserve the original relative order of the nodes in each of the two partitions.
		
		Input: head = [1,4,3,2,5,2], x = 3
		Output: [1,2,2,4,3,5]
		Example 2:
		
		Input: head = [2,1], x = 2
		Output: [1,2]
	 */
	public Node partition(Node head, int x) {
        if(head == null) return null;
        Node before_head = new Node(0);
        Node before = before_head;
        Node after_head = new Node(0);
        Node after = after_head;
        
        while(head!=null){
            if(head.data<x){
                before.next = head;
                before = before.next;
            }else{
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        after.next = null;
        before.next = after_head.next;
        
        return before_head.next;
    }
	
	/*
	 *  Sort List
	 *  
	 *  Given the head of a linked list, return the list after sorting it in ascending order.

		Follow up: Can you sort the linked list in O(n logn) time and O(1) memory 
		(i.e. constant space)?
		
		Input: head = [4,2,1,3]
		Output: [1,2,3,4]
		
		Input: head = [-1,5,3,4,0]
		Output: [-1,0,3,4,5]
		
		Input: head = []
		Output: []
	 */
	public Node sortList(Node head) {
        if(head == null || head.next==null)
            return head;
        
        Node temp = head;
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        temp.next = null;
        Node left = sortList(head);
        Node right = sortList(slow);
        
        return merge(left, right);
    }
    private Node merge(Node l1, Node l2){
        Node list = new Node(0);
        Node curr = list;
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if(l1!=null){
            curr.next = l1;
            l1 = l1.next;
        }
        if(l2!=null){
            curr.next = l2;
            l2 = l2.next;
        }
        return list.next;
    }
	
    
    
	
	
	
	
	
	
}
