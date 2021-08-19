package codeForInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
5  = t
l  r
5  5
2  7
8  10
10 20
4  5
Example:

Range: [ 1, 10 ]
The maximum difference between the prime numbers in the given range is 5.
Difference = 7 - 2 = 5

Range: [ 5, 5 ]
There is only one distinct prime number so the maximum difference would be 0.

Range: [ 8 , 10 ]
There is no prime number in the given range so the output for the given range would be -1.

output ->
0
5
-1
8
0
 */

public class PrimeGame {
	public static boolean isPrime(int l){
		if(l<2)
			return false;
        for(int i=2;i<l;i++){
            if(l%i==0)
                return false;  
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int i=0,j=0,min=0,max=0;
            boolean flag = false;
            for(i=l;i<=r;i++){
                if(isPrime(i)){
                    flag = true;
                    min = i;
                    break;
                }
            }
            for(i=r;i>=l;i--){
                if(isPrime(i)){
                    flag = true;
                    max = i;
                    break;
                }
            }
            if(flag)
                System.out.println(max-min);
            else
                System.out.println("-1");
        }
        

	}

}
