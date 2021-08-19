package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class TreeClass {

	/*N- arr Binary Tree Postorder*/
	public List<Integer> postOrder(DNode root){
		LinkedList<DNode> stack = new LinkedList<>();
		LinkedList<Integer> output_list = new LinkedList<>();
		
		if(root == null)
			return output_list;
		stack.push(root);
		while(!stack.isEmpty()) {
			DNode node = stack.pop();
			output_list.addFirst(node.data);
			if(node.left!=null)
				stack.push(node.left);
			if(node.right!=null)
				stack.push(node.right);
		}
		return output_list;
	}
	
	/* Binary Tree InOrder Traversal*/
	public List<Integer> inOrder(DNode root){
		Stack<DNode> s = new Stack<>();
		List<Integer> l = new ArrayList<>();
		
		if(root == null) return l;
		DNode curr = root;
		while(curr!=null || s.size()>0) {
			while(curr!=null) {
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			l.add(curr.data);
			curr = curr.right;
		}
		return l;
	}
	
	/* Binary Tree PerOrder Traversal*/
	public List<Integer> preOrder(DNode root){
		Stack<DNode> s = new Stack<>();
		List<Integer> l = new ArrayList<>();
		
//		if(root == null)
//			return l;
//		
//		s.push(root);
//		while(!s.isEmpty()) {
//			DNode n = s.pop();
//			l.add(n.data);
//			if(n.right!=null)
//				s.push(n.right);
//			if(n.left!=null)
//				s.push(n.left);
//		}
//		return l;
		
		DNode curr = root;
		while(curr!=null || s.size() > 0) {
			while(curr!=null) {
				l.add(curr.data);
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			curr = curr.right;
		}
		return l;
	}

	/* Merge two Binary Trees*/
	public DNode mergeBinTree(DNode t1, DNode t2) {
		if(t1 == null) return t2;
		if(t2 == null) return t1;
		
		t1.data += t2.data;
		t1.left = mergeBinTree(t1.left, t2.left);
		t1.right = mergeBinTree(t1.right, t2.right);
		
		return t1;
	}

	/* Invert Binary Tree*/
	public DNode invertBinaryTree(DNode root) {
		if(root == null)
			return root;
		
		DNode left = invertBinaryTree(root.left);
		DNode right = invertBinaryTree(root.right);
		
		root.right = left;
		root.left = right;
		
		return root;
	}
	
	/* Max Depth of Binary tree*/
	/*
	 * A binary tree's maximum depth is the number of nodes along the longest path from the root
	 *  node down to the farthest leaf node.
	 *  Input: root = [3,9,20,null,null,15,7]
		Output: 3
	 *  Input: root = [1,null,2]
		Output: 2
		Input: root = []
		Output: 0
		Input: root = [0]
		Output: 1
	 */
	int result = 0;
	public int maxDepthOfTree(DNode root) {
		maxDepth(root, result);
		return result;
		
//		if(root == null)
//			return 0;
//		int left_depth = maxDepthOfTree(root.left);
//		int right_depth = maxDepthOfTree(root.right);
//		return Math.max(left_depth, right_depth);
	}
	private void maxDepth(DNode root, int depth) {
		if(root == null)
			return;
		
		if(root.left == null && root.right == null)
			result = Math.max(result, depth);
		
		maxDepth(root.left, depth+1);
		maxDepth(root.right, depth+1);
	}
	
	/* is symetric tree or not*/
	/*
	 * Given the root of a binary tree, check whether it is a mirror of itself 
	 * (i.e., symmetric around its center).
	 * Input: root = [1,2,2,3,4,4,3]   Output: true
	 * Input: root = [1,2,2,null,3,null,3]   Output: false
	 */
	public boolean isSymetricTree(DNode root) {
		return isMirror(root, root);
	}
	private boolean isMirror(DNode t1, DNode t2) {
		if(t1 == null && t2 == null)
			return true;
		if(t1 == null || t2 == null)
			return false;
		return (t1.data == t2.data) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
	}
	
	/*path sum*/
	public boolean hasPathSum(DNode root, int sum) {
		if(root == null)
			return false;
		
		Stack<DNode> stack_node = new Stack<>();
		Stack<Integer> stack_int = new Stack<>();
		
		stack_node.add(root);
		stack_int.add(sum-root.data);
		while(!stack_node.isEmpty()) {
			DNode curr_node = stack_node.pop();
			int curr_sum = stack_int.pop();
			
			if(curr_node.left == null && curr_node.right == null && curr_sum == 0)
				return true;
			
			if(curr_node.left!=null) {
				stack_node.add(curr_node.left);
				stack_int.add(curr_sum-curr_node.left.data);
			}
			if(curr_node.right!=null) {
				stack_node.add(curr_node.right);
				stack_int.add(curr_sum-curr_node.right.data);
			}
		}
		return false;
		
//		 			or
		
//		if (root == null)
//            return sum == 0;
//        return hasPathSum(root.left, sum - root.data)
//            || hasPathSum(root.right, sum - root.data);
		
	}
	
	/*  */
	static Vector<Integer> path = new Vector<Integer>();
	public void printKPathUtil(DNode root, int k)  { 
	    if (root == null) 
	        return; 
	  
	    path.add(root.data); 
	  
	    printKPathUtil(root.left, k); 
	  
	    printKPathUtil(root.right, k); 
	  
	    int f = 0; 
	    for (int j = path.size() - 1; j >= 0; j--)  { 
	        f += path.get(j); 
	  
	        if (f == k) 
	            printVector(path, j); 
	    } 
	    path.remove(path.size() - 1); 
	} 
	public void printVector( Vector<Integer> v, int i) { 
	    for (int j = i; j < v.size(); j++) 
	        System.out.print( v.get(j) + " "); 
	        System.out.println(); 
	}
	
	/* find the largest value in each row */
	public List<Integer> largestValues(DNode root){
		List<Integer> largestValues = new ArrayList<Integer>();
		height_method(root, largestValues, 0);
		return largestValues;
	}
	private void height_method(DNode root, List<Integer> lv, int l) {
		if(root == null) return;
		if(l == lv.size())
			lv.add(root.data);
		else
			lv.set(l, Math.max(lv.get(l), root.data));
		
		height_method(root.left, lv, l+1);
		height_method(root.right, lv, l+1);
	}
	
	/* binary tree pruning */
	public DNode prunigTree(DNode root) {
		if(root == null) return null;
		
		containOne(root);
		return root;
	}
	private boolean containOne(DNode root) {
		if(root == null) return false;
		
		boolean left = containOne(root.left);
		boolean right = containOne(root.right);
		if(!left) root.left = null;
		if(!right) root.right = null;
		
		return root.data==1 || left || right;
	}
	
	/* bottom left tree value*/
	public int leftValue(DNode root) {
		if(root == null) return 0;
		
		Queue<DNode> queue = new LinkedList<DNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			root = queue.poll();
			if(root.right!=null)
				queue.add(root.right);
			
			if(root.left!=null)
				queue.add(root.left);
			
		}
		return root.data;
	}
	
	
	/* completeness of binary tree*/
	public boolean isComplete(DNode root) {
		if(root == null) return false;
		Queue<DNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			DNode t = queue.poll();
			if(t.right!=null && t.left == null) {
				return false;
			}
			if(t.left!=null) 
				queue.add(t.left);
			if(t.right!=null)
				queue.add(t.right);
		}
		return true;
	}
	
	
	/*
	 * Range Sum of BST
	 * 
	 * Given the root node of a binary search tree and two integers low and high, 
	 * return the sum of values of all nodes with a value in the inclusive range [low, high].
	 * 
	 * Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
		Output: 32
		Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
		
		Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
		Output: 23
		Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.
	 */
	public int rangeSumBST(DNode root, int low, int high) {
        if(root == null) return 0;
        int sum = 0;
        Stack<DNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
             DNode curr = s.pop();
            if(curr.data>=low && curr.data<=high)
                sum += curr.data;
            if(curr.left!=null && curr.data>low)
                s.push(curr.left);
            if(curr.right!=null && curr.data<high)
                s.push(curr.right);
            
        }
        return sum;
    }
	
	
	/*
	 * Distribute Coins in Binary Tree
	 * 
	 * 
	 * You are given the root of a binary tree with n nodes where each node in the tree has node.
	 * val coins. There are n coins in total throughout the whole tree.

		In one move, we may choose two adjacent nodes and move one coin from one node to another. 
		A move may be from parent to child, or from child to parent.
		
		Return the minimum number of moves required to make every node have exactly one coin.
		
		Input: root = [3,0,0]
		Output: 2
		Explanation: From the root of the tree, we move one coin to its left child, 
		and one coin to its right child.
		
		Input: root = [0,3,0]
		Output: 3
		Explanation: From the left child of the root, we move two coins to the root [taking two moves]. 
		Then, we move one coin from the root of the tree to the right child.
			 
		*/
	int num_moves;
    public int distributeCoins(DNode root) {
        num_moves = 0;
        give_coins(root);
        return num_moves;
    }
    private int give_coins(DNode root){
        if(root == null) return 0;
        int left = give_coins(root.left);
        int right = give_coins(root.right);
        
        num_moves += Math.abs(left)+Math.abs(right);
        
        return root.data+left+right-1;
    }
	
    
    /*
     * Maximum Width of Binary Tree
     * 
     * Given the root of a binary tree, return the maximum width of the given tree.

		The maximum width of a tree is the maximum width among all levels.
		
		The width of one level is defined as the length between the end-nodes 
		(the leftmost and rightmost non-null nodes), where the null nodes between the end-nodes are 
		also counted into the length calculation.
		
		It is guaranteed that the answer will in the range of 32-bit signed integer.
		
		Input: root = [1,3,2,5,3,null,9]
		Output: 4
		Explanation: The maximum width existing in the third level with the length 4 (5,3,null,9).
		
		Input: root = [1,3,null,5,3]
		Output: 2
		Explanation: The maximum width existing in the third level with the length 2 (5,3).
		
		
     */
    int max_width;
    HashMap<Integer, Integer> hm;
    public int widthOfBinaryTree(DNode root) {
        max_width = 0;
        hm = new HashMap<Integer, Integer>();
        get_width(root, 0, 0);
        return max_width;
    }
    private void get_width(DNode root, int depth, int position){
        if(root == null) return;
        
        hm.computeIfAbsent(depth, x->position);
        max_width = Math.max(max_width, position-hm.get(depth)+1);
        get_width(root.left, depth+1, position*2);
        get_width(root.right, depth+1, position*2+1);
    }
    
	
    /*
     * Flatten Binary Tree to Linked List
     * 
     * 
     * Given the root of a binary tree, flatten the tree into a "linked list":

		The "linked list" should use the same TreeNode class where the right child pointer points to 
		the next node in the list and the left child pointer is always null.
		The "linked list" should be in the same order as a pre-order traversal of the binary tree.
		
		Example 1:
		nput: root = [1,2,5,3,4,null,6]
		Output: [1,null,2,null,3,null,4,null,5,null,6]
	
		Example 2:
		Input: root = []
		Output: []
		
		Example 3:
		Input: root = [0]
		Output: [0]
     */
    public void flatten(DNode root) {
        if(root == null) return;
        Stack<DNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            DNode curr = s.pop();
            if(curr.right!=null)
                s.push(curr.right);
            if(curr.left!=null)
                s.push(curr.left);
            if(!s.isEmpty()){
                curr.right = s.peek();
            }
            curr.left = null;
        }
    }
	
    
    /*
     * Binary Tree Right Side View
     * 
     * 
     * Given the root of a binary tree, imagine yourself standing on the right side of it, 
     * return the values of the nodes you can see ordered from top to bottom.
     * 
     * Example 1:
     * 
     * Input: root = [1,2,3,null,5,null,4]
		Output: [1,3,4]
		Example 2:
		
		Input: root = [1,null,3]
		Output: [1,3]
		Example 3:
		
		Input: root = []
		Output: []
     */
    public List<Integer> rightSideView(DNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Queue<DNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                DNode curr = q.poll();
                
                if(i==0) list.add(curr.data);
                
                if(curr.right!=null)
                    q.add(curr.right);
                if(curr.left!=null)
                    q.add(curr.left);
            }
        }
        return list;
    }
    
    
    
    
    
}
