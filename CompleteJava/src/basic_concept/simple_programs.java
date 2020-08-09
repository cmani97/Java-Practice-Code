package basic_concept;

public class simple_programs {

	public static void main(String args[])
	{
		/*int x=65,y=12,z=6;
		if(x>y)
		{
			if(x>z)
			{
				System.out.println("x is greatest");
			}
			else
			{
				System.out.println("z is greatest");
			}
		}
		else if(y>z)
		{
			if(y>z)
			{
				System.out.println("y is greatest");
			}
			else
			{
				System.out.println("z is greatest");
			}
		}	
		if(x>y && x>z)
		{
			System.out.println("x is greatest");
		}
		else if(y>x && y>z)
		{
			System.out.println("x is greatest");
		}
		else
		{
			System.out.println("z is greatest");
		}
		*/
		/*int x=5,y=7,temp;
		//temp=x;
		//x=y;
		//y=temp;
		//System.out.println("value of x is "+x);
		//System.out.println("value of y is "+y);
		
		//without using 3rd variable
		System.out.println("value of x is "+x+" and value of y is "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("value of x is "+x);
		System.out.println("value of y is "+y);
		*/
		
		//check the leap year
		
		/*int x=2020;
		if(x%4==0)
		{
			System.out.println("leap year");
		}
		else if(x%4==0 && x%100!=0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not is a leap tear ");
		}
		*/
		
		//polinsrome num(121=121 12345!=54321 12321=12321)
		int num=121;
		int rev = 0;
		int temp=num;
		while(num>0)
		{
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
			
		}
		if(temp==rev)
		{
			System.out.println("polindrome");
		}
		else
		{
			System.out.println("not polindrome ");
		}
		
		//factorial
		int a=4;
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("fact is "+fact);
		
		//fibonacci
		int aa=1,bb=2,cc;
		int nn=5;
		for(int i=0;i<nn;i++)
		{
			System.out.println(aa+" ");
			cc=aa+bb;
			aa=bb;
			bb=cc;
		}
		
	}
}
