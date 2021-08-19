package codeForInterview;

import java.util.Scanner;

/*
 * 
q = 3
Sample Input
startVal   endVal
  2            5
  2            2
  24          28
  
Sample Output
3
0
0

In the first case, the range is [2,5]; thus the maximum difference will be 3 (5-2).

In the second case, the range is [2,2]. Thus the maximum difference will be 0 (2-2).

In the third case, there is no prime number in the range [24,28]. Therefore the maximum difference will be printed as 0.
 */

public class PrimeNumberQueries {
	static boolean isPrime(int number){
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i=3; (i*i) <= number; i+=2) {
           if (number % i == 0 ) return false;
        }
        return true;
    }
	static int maxDifference(int startVal, int endVal) {
        if(startVal>endVal)
            return 0;
        if(startVal==endVal)
            return 0;
        int min = 0, max = 0;
        for(int i=startVal;i<=endVal;i++){
            if(isPrime(i)){
                min = i;
                break;
            }  
        }
        for(int j=endVal;j>=startVal;j--){
            if(isPrime(j)){
                max = j;
                break;
            }
        }
        return max-min;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int startVal = in.nextInt();
            int endVal = in.nextInt();
            int result = maxDifference(startVal, endVal);
            System.out.println(result);
        }
        in.close();
	}

}
