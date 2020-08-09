package opps_concept;
import java.util.*;
//it is a special method in java.it is called when the method is created.
//rules
//1.name should be same as the class name
//2.these  are not private,abstract,final,native synchronized
//types
//1.parameterized  2.default
public class constructors {

	//int num;
	int num=5;
	constructors()
	{
		System.out.println("default constructor called");
	}
	constructors(int x)
	{
		System.out.println("parameterized constructor called");
	}
	public static void main(String args[])
	{
		constructors cs=new constructors();
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int temp=sc.nextInt();
		constructors cs2=new constructors(temp);
		
		int n=cs2.num;
		System.out.println("value is : "+n);
	}
}
