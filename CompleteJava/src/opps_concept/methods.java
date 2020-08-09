package opps_concept;

//java method is a collection of statements that are grouped together to perform an operation.there are two methods
// 1.standard library methods  println(),
// 2.user defined methods  modifier returnType methodName(parameter); 

public class methods {
	
	public int max(int x,int y)
	{
		if(x>y)
		{
			return  x;
		}
		else
		{
			return y;
		}
	}
	public static void main(String args[])
	{
		methods ms=new methods();
		int num=ms.max(5,9);
		System.out.println("maximum num is : "+num);
	}
}
