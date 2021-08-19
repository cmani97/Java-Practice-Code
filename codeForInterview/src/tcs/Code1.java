package tcs;



///*
public class Code1
{
	 public static void main(String[] args)
	 {
//		 try
//		 {
//			 int a= 100;
//			 a=a/0;
//			 System.out.println(a);
//		 }
//		 catch(Exception e)
//		 {
//			 System.out.println("Inside Exception");
//		 }
//		 catch(RuntimeException e)
//		 {
//			 System.out.println("Inside RunTimeException");
//		 }
		 
		 int age=90;
		 if(age>0)
			 System.out.print("New born");
		 else if(age>20)
			 System.out.print("getting  young");
		 else if(age>50)
			 System.out.print("getting old");
		 else if(age>80)
			 System.out.print("really old");
	 }
}
//*/

/*public class Code1 {

	public static void main(String[] args) {
		// 1
		int  $= 5;
		//2
		int i,j,x=0;
		for(i=0;i<5;i++)
			for (j=0;j<5;j++) {
				x=(i+j-1);
				System.out.print("i"+x);
				break;
			}
		System.out.print(x+"o");
		
		//3
		try
		{
		 int[] arr = {10, 25, 2, 6, 8, 9, 7, 32};
		 for(int i=0; i<arr.length; i++)
		 {
		 System.out.print(arr[i+1]);
		 }
		}
		catch(Exception e)
		{
		 System.out.println("Inside Exception");
		}
		int m=35,n=5, p = 5, q=6;
		System.out.println(m*n+p/q);
		System.out.println(p/q+m*n);
		System.out.printf("%d", 25 ? 5 ? 0 : 5 : 25);

		int i = 1, j=1;
		for(;j<=i ; System.out.println(i+ "-" + j++));
		
		int x=10,y,z;
		 z=y=x;
		 y-= x--;
		 z-= --x;
		 System.out.println(x);
		 x-=--x - x--;
		 System.out.println(x+"-"+y+"-"+z);
	}
}
*/
 //11
/*abstract class Shape
{
public abstract void Disp();
}
class Triangle extends Shape
{
public final void Disp()
{
System.out.println("Triangle");
}
}
class Rectangle extends Triangle
{
public void Disp()
{
System.out.println("It's Rectangle");
}
}
public class Code1
{
public static void main(String[] args)
{
Rectangle obj = new Rectangle();
obj.Disp();
}
}*/
