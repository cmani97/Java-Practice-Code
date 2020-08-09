package core_concept;

public class t_arrayOfObjects {
	public static void main(String args[])
	{
		Student s1=new Student("mani",1);
		Student s2=new Student("barath",2);
		Student s3=new Student("usha",3);
		Student s4=new Student("syam",4);
		Student s5=new Student("surya",5);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s2);
		
		Student[] students=new Student[5];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		students[3]=s4;
		students[4]=s5;
		for(Student s : students)
		{
			System.out.println(s);
		}
		
	}
}
class Student
{
	String sname;
	int roll;
	public Student(String sname,int roll)
	{
		this.sname=sname;
		this.roll=roll;
	}
	public String toString()
	{
		return "student{sname= "+sname+" roll= "+roll+"}" ;
	}
}
 