package soloLearn;
import java.util.Scanner;


class stringReverse {
	public static void main(String args[])
	{
		System.out.println("Enter");
		String r="";
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int len=s.length();
		
		for(int i=len;i>0;i--)
		{
			r=r+s.charAt(i-1);
			
		}
		System.out.println(r);
		
		StringBuffer br = new StringBuffer(s);
		System.out.println(br.reverse());
		System.out.println(r.replace('a', 'A'));

	}
}
