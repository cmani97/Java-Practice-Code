package javaPrograms;
import java.io.*;
import java.util.*;

public class Subarray {

    public static void main(String[] args) {
        
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        System.out.println("arr1 "+arr);  // arr1 [I@41629346
//        System.out.println("arr1 "+Arrays.toString(arr));  // arr1 [1, 2, 3, 4, 5]
        int count=0, c=0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                if(sum<0){ count += 1; }
            }
        }
        System.out.println(count);
        
    }
}

