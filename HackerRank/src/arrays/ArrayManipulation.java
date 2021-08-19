package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {

	static long arrayManipulation(int n, int[][] queries) {
        long max = 0;
        long[] arr = new long[n+2];
        int m = queries.length;
        for (int i = 0; i < m; i++) {
            int a = queries[i][0], b = queries[i][1], k = queries[i][2];
            arr[a] += k;
            arr[b+1] -= k;
        }
        max = getMax(arr);
        return max;
    }
    
    private static long getMax(long[] array){
        long max = Long.MIN_VALUE, sum = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
            max = Math.max(sum, max);
        }
        return max;
    }
	private static final Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {
		String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

	}

}
