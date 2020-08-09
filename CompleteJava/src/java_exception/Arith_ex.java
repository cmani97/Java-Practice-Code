package java_exception;

import java.io.*;

/*
 * Throwable
 * 		-Exception
 * 			-checked
 * 				-IOException
 * 				-SQLException
 * 			-unchecked
 * 				-RuntimeException
 * 					-ArithmeticException
 * 					-
 * 					-
 * 					-
 * 					-
 * 					-
 * 		-Error
*/
public class Arith_ex {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int i=8,j=0,k=0;
		int a[]=new int[3];
		
		try
		{
			
			System.out.println("Enter a number: ");
			j=Integer.parseInt(br.readLine());
			k=i/j;
			System.out.println(k);
			for(int o=0;o<=5;o++)
			{
				a[o]=o+1;
			}
			for(int value : a)
			{
				System.out.println(value);
			}
			
		}
		catch(IOException e)
		{
			System.out.println("IOException"+e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("can't divide y zero"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Maximum length is exceeded(4)");
		}
		catch(Exception e)
		{
			System.out.println("Exceptioon");
		}
		finally
		{
			br.close();
			System.out.println("bye");
		}
	}
}
