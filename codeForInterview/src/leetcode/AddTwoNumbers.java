package leetcode;

public class AddTwoNumbers {

	static class ListNode{
		int val;
		ListNode next;
		ListNode(){
			
		}
		ListNode(int data){
			val = data;
			next = null;
		}
	}
	public static void main(String[] args) {
		ListNode head1 = new ListNode(9);
		

		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(9);
		head2.next.next = new ListNode(9);
		head2.next.next.next = new ListNode(9);
		head2.next.next.next.next = new ListNode(9);
		head2.next.next.next.next.next = new ListNode(9);
		head2.next.next.next.next.next.next = new ListNode(9);
		head2.next.next.next.next.next.next.next = new ListNode(9);
		head2.next.next.next.next.next.next.next.next = new ListNode(9);
		head2.next.next.next.next.next.next.next.next.next = new ListNode(9);
		
		ListNode head = addTwoNumbers(head1, head2);
		
		while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
	}

	 public static String reverse(String s) {
		 char ch[]=s.toCharArray();  
		    String rev="";  
		    for(int i=ch.length-1;i>=0;i--){  
		        rev+=ch[i];  
		    }  
		    return rev;
	 }
	 
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        String s1 = "";
	        String s2 = "";
	        while(l1!=null){
	            s1 += Integer.toString(l1.val);
	            l1 = l1.next;
	        }
	        while(l2!=null){
	            s2 += Integer.toString(l2.val);
	            l2 = l2.next;
	        }
	        double sum = Integer.parseInt(reverse(s1))+Integer.parseInt(reverse(s2));
	        String s = Double.toString(sum);
	        ListNode head = null;
	        for (int i = 0; i < s.length(); i++){
	            ListNode temp = new ListNode();
	            temp.val = s.charAt(i) - '0';
	            temp.next = head;
	            head = temp;
	        }
			return head;
	    }
}
