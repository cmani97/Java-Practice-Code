package freshworks;

import java.util.Vector;

public class MaximumSumSubmatrix {

	public static void main(String[] args) {
		int [][]matrix = { { 0, -2, -7, 0 },
                { 9, 2, -6, 2 },
                { -4, 1, -4, 1 },
                { -1, 8, 0, -2 } };

		maxSubmatrixSum(matrix);
	}

	static void maxSubmatrixSum(int[][] matrix) {
		int r = matrix.length;
		int c = matrix[0].length;
		
		int prefix[][] = new int[r][c];
		
		int i,j,k;
		// initializing all prefix values to zeros
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++)
				prefix[i][j] = 0;
		}
		
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				if(j==0)
					prefix[i][j] = matrix[i][j];
				else
					prefix[i][j] = matrix[i][j]+prefix[i][j-1];
			}
		}
		int maxSum = Integer.MIN_VALUE;
		for(i=0;i<c;i++) {
			for(j=i;j<c;j++) {
				Vector<Integer> v = new Vector<>();
				for(k=0;k<r;k++) {
					int el = 0;
					if(i==0)
						el = prefix[k][j];
					else
						el = prefix[k][j]-prefix[k][i-1];
					v.add(el);
				}
				maxSum = Math.max(maxSum, getMax(v));
			}
		}
		System.out.println("MAx sum = "+maxSum);
		
	}

	static int getMax(Vector<Integer> v) {
		int sum=0, max=0;
		for(int i=0;i<v.size();i++) {
			sum += v.get(i);
			if(sum>max)
				max = sum;
			if(sum<0)
				sum = 0;
		}
		return max;
	}
}
