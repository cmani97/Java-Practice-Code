package leetcode;

import leetcode.*;

public class Main {

	
	public static void main(String[] args) {
		All all = new All();
		LinkedListClass llc = new LinkedListClass();
		TreeClass tc = new TreeClass();
		
		char arr[][] = {
				{'1','1','1','1','0'},
				{'1','1','0','1','1'},
				{'1','1','0','0','0'},
				{'0','0','0','0','0'}
		};
		System.out.println("No of Islalnds in the given array = "+all.noOfIslands(arr));
		
		
		System.out.println("Print the pascal Triangle of number 5 = "+all.pascalTriangle(5));
		
		
		int[] nums = {1,2,3,1};
		System.out.println("is the given array contain duplicates = "+all.containDuplicates(nums));
	
	
		int[] nums2 = {2, 7, 11, 15};
		int target = 9;
		int[] a = all.twoSumII(nums2, target);
		System.out.print("two sums that equals to targets is = { ");
		for(int i:a)
			System.out.print(i+" ");
		System.out.println("}");
		
		
		Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(1);
        System.out.println("Is given Linked List is polindrom or Not = "+llc.poilndromLL(n1));
	
        DNode root1 = new DNode(1);
        root1.left = new DNode(2);
        root1.right = new DNode(3);
        root1.left.left = new DNode(4);
        root1.left.right = new DNode(5);
        root1.right.left = new DNode(6);
        root1.right.right = new DNode(7);
        
        System.out.println("PostOrder traversal = "+tc.postOrder(root1));
        System.out.println("PreOrder traversal = "+tc.preOrder(root1));
        System.out.println("InOrder traversal = "+tc.inOrder(root1));
        
        DNode root2 = new DNode(1);
        root2.left = new DNode(2);
        root2.right = new DNode(3);
//        root2.right.right = new DNode(4);
        DNode root3 = tc.mergeBinTree(root1, root2);
        System.out.println("After merging the two binary trees the "
        		+ "inorder traversal of resultant inary tree is"+tc.inOrder(root3));
	
	
        DNode root4 = tc.invertBinaryTree(root2);
        System.out.println("After inverting root2 the resiltent tree "
        		+ "in inorder traversal = "+tc.inOrder(root4));
        
		int n = 120; // -123;
		System.out.println("is given number polindrom or not = "+all.poliNum(n));
		
		System.out.println("reverse integer = "+all.reverseNum(n));
		
		System.out.println("Max depth of the tree is = "+tc.maxDepthOfTree(root2));
		
		DNode root5 = new DNode(1);
		root5.left = new DNode(2);
		root5.right = new DNode(2);
		root5.left.left = new DNode(3);
		root5.left.right = new DNode(4);
		root5.right.left = new DNode(4);
//		root5.right.right = new DNode(3);
		System.out.println("Is the given tree is symetric = "+tc.isSymetricTree(root5));
		
		DNode root6 = new DNode(5);
		root6.left = new DNode(4);
		root6.right = new DNode(8);
		root6.left.left = new DNode(11);
		root6.left.left.left = new DNode(7);
		root6.left.left.right = new DNode(2);
		root6.right.left = new DNode(13);
		root6.right.right = new DNode(4);
		root6.right.right.right = new DNode(1);
		
		int sum = 22;
		System.out.println("THe sum of the path of tree is 22 = "+tc.hasPathSum(root6, sum));
		
		int bs[] = {2, 15, 23, 39, 43, 45, 66};
		System.out.println("binary search-> the position of 15 = "+all.binarySearch(bs, 15));
		
		String s = "MaNi";
		System.out.println("Convert into lowercase = "+all.toLower(s));
		
		
		String str1 = "y#fo##f";
		String str2 = "y#f#o##f";
		System.out.println("is both same = "+all.backspaceCompare(str1, str2));
		
		
		all.possiblePolindrome("ABAB");
		System.out.println("sub strings "+all.multiplyFactors(12));
		
		
		Node node1 = new Node(1);
		node1.next = new Node(3);
		node1.next.next = new Node(4);
		node1.next.next.next = new Node(6);
		node1.next.next.next.next = new Node(7);
		node1.next.next.next.next.next = new Node(8);
		node1.next.next.next.next.next.next = new Node(9);
		Node node2 = llc.oddEvenLinkedList(node1);
		Node curr = node2;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
		
		
//		node1.next.next.next.next.next.next.next = node1;
		System.out.println("is node1 contain cycle = "+llc.cycleDetect(node1));
		
		System.out.println("Is given string is polindrome = "+all.validPolindrome("abccba"));
		
		int[] heights = {1, 8, 6, 2, 5, 6, 8, 3, 7};
		System.out.println("Max container water is = "+all.maxArea(heights));
		
		
//		int sums[] = {-1, 2, 1, -4};
//		int sum_target = 4;
//		System.out.println("the closest sum of thee nums to the target is = "+all.closestSum(sums, sum_target));
		
		
		System.out.println("max num of level of tree are = "+tc.largestValues(root6));
		
		DNode root7 = new DNode(1);
		root7.right = new DNode(0);
		root7.right.left = new DNode(0);
		root7.right.right = new DNode(1);
		DNode root8 = tc.prunigTree(root7);
		
		
		int hands[] = {1, 2, 3, 6, 2, 3, 4, 7, 8};
		int weight = 3;
		System.out.println("Hands of Straights = "+all.isStraightHand(hands, weight));
		
		
		
		curr = node1;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}System.out.println();
		Node node3 = llc.swapNode(node1);
		curr = node3;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
		
		
		System.out.println("binary tree bottom left value = "+tc.leftValue(root6));
		
		
		DNode root9 = new DNode(1);
		root9.left = new DNode(2);
		root9.right = new DNode(3);
		root9.left.left = new DNode(4);
		root9.left.right = new DNode(5);
		root9.right.left = new DNode(6);
		System.out.println("is the tree is complete binaru tree = "+tc.isComplete(root9));
		
		int A[] = {3, 1};
		System.out.println(all.maximumCoins(2, A));
		
		String asd = "abcdefg";
		System.out.println(Character.isDigit(asd.charAt(0)));
		
		System.out.println(asd);
		String s1 = "";
		s1 += asd.substring(0, 1);
		s1 += asd.substring(1,2).toUpperCase();
		s1 += asd.substring(2, 3);
		System.out.println(s1);
	}

}
