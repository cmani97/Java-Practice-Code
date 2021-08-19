package codeForInterview;

import java.util.PriorityQueue;

/* 
 * Given an array of digits (values are from 0 to 9), find the minimum possible sum of two numbers 
 * formed from digits of the array. All digits of given array must be used to form the two numbers.
 * 
 * Input: [6, 8, 4, 5, 2, 3]
 * Output: 604
 * The minimum sum is formed by numbers 
 * 358 and 246
 * 
 * step1: sort -> 2, 3, 4, 5, 6, 8
 * step2: divide ->
 * 2 4 6
 * 3 5 8
 * sum = 604
 */
public class MinimumSumOfTwoNumbers {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		String num1 = "";
        String num2 = "";
        int arr[] = {6, 8, 4, 5, 2, 3};
        
        for(int a:arr)
        	pq.add(a);
        
        while(!pq.isEmpty()) {
        	num1 += pq.poll().toString();
        	if(!pq.isEmpty())
        		num2 += pq.poll().toString();
        }
        System.out.println("sum is = "+(Integer.parseInt(num1)+Integer.parseInt(num2)));
	}

}
