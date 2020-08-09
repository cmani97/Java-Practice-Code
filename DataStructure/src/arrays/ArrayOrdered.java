package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayOrdered {
	private int[] array ;
	private static int Size;
	public ArrayOrdered(int size) {
		array = new int[size];
		Size = 0;
	}
	public boolean delete(int ele) { 
		for (int i=0;i<Size;i++) {
			if(array[i] == ele) {
				for(int j=i;j<Size-1;j++) {
					array[j] = array[j+1];
				}
				Size--;
				return true;
			}
		}
		return false;
	}
	public boolean insert(int ele) {
		try {
			int min = 0,temp;
			array[Size] = ele;
			Size ++;
			for(int i=0;i<Size;i++) {
				min = i;
				for(int j=i+1;j<Size;j++) {
					if(array[min]>array[j]) {
						min = j;
					}
				}
				temp = array[i];
				array[i] = array[min];
				array[min] = temp; 
				
			}
			return true;
		}catch(ArrayIndexOutOfBoundsException e) {
			return false;
		}
		
				
	}
	public void display() {
		System.out.println("display");
		for(int i=0;i<Size;i++) {
			System.out.print(array[i]+" ");
		}	
		System.out.println("");
	}
	public int search(int ele) {
		int searchIndex = 0;
		for(int i=0;i<Size;i++) {
			if(array[i] == ele) {
				searchIndex = i;
				return searchIndex;
			} else {
				searchIndex = Size;
			}
		}
		return searchIndex;
	}
	public static void main(String[] args) throws IOException {
		ArrayOrdered or = new ArrayOrdered(10);
		char ch;
		
		do {
			System.out.println("Enter the first letter to perform the operation");
			System.out.println("insert, delete, Display, search");

			char operation = getChar();
			switch(operation) {
			case 'i':
				System.out.println("Enter interger to insert");
				int elei = getInt();
				boolean i = or.insert(elei);
				if (i) {
					System.out.println("Inserted");
				} else {
					System.out.println("not Inserted");
				}
				break;
			case 'd':
				System.out.println("Enter interger to delete");
				int eleD = getInt();
				boolean d = or.delete(eleD);
				if (d) {
					System.out.println("deleted");
				} else {
					System.out.println("not deleted");
				}
				break;
			case 'D':
				or.display();
				break;
			case 's':
				System.out.println("Enter interger to search the position");
				int search = getInt();
				int r= or.search(search);
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
