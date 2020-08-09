package searchingAlgorithms;

public class LinearSearch {
	public static void main(String args[])
	{
		int[] arr= {15,9,7,4,13,18,11,16};
		int item=112;
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==item)
			{
				System.out.println("Found at index "+i);
				temp+=1;
				break;
			}
		}
		if(temp==0)
		{
			System.out.println("element is not found");
		}
	}
	
}
