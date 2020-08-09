//control statements are used to an action
//control statements are conditional statements.looping and also break and continue	
package basic_concept;
import java.util.Scanner;

public class control_statements {
	public static void main(String args[])
	{
		//even or odd
		int a=4;
		if(a%2==0)
		{
			System.out.println("a is even");
		}
		else
		{
			System.out.println("a is odd");
		}
		//positive or negative
		int b=0;
		if(b>0)
		{
			System.out.println("b is positive");
		}
		else if(b<0)
		{
			System.out.println("b is negative");
		}
		else
		{
			System.out.println("b is zero");
		}
		//positive and even
		int c=9;
		if(c>0)
		{
			if(c%2==0)
			{
				System.out.println("c is +ve and even");
			}
			else
			{
				System.out.println("c is +ve and odd");
			}
		}
		else if(c<0)
		{
			if(c%2==0)
			{
				System.out.println("c is -ve and even");
			}
			else
			{
				System.out.println("c is -ve and odd");
			}
		}
		else
		{
			System.out.println("c is zero");
		}
		//diff between switch and if else
		//switch can only operate with char or int variables,if allow any type of data
		//we cant use conditions in switch we can only use single variable,if can allows conditions
		//
		 int day=79;
		 switch(day)
		 {
		 case 1:
			 System.out.print("monday");
			 break;
		 case 2:
			 System.out.print("tuesday");
			 break;
		 case 3:
			 System.out.print("wednesdy");
			 break;
		 case 4:
			 System.out.print("thursday");
			 break;
		 case 5:
			 System.out.print("friday");
			 break;
		 case 6:
			 System.out.print("saturday");
			 break;
		 case 7:
			 System.out.print("subday");
			 break;
		 default:
			 System.out.print("entered a number whitch is not in bitween 1-7");
			 
		 }
		 
		//looping
		 //for loop
		 //it is used to iterate a part of program
		 
		 int i;
		 for(i=1;i<=10;i++)
		 {
			 System.out.println(i*5+"\n");
		 }
		 //while loop
		 //it is used to iterate a part in program
		 //it is used when you dont know the no of iteration you have to do
		//the no of iteration is not fixed,but in for it is fixed.this is the difference between for and while
		 
		 int evennumber = 2;
		 int ii=0;
		 while(ii<10)
		 {
			 System.out.println(evennumber);
			 evennumber=evennumber+2;
			 ii++;
		 }
		 //do while 
		//it is used to iterate a part in program.the no of iteration is not fixed but you havae to loop at least once 
		 //diff is it check the condition ofter the loop 
		 int xx=1;
		 do
		 {
			 System.out.println("print anything");
		 }while(xx>5);
		 
		 //even or odd
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a num");
		 int yy=sc.nextInt();
		 int remainder=yy%2;
		 if(remainder == 1)
		 {
			 System.out.println("odd"); 
		 }else
		 {
			 System.out.println("even"); 
		 }
	}
}
