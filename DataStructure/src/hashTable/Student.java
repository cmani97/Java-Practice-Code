package hashTable;

public class Student {
	private String name;
	private String rollno;
	private double cgpa;
	public Student(String name,String rollno,double d)
	{
		this.name=name;
		this.rollno=rollno;
		this.cgpa=d;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setRollno(String rollno)
	{
		this.rollno=rollno;
	}
	public String getRollno()
	{
		return rollno;
	}
	public void setcgpa(double cgpa)
	{
		this.cgpa=cgpa;
	}
	public double getcgpa()
	{
		return cgpa;
	}
	public String toString()
	{
		return "Name: "+name+", Rollno: "+rollno+", cgpa: "+cgpa;
	}
}
