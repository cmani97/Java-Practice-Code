package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Person {
	private String fname;
	private String lname;
	private int age;
	public Person(String firstName, String lastName, int a) {
		fname = firstName;
		lname = lastName;
		age = a;
	}
	public void displayPerson() {  //toString()
		System.out.println("Last Name: "+lname+", First Name: "+fname+", age: "+age);
	}
	public String getLname() {
		return lname;
	}
	
}

public class ArrayPerson {
	private Person[] person;
	private static int Size;
	public ArrayPerson(int max) {
		person = new Person[max];
		Size = 0;
	}
	public boolean insert(String fname, String lname, int age) {
		person[Size] = new Person(fname, lname, age);
		Size++;

		return true;
	}
	public void display() {
		for (int i=0; i<Size;i++) {
			person[i].displayPerson();
		}
	}
	private boolean delete(String dlname) {
		for(int i=0;i<Size;i++) {
			if(person[i].getLname().equals(dlname)) {
				for(int j=i;j<Size-1;j++) {
					person[j] = person[j+1];
				}
				Size--;
				return true;
			}
		}
		return false;
	}
	private int search(String search) {
		int searchIndex = 0;
		for(int i=0;i<Size;i++) {
			String lname = person[i].getLname();
			if(lname == search) {
				searchIndex = i;
				return searchIndex;
			} else {
				searchIndex = Size;
			}
		}
		return searchIndex;
	}
	public static void main(String[] args) throws IOException {
		ArrayPerson pa = new ArrayPerson(10);
		char ch;
		
		do {
			System.out.println("Enter the first letter to perform the operation");
			System.out.println("insert, delete, Display, search");

			char operation = getChar();
			switch(operation) {
			case 'i':
				System.out.println("Enter fname to insert");
				String fname = getString();
				System.out.println("Enter lname to insert");
				String lname = getString();
				System.out.println("Enter id to insert");
				int age = getInt();
				boolean i = pa.insert(fname, lname, age);
				if (i) {
					System.out.println("Inserted");
				} else {
					System.out.println("not Inserted");
				}
				break;
			case 'd':
				System.out.println("Enter lname to delete");
				String dlname = getString();
				boolean d = pa.delete(dlname);
				if (d) {
					System.out.println("deleted");
				} else {
					System.out.println("not deleted");
				}
				break;
			case 'D':
				pa.display();
				break;
			case 's':
				System.out.println("Enter lname to search the position");
				String search = getString();
				int r= pa.search(search);
				if(r == Size) {
					System.out.println(search+" is not found");
				} else {
					System.out.println(search+" found at position "+(r+1));
				}
				break;
			default:
				
			
			}
			System.out.println("Enter 'y' to continue or 'n' to terminate");
			ch = getChar();
		}while(ch == 'y');
	}
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	public static char getChar() throws IOException
	{
		String s = getString();
		return s.charAt(0);
	}
	public static Double getDouble() throws IOException
	{
		String s = getString();
		Double dob = Double.valueOf(s);
		return dob.doubleValue();
	}
	public static int getInt() throws IOException
	{
		String s = getString();
		int v = Integer.parseInt(s);
		return v;
	}

}
