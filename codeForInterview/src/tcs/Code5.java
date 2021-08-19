package tcs;

public class Code5 {

	public static void main(String[] args) {
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
	}

}
