import java.util.Scanner;

public class Qua {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int A [] = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        
        // OUTPUT [uncomment & modify if required]
        System.out.print(validQuadruples(N,A));
        sc.close();
	}
	public static int validQuadruples(int N, int A[]) {
        
        //this is default OUTPUT. You can change it.
        int result=0;
        
        //write your Logic here:
        for(int i=0;i<A.length;i=i+4){
            if(A[i]+A[i+1] == A[i+2]+A[i+3])
                result++;
        }
        
        return result;
    }
}

//11
//79 48 88 95 12 4 76 72 30 30 72
//
//1
//0
//
//
//99
//13 63 5 75 21 57 63 87 82 76 94 94 17 46 22 30 14 1 7 46 81 5 59 72 94 23 36 24 56 49 5 96 83 13 29 50 21 28 64 24 6 82 86 92 74 94 11 31 5 6 38 17 31 30 93 78 85 80 93 26 47 81 54 29 31 83 3 58 11 42 97 14 27 42 24 46 81 83 72 22 90 22 18 2 89 17 82 62 34 93 73 69 22 44 21 50 20 74 7
//
//1
//0
