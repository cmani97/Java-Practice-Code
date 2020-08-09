package core_concept;
import java.util.*;
//array is collection of homogenious elements that have contiguous memory locations. 
//types 1.one dimensional array 2.two dimensional
//we can't change size after declare
//arrays in java is an object
//
public class t_array {
	
	public static void main(String args[])
	{
		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		System.out.println(a);//output is [I@24d46ca6 why because array is an object.when we try to print an object in will print hash code.
		//for(int i=0;i<5;i++)
		for(int i:a)
		{
			//System.out.println(a[i]);
			System.out.println(i);
		}
		
		int b[]=new int[5];
		
		//for(int i=0;i<5;i++)
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]=i+1);
		}
		System.out.println("");
		//random values
		Random r=new  Random(); //random is a in-build class in util package.it print random values
		int c[]=new int[20];
		for(int i=0;i<c.length;i++)
		{
			c[i]=r.nextInt(50);
		}
		System.out.println("");
		System.out.println(c[2]);
		System.out.println("");
		for(int i:c)
		{
			System.out.println(i);
		}
	
	}

}
