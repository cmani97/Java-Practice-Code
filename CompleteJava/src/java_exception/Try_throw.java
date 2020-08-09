package java_exception;

import java.io.*;

public class Try_throw {
	public static void main(String args[]) throws IOException
	{
		//BufferedReader br;
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{
			String str="";
			str=br.readLine();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
//		finally
//		{
//			br.close();
//		}
	}
}
