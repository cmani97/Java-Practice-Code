package leetcode;

import java.util.ArrayList;
import java.util.List;
import leetcode.*;

import java.util.*;

public class All {
	
	/*no of Islands*/
	/*
	 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water),
	 * return the number of islands.

		An island is surrounded by water and is formed by connecting adjacent lands horizontally or
		vertically. You may assume all four edges of the grid are all surrounded by water.
		
		Input: grid = [
		  ["1","1","1","1","0"],
		  ["1","1","0","1","0"],
		  ["1","1","0","0","0"],
		  ["0","0","0","0","0"]
		]
		Output: 1
		
		Input: grid = [
		  ["1","1","0","0","0"],
		  ["1","1","0","0","0"],
		  ["0","0","1","0","0"],
		  ["0","0","0","1","1"]
		]
		Output: 3
	 */
	public int noOfIslands(char[][] grid) {
		int numIslands = 0;
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j] == '1')
					numIslands += dfs(grid, i, j);
			}
		}
		return numIslands;
	}
	public int dfs(char[][] grid, int i, int j) {
		if(i>=grid.length || i<0  || j>=grid[i].length || j<0 || grid[i][j] == '0')
			return 0;
//		if(arr[i][j]==1) {
//			arr[i][j] = 0;
//		}
		grid[i][j] = '0';
		dfs(grid, i-1, j);
		dfs(grid, i+1, j);
		dfs(grid, i, j-1);
		dfs(grid, i, j+1);
		return 1;
	}
	
	/*Pascal's Triangle */
	/*
	 * Given an integer numRows, return the first numRows of Pascal's triangle.

		In Pascal's triangle, each number is the sum of the two numbers directly above it as 
		shown:
		
		Input: numRows = 5
		Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
		
		Input: numRows = 1
		Output: [[1]]
	 */
	public List<List<Integer>> pascalTriangle(int number){
		List<List<Integer>> al = new ArrayList<>();
		if(number==0)
			return al;
		
		for(int i=0;i<number;i++) {
			List<Integer> l = new ArrayList<>();
			for(int j=0;j<=i;j++) {
				if(j==0 || j==i)
					l.add(1);
				else {
					int sum = al.get(i-1).get(j)+al.get(i-1).get(j-1);
					l.add(sum);
				}
			}
			al.add(l);
		}
		return al;
	}
	
	/*contain Duplicate*/
	/* Given an integer array nums, return true if any value appears at least twice in the 
	 * array, and return false if every element is distinct.
	 
	Example 1:
	Input: nums = [1,2,3,1]
	Output: true
	Example 2:
	
	Input: nums = [1,2,3,4]
	Output: false
	Example 3:
	
	Input: nums = [1,1,1,3,3,4,3,2,4,2]
	Output: true
	 */
	public boolean containDuplicates(int[] nums) {
		if(nums.length == 0)
			return false;
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i:nums) {
			if(hs.contains(i))
				return true;
			hs.add(i);
		}
		return false;
	}
	
	/* Two Sums II*/
	/* 
		Example 1:
		Input: numbers = [2,7,11,15], target = 9
		Output: [1,2]
		Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
		Example 2:
		
		Input: numbers = [2,3,4], target = 6
		Output: [1,3]
		Example 3:
		
		Input: numbers = [-1,0], target = -1
		Output: [1,2]
	 * 
	 */
	public int[] twoSumII(int[] numbers, int target) {
		
		int a_pointer = 0;
		int b_pointer = numbers.length-1;
		while(a_pointer <- b_pointer) {
			int sum = numbers[a_pointer]+numbers[b_pointer];
			if(sum>target)
				b_pointer -= 1;
			else if(sum<target)
				a_pointer += 1;
			else
				return new int[] {a_pointer+1, b_pointer+1};
		}
		return new int[] {a_pointer+1, b_pointer-1};
	}
	
	/* Polindrome Number*/
	public boolean poliNum(int number) {
		if(number == 0) return true;
		
		if(number<0 || number%10==0)
			return false;
		
		int rev = 0;
		int n = number;
		while(number>0) {
			int rem = number%10;
			number = number/10;
			rev = rev*10+rem;
		}
		if(rev == n) return true;
		else return false;
	}
	
	/* reverse integer */
	public int reverseNum(int number) {
		if(number<0) {
			return 0;
		}
		int rev = 0;
		int n = number;
		while(number!=0) {
			int rem = number%10;
			number = number/10;
			
			if(rev>Integer.MAX_VALUE/10 || rev == Integer.MIN_VALUE/10 && rem>2)
				return 0;
			if(rev<Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE/10 && rem<-8)
				return 0;
			
			rev = rev*10+rem;
		}
		return rev;
	}
	
	
	/* Binary Search*/
	public int binarySearch(int[] arr, int target) {
		int f = 0;
		int l = arr.length;
		
		int res = -1;
		while(true) {
			int mid = (f+l)/2;
			if(arr[mid] == target) {
				res = mid+1;
				break;
			}
			if(target<arr[mid])
				l = mid;
			else
				f = mid;
		}
		return res;
	}
	
	/* to lower case*/  // Character.toString((char) (c+32))
	public String toLower(String str) {
		String res = "";
		for(int i=0;i<str.length();i++) {  // for(char c: str.toCharArray()){
			char c = str.charAt(i);
			if(c<97)  //  Character.isUpperCase(c)
				res += (char) (c+32);
			else 
				res += c;
		}
		return res;
	}
	
	/* backspace string compare*/
	/*
	 * Input: s = "ab#c", t = "ad#c"
		Output: true
		Explanation: Both s and t become "ac".
		
		Input: s = "ab##", t = "c#d#"
		Output: true
		Explanation: Both s and t become "".
	 */
	public boolean backspaceCompare(String s, String t) {
        Stack<Character> sc = new Stack<>();
        Stack<Character> tc = new Stack<>();
        int sl = s.length();
        int tl = t.length();
        
        for(char c: s.toCharArray()){
            if(c == '#' && sc.size()>0)
                sc.pop();
            else if(c!='#')
                sc.push(c);
        }
        for(char c: t.toCharArray()){
            if(c == '#' && tc.size()>0)
                tc.pop();
            else if(c!='#')
                tc.push(c);
        }
        if(sc.size() == tc.size()){
            while(!sc.isEmpty()){
                if(sc.pop() != tc.pop())
                    return false;
            }
            return true;
        }else
            return false;
    }

	
	/* substring polindrome (not yet completed)  */
	/* 
		Example 1:
		
		Input: s = "abc"
		Output: 3
		Explanation: Three palindromic strings: "a", "b", "c".
		Example 2:
		
		Input: s = "aaa"
		Output: 6
		Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
	 */
	public int possiblePolindrome(String str) {
		int len = str.length();
		if(len==0) return 0;
		
		int count = 0;
		
		for(int i=0;i<len;i++) {
			for(int j=0;j<1;j++) {
				for(int k=j;k<len-i;k++) {
					String s = str.substring(k, k+i+1);
					System.out.println(s);
				}
			}
		}
		
		return count;
	}
	
	static final long M = 1000000007;
	static long multiplyFactors(int n) {
        long prod = 1;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                // If factors are equal,
                // multiply only once
                if (n / i == i)
                    prod = (prod * i) % M;
 
                // Otherwise multiply both
                else {
                    prod = (prod * i) % M;
                    prod = (prod * n / i) % M;
                }
            }
        }
        return prod;
    }

	/* reverse string */
	public void reverseString(char[] s) {
		int p1 = 0;
		int p2 = s.length-1;
		while(p1<=p2) {
			char t = s[p1];
			s[p1] = s[p2];
			s[p2] = t;
			p1++;
			p2--;
		}
	}
	
	/* valid polindrome or not */
	public boolean validPolindrome(String s) {
		int f = 0;
		int l = s.length()-1;
		int m = (l+1)/2;
		for(int i=0;i<m;i++) {
			if(s.charAt(f) != s.charAt(l))
				return false;
			f++;
			l--;
		}
		return true;
	}
	
	/* robot return to origin*/
	/*
	 * Example 1:

		Input: moves = "UD"
		Output: true
		Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.
		Example 2:
		
		Input: moves = "LL"
		Output: false
		Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin. We return false because it is not at the origin at the end of its moves.
		Example 3:
		
		Input: moves = "RRDD"
		Output: false
		Example 4:
		
		Input: moves = "LDRRLRUULR"
		Output: false
	 */
	public boolean robotReturnOrigin(String s) {
		int x=0, y=0;
		for(char move : s.toCharArray()) {
			if(move == 'U')
				y -= 1;
			else if(move == 'D')
				y += 1;
			else if(move == 'L')
				x -= 1;
			else if(move == 'R')
				x+= 1;
		}
		return (x==0 && y==0);
	}
	
	/*square of the sorted array  */
	/*
	 * Example 1:

		Input: nums = [-4,-1,0,3,10]
		Output: [0,1,9,16,100]
		Explanation: After squaring, the array becomes [16,1,0,9,100].
		After sorting, it becomes [0,1,9,16,100].
		Example 2:
		
		Input: nums = [-7,-3,2,3,11]
		Output: [4,9,9,49,121]
	 */
	public int[] sortedSquare(int[] A) {
		int N = A.length;
		int p_pointer = 0, n_pointer = 0, counter = 0;
		int[] s = new int[N];
		while(p_pointer<N && A[p_pointer]<0)
			p_pointer ++;
		n_pointer = p_pointer-1;
		while(n_pointer>=0 && p_pointer<N) {
			if(A[n_pointer]*A[n_pointer]<A[p_pointer]*A[p_pointer]) {
				s[counter++] = A[n_pointer]*A[n_pointer];
				n_pointer--;
			}else {
				s[counter++] = A[p_pointer]*A[p_pointer];
				p_pointer++;
			}
		}
		return s;
	}
	
	
	/*  keys and rooms can we visit all rooms*/
	/*
	 *  Input: [[1],[2],[3],[]]
		Output: true
		Explanation:  
		We start in room 0, and pick up key 1.
		We then go to room 1, and pick up key 2.
		We then go to room 2, and pick up key 3.
		We then go to room 3.  Since we were able to go to every room, we return true.
		Example 2:
		
		Input: [[1,3],[3,0,1],[2],[0]]
		Output: false
		Explanation: We can't enter the room with number 2.
	 */
	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		Stack<Integer> s = new Stack<>();
		boolean visited[] = new boolean[rooms.size()];
		s.add(0);
		while(!s.isEmpty()) {
			int curr = s.pop();
			for(int key:rooms.get(curr)) {
				if(!visited[key]) {
					visited[key] = true;
					s.add(key);
				}	
			}
		}
		for(boolean visit:visited)
			if(!visit)
				return false;
		return true;
	}
	
	/* Container with most water*/
	public int maxArea(int[] heights) {
		int max_area = 0;
		int p1 = 0, p2 = heights.length-1;
		while(p1<p2) {
			if(heights[p1]<heights[p2]) {
				max_area = Math.max(max_area, heights[p1]*(p2-p1));
				p1++;
			}else {
				max_area = Math.max(max_area, heights[p2]*(p2-p1));
				p2--;
			}
		}
		return max_area;
	}

	/* 3 sum closest */
	public int closestSum(int[] nums, int target) {
		int result = 0, sum, len = nums.length;
		for(int i=0;i<len-2;i++) {
			sum = nums[i];
			for(int j=i+1;j<i+2;j++) {
				sum += nums[j];
			}
			
		}
		return result;
	}
	
	/* hands of straights */
	public boolean isStraightHand(int[] hand, int W) {
		TreeMap<Integer, Integer> cards_count = new TreeMap<>();
		for(int card: hand) {
			if(cards_count.containsKey(card))
				cards_count.replace(card, cards_count.get(card)+1);
			else
				cards_count.put(card, 1);
		}
		while(!cards_count.isEmpty()) {
			int card = cards_count.firstKey();
			for(int i=card;i<card+W; i++) {
				if(!cards_count.containsKey(i))
					return false;
				if(cards_count.get(i)==1)
					cards_count.remove(i);
				else
					cards_count.replace(i, cards_count.get(i)-1);
			}
		}
		return true;
	}
	
	static long maximumCoins(int N, int[] A){
	       // Write your code here
	        long result = 0;

	        int n = 0;
	        while(n>=0 && n<N){
	            if(A[n]<=0){
	                break;
	            }
	            result += 1;
	            A[n] = A[n]-1;
	            n++;
	            if(n==N)
	                n = 0;
	        }
	        return result;
	    
	    }
	
	/*
	 * Jewels and Stones
	 * 
	 * 
	 * You're given strings jewels representing the types of stones that are jewels, and stones 
	 * representing the stones you have. Each character in stones is a type of stone you have. 
	 * You want to know how many of the stones you have are also jewels.

		Letters are case sensitive, so "a" is considered a different type of stone from "A".
		
		Example 1:

		Input: jewels = "aA", stones = "aAAbbbb"
		Output: 3
		Example 2:
		
		Input: jewels = "z", stones = "ZZ"
		Output: 0
	 */
	 public int numJewelsInStones(String jewels, String stones) {
	        int len = stones.length();
	        if(len==0) return 0;
	        int num_jewels = 0;
	        
	        for(int i=0;i<len;i++){
	            if(jewels.indexOf(stones.charAt(i))!= -1)
	                num_jewels++;
	        }
	        return num_jewels;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	
	
}
