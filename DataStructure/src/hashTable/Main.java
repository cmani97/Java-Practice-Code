package hashTable;

public class Main {
	public static void main(String args[])
	{
		HashTableC ht=new HashTableC();
		Student std1=new Student("mani","9",9.9);
		Student std2=new Student("mani","18",8.1);
		Student std3=new Student("shiv","72",8.9);
		Student std4=new Student("parvathi","1",9.2);
		
		int std1Key=ht.toHashCode(std1.getRollno());
		int std2Key=ht.toHashCode(std2.getRollno());
		int std3Key=ht.toHashCode(std3.getRollno());
		int std4Key=ht.toHashCode(std4.getRollno());
		
		ht.insert(std1Key, std1);
		ht.insert(std2Key, std2);
		ht.insert(std3Key, std3);
		ht.insert(std4Key, std4);
		
		ht.showData();
		System.out.println(" ");
		ht.deletestd(std3.getRollno());
		
		ht.showData();
		
		
//		Student new_std2=ht.fetchStuInfo(std2.getRollno());
//		if(new_std2.getName().equals(std2.getName()))
//		{
//			System.out.println("equal");
//		}
	}
}
