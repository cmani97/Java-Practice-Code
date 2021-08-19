package QueuePackage;
import java.util.*;

/*
 * Jesse loves cookies and wants the sweetness of some cookies to be greater than value k.
 * To do this, two cookies with the least sweetness are repeatedly mixed. 
 * This creates a special combined cookie with:

sweetness =  (1*Least sweet cookie +  2*2nd least sweet cookie).

This occurs until all the cookies have a sweetness>=k .

Given the sweetness of a number of cookies, determine the minimum number of operations required. 
If it is not possible, return -1.
k=9
A=[2,7,3,6,4,6]
The smallest values are 2,3.
Remove them then return 2+2*3=8 to the array. Now A=[8,7,6,4,6].
Remove 4,6 and return 4+6*2=16 to the array. Now A=[16,8,7,6].
Remove 6,7 , return 6+7*2=20 and A=[20,16, 8, 7].
Finally, remove 8,7 and return 7+8*2=23 to A. Now A=[23,20,16].
All values are >=k=9 so the process stops after 4 iterations. Return 4.
 */

public class PriorityQueueClass {

	static int cookies(int k, int[] A) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
        int operations = 0;
        
        //Initialize priority queue
        for(int a : A) {
            pq.add(a);
        }
        System.out.println(pq);
        while(pq.size() > 1) {
            if(pq.peek() >= k) {
                return operations;
            } else {
                int cookie1 = pq.poll();
                int cookie2 = pq.poll();
                int newCookie = cookie1 + cookie2 * 2;
                pq.add(newCookie);
                operations++;
            }
        }
        if(pq.size() > 0 && pq.peek() >= k) {
            return operations;
        } else {
            return -1;
        }
	}
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());

        int k = Integer.parseInt(nk[1].trim());
        
        int[] A = new int[n];
        
        String[] AItems = scanner.nextLine().split(" ");

        for (int AItr = 0; AItr < n; AItr++) {
            int AItem = Integer.parseInt(AItems[AItr].trim());
            A[AItr] = AItem;
        }
        
        int result = cookies(k, A);
        
        System.out.println(result);

	}

}
