package tcs;

public class Code4 {
	 int x = 10;
	public static void main(String[] args) {
		try
		{
			Code4 t1 = new Code4();
		    System.out.println(t1.x);
		}
		catch(Exception e)
		{
		    System.out.println("Exception cought");
		    return;
		}
	}
	static
	{
	      int x =20;
	      System.out.print(x+" ");
	}
	

}
