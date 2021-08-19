package ListPackage;

import java.util.ArrayList;

//public class CustomArrayList {
//	class Data{
//		int roll;
//		String name;
//		long phone;
//		int marks;
//		Data(int roll, String name, int marks, long phone){
//			this.roll = roll;
//			this.name = name;
//			this.marks = marks;
//			this.phone = phone;
//			
//		}
//	}
//	public static void main(String args[]) {
//		CustomArrayList cs = new CustomArrayList();
//		ArrayList<Data> ar = new ArrayList<Data>();
//		
//		int[] roll = {1,2,3,4};
//		String[] name = {"mani", "hani", "mark","nick"};
//		int[] marks = {90,93,94,99};
//		long[] phone = {7981942938L,9100299469L,9121960948L,7234983723L};
//		for(int i=0;i<4;i++) {
//			ar.add(new Data(roll[i], name[i], marks[i], 
//                    phone[i])); 
//		}
//		
//	}
//}

class CustomArrayList 
{ 
	int n=4; 
	class Data 
	{ 
		int roll; 
		String name; 
		int marks; 
		long phone; 
		Data(int roll, String name, int marks, long phone) 
		{ 
			this.roll = roll; 
			this.name = name; 
			this.marks = marks; 
			this.phone = phone; 
		} 
	} 

	public static void main(String args[]) 
	{ 
		int roll[] = {1, 2, 3, 4}; 
		String name[] = {"Shubham", "Atul", "Ayush", "Rupesh"}; 
		int marks[] = {100, 99, 93, 94}; 
		long phone[] = {8762357381L, 8762357382L, 8762357383L, 8762357384L};
		
		CustomArrayList custom = new CustomArrayList(); 
		custom.addValues(roll, name, marks, phone); 
	} 

	public void addValues(int roll[], String name[], int marks[], long phone[]) 
	{ 
		ArrayList<Data> list=new ArrayList<>(); 

		for (int i = 0; i < n; i++) 
		{ 
			list.add(new Data(roll[i], name[i], marks[i], phone[i])); 
		} 
		printValues(list); 
	} 

	public void printValues(ArrayList<Data> list) 
	{ 
		for (int i = 0; i < n; i++) 
		{ 
			Data data = list.get(i); 
			System.out.println(data.roll+" "+data.name+" "+data.marks+" "+data.phone); 
		} 
	
	}
} 
