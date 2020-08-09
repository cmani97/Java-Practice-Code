package core_concept;
import java.io.*;
import java.util.*;
//buffer is synchronous while Scanner is not.
//buffer should be used if we are working with multiple threads.
//it has large buffer memory than scanner
//it is fast compare to scanner because scanner does parsing of input data and buffer suply read sequence of characters
//

public class input_readers {
	
		public static void main(String args[]) throws IOException
		{
			Scanner sc=new Scanner(System.in);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			/*
			System.out.println("enter num");
			int num=sc.nextInt();
			System.out.println("num value is "+num);
			System.out.println("enter String");
			String str=sc.nextLine();
			System.out.println("string  is "+str);
			*/
			System.out.println("enter String");
			String str=br.readLine();
			System.out.println("string  is "+str);
			System.out.println("");
			System.out.println("enter num");
			int num=Integer.parseInt(br.readLine());
			//int num=Double.parseInt(br.readLine());
			System.out.println("num value is "+num);
		}
}
