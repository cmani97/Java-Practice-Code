package core_concept;

//this is primarily used for memory management.tis can be used along with classes,methods,variables and blocks
//static keyword belongs to the class than  instance of the class
//that means if you make a member static,then you can access it without object
public class Static {

	/*
	//static variable
	int side;
	static int objectCount=0;
	Static()
	{
		objectCount++;
	}
	Static(int x)
	{
		side=x;
		objectCount++;
	}
	*/
	
	
	//static methods
	static int caliculateCube(int x)
	{
		return x*x*x;
	}
	//static block
	static
	{
		System.out.println("static block");//auto matically invoked
		
	}
	public static void main(String args[])
	{
	/* 
	 Static s1=new Static(5);
	//System.out.println("object count is : "+objectCount);
	Static s2=new Static(5);
	Static s3=new Static(5);//it is incrementing continuously
	System.out.println("object count is : "+objectCount);
	*/
	
		System.out.println("cube of 5 is : "+caliculateCube(5));
		System.err.println("\ncube of 5 is : "+caliculateCube(5));//you dont need to create object for static methods
	}
}
