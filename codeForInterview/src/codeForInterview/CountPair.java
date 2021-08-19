package codeForInterview;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountPair {

    // Complete the socksMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int count,pairs=0,i,j,temp=0;

        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(ar[i]>ar[j])
                {
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        for(i=0;i<n;)
        {
            count=1;
            for(j=i+1;j<n;j++)
            {
                if(ar[i]==ar[j])
                {
                    count=count+1;
                }
            }
            pairs+=count/2;
            i=i+count;
        }
        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = scanner.nextInt();
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.print(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

//        scanner.close();
    }
}