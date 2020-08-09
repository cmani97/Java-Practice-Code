package opps_concept;

public class m_overloading {
	m_overloading()
	{
		System.out.println("default");
	}
	m_overloading(int x)
	{
		System.out.println("x value is "+x);
	}
	m_overloading(int y,int z)
	{
		System.out.println("sum of x and y is : "+(y+z));
	}
	int add(int x,int y)
	{
		return (x+y);
	}
	int add(int x,int y,int z)
	{
		return (x+y+z);
	}
	
	public static void main(String args[])
	{
		//m_overloading mo=new m_overloading(4);
		m_overloading mo=new m_overloading(4,9);
		//m_overloading mo=new m_overloading();
		int two = mo.add(6, 9);
		int three = mo.add(4, 1, 12);
		System.out.println("sum of x and y is : "+two);
		System.out.println("sum of x,y and z is : "+three);
		
	}
	
}
