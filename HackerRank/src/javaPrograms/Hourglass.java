package javaPrograms;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Hourglass {

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            
        	String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int cols;
		int rows = cols = arr.length;
        scanner.close();
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int sum = arr[i+0][j+0] + arr[i+0][j+1] + arr[i+0][j+2]
                                        + arr[i+1][j+1] + 
                           arr[i+2][j+0] + arr[i+2][j+1] + arr[i+2][j+2];
                max = Math.max(max, sum); 
                               
            }
        }
        System.out.println(max);
        
        
	}
	
	static int hourglassSum(int[][] arr) {
        int rows =  arr.length;
        int cols = arr[0].length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<rows-2;i++){
            for(int j=0;j<cols-2;j++){
                int sum = arr[i+0][j+0]+arr[i+0][j+1]+arr[i+0][j+2]
                                        +arr[i+1][j+1]+
                          arr[i+2][j+0]+arr[i+2][j+1]+arr[i+2][j+2];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
	
}
