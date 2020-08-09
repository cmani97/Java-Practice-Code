package core_concept;

//this can be used refer the current class variable
//1.to eliminate abigvity// if there are two variales with same name
//2.
//3.
//4.

public class This {
	//1
	int num;
	int a(int num)
	{
		this.num=num;
		return num; 
	}
	//2
	
	
	//3
	
	
	//4
	int n;
	This()
	{
		
	}
	This(int n)
	{
		this.n=n;
	}
	
	//5.this() used to invoke current class constructor
	String name;
	int roll;
	String course;
	int fee;
	
	This(String name,int roll,String course)
	{
		this.name=name;
		this.roll=roll;
		this.course=course;
	}
	This(String name,int roll,String course,int fee)
	{
		this(name,roll,course);//constructor chaining
		this.fee=fee;
	}
	void display1()
	{
		System.out.println("name: "+name+", roll: "+roll+", course: "+course);
	}
	void display2()
	{
		System.out.println("name: "+name+", roll: "+roll+", course: "+course+", fee:"+fee);
	}
	public static void main(String args[])
	{
		//4
		This t=new This(4);
		System.out.println("n value "+t.n);
		//5
		This s1=new This("mani",9,"java");
		This s2=new This("manisha",18,"python",2000);
		s1.display1();
		s2.display2();
	}
}
