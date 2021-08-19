package tcs;

public class Factorial {
	public int fact(int n) {
		if(n==1)
			return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		Factorial fc = new Factorial();
		int fact = 1;
		int n = 5;
		// using for loop
		for(int i=n;i>0;i--) {
			fact *= i;
		}
		
		System.out.println("fact by using loop = "+fact);
		
		System.out.println("fact by using recursion = "+fc.fact(n));

	}

}
