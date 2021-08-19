package freshworks;

import java.util.HashSet;

public class DetectLoopInLinkedList {

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
	static Node head = null;
	public static void main(String[] args) {
		DetectLoopInLinkedList ll = new DetectLoopInLinkedList();
		
		head = new Node(5);
		head.next = new Node(8);
		head.next.next = new Node(12);
		head.next.next.next = new Node(23);
		head.next.next.next.next = new Node(53);
		head.next.next.next.next.next = new Node(34);
		
		// creating loop
		Node n = head.next.next.next;  // 23
		head.next.next.next.next.next.next = n;
		
		ll.printList(head);
		System.out.println();
		
		if(ll.detectedLoop(head)) System.out.println("There is a loop found");
		else System.out.println("No loop found");
//		   or
		ll.detectLoop();
		
		ll.printList(head);
		System.out.println();
		
		System.out.println("After reversed the list is ");
		head = ll.reverseLL(head);
		ll.printList(head);
		System.out.println();
		
		System.out.println(head.data);
		System.out.println("The middle element of the list is = "+ll.findMiddle(head));
		
	}
	void printList(Node h) {
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
	
	boolean detectedLoop(Node h){
		
//		HashSet<Node> s = new HashSet<Node>();
//        while (h != null) {
//        	if(s.contains(h))
//        		return true;
//        	s.add(h);
//        	h= h.next;
//        }
//		return false;
		
		Node temp = null;
		while(h!=null) {
			if(h.next.flag == 1) { // this is for both finding and detecting loop
				h.next = null;
				return true;
			}
			h.flag = 1;
			temp = h;
			h = h.next;
		}
		
		return false;
	}
	
	void detectLoop()
    {
        Node slow_p = head, fast_p = head;
        int flag = 0;
        while (slow_p != null && fast_p != null
               && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                flag = 1;
                removeLoop(slow_p, head);
                return;
            }
        }
        if (flag == 1)
            System.out.println("Loop found");
        else
            System.out.println("Loop not found");
    }
	
	void removeLoop(Node loop, Node curr) {
        Node ptr1 = null, ptr2 = null;
        ptr1 = curr;
        while (1 == 1) {
            ptr2 = loop;
            while (ptr2.next != loop && ptr2.next != ptr1) {
                ptr2 = ptr2.next;
            }
            if (ptr2.next == ptr1 || ptr2.next == loop) {
                break;
            }
            ptr1 = ptr1.next;
        }
        ptr2.next = null;
    }

	Node reverseLL(Node h) {
		
		Node prev = null;
		Node curr = h;
		Node next = null;
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	int findMiddle(Node h) {
		Node curr = h;
		int size = 0;
		while(curr!=null) {
			size++;
			curr = curr.next;
		}
		int mid = size/2+1;
		curr = h;
		for(int i=1;i<mid;i++)
			curr = curr.next;
		return curr.data;
		
	}
}
