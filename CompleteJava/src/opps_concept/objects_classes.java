package opps_concept;

class student
{
	int id;
	String name;
}
public class objects_classes {
	public static void main(String args[])
	{
		student obj1=new student();
		obj1.id=1;
		obj1.name="mani";
		
		student obj2;
		obj2=new student();
		obj2.id=2;
		obj2.name="hani";
		
		System.out.println(obj1.id);
		System.out.println(obj1.name);
		
		System.out.println(obj2.id);
		System.out.println(obj2.name);
	}
}
