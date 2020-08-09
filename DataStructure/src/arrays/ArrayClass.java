package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayClass {
	static int[] array = new int[10];
	private static int nSize = 0;
	public static void insert(int pos, int ele) {
		array[pos-1] = ele;
	}
	public static void insert(int ele) {
		array[nSize] = ele;
		nSize ++;
	}
	public static void delete(int ele) {
		int temp = 0, i;
		for(i = 0; i < array.length; i++) {
			if (array[i] == ele) {
				temp = 1;
				for(int j=i;j<array.length-1;j++) {
					array[j] = array[j+1];
					array[j+1] = 0;
				}
				nSize --;
				break;
			}
		}
		if(temp == 0) {
			System.out.println("Element not deleted");
		}else {
			System.out.println(ele + " is deleted");
		}
	}
	public static void display() {
		for(int i=0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.print("\n");
	}
	public static void search(int ele) {
		int temp = 0, i;
		for(i = 0; i < array.length; i++) {
			if (array[i] == ele) {
				temp = 1;
				break;
			}
		}
		if(temp == 0) {
			System.out.println("Element not found");
		}else {
			System.out.println(ele + " is found at position "+(i+1));
		}
	}
	public static void main(String[] args) throws IOException {
		ArrayClass ar = new ArrayClass();
		System.out.print("welcome ");
		char ch;
		
		do {
			System.out.println("Enter the first letter to perform the operation");
			System.out.println("insert with position(i), insert without position(I), delete, Display, search");

			char operation = getChar();
			switch(operation) {
			case 'i':
				System.out.println("Enter interger to insert");
				int elei = getInt();
				System.out.println("Enter position where u want to insert the size is 10");
				int posi = getInt();
				ar.insert(posi, elei);
				break;
			case 'I':
				System.out.println("Enter interger to insert");
				int eleI = getInt();
				ar.insert(eleI);
				break;
			case 'd':
				System.out.println("Enter interger to delete");
				int eleD = getInt();
				ar.delete(eleD);
				break;
			case 'D':
				ar.display();
				break;
			case 's':
				System.out.println("Enter interger to search the position");
				int search = getInt();
				ar.search(search);
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
//		char ch = s.charAt(0);
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
