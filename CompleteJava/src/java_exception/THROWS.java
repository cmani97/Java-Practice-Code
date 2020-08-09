package java_exception;

import java.io.*;
//throws is a keyword in java it will suppress errors.it will always after the method
public class THROWS {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i=4,j=0,k=0;
		System.out.println("Enter a number: ");
		j=Integer.parseInt(br.readLine());
		k=i/j;
		//System.out.println(k);
		
		try
		{
			k=i+j;
			if(k<10)
			{
				throw new MyException("ERROR");
			}
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("arith Minimum valuefor k is 10  "+e);
		} 
		catch (Exception e) {
			System.out.println("Minimum valuefor k is 10  "+e);
		}
	}
}
class MyException extends Exception
{
	public MyException (String msg)
	{
		super(msg);
	}
}
