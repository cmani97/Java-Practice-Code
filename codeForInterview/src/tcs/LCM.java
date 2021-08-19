package tcs;
import java.util.*;

public class LCM {

	private static long
	lcmNaive(long numberOne, long numberTwo) 
	{ 

		long lowestCommonMultiple; 

		lowestCommonMultiple = (numberOne * numberTwo)/ greatestCommonDivisor(numberOne, numberTwo); 
		return lowestCommonMultiple; 
	} 

	private static long
	greatestCommonDivisor(long numberOne, long numberTwo) 
	{ 
		System.out.println(numberOne+","+ numberTwo);
		if (numberTwo == 0) 
			return numberOne; 

		return greatestCommonDivisor(numberTwo, 
									numberOne % numberTwo); 
	} 
	public static void main(String args[]) 
	{ 

		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the inputs"); 
		long numberOne = scanner.nextInt(); 
		long numberTwo = scanner.nextInt(); 
		System.out.println("LCM of "+numberOne+" and "+numberTwo+" is "+lcmNaive(numberOne, numberTwo)); 
		System.out.println("HCF of "+numberOne+" and "+numberTwo+" is "+greatestCommonDivisor(numberOne, numberTwo)); 
	} 

}

