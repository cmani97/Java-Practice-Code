package core_concept;
import java.util.*;

class Student1
{
	public String sname;
	public int roll;
	Student1(String sname,int roll)
	{
		this.sname=sname;
		this.roll=roll;
	}
}
public class arrays {
	
	public static void main(String args[])
	{
		
		/*
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter 10 nums");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("nums are");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		*/ 
		//array of object
		Student1[] arr1=new Student1[5];
		arr1[0]=new Student1("mani",9);
		arr1[1]=new Student1("niha",18);
		arr1[2]=new Student1("barath",72);
		arr1[3]=new Student1("usha",90);
		arr1[4]=new Student1("syam",36);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("sname: "+arr1[i]+", roll: "+arr1[i]);
		}
		
		
	}
}
