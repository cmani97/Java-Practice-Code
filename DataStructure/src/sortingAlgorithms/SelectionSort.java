package sortingAlgorithms;

public class SelectionSort {
	public static void main(String args[])
	{
		int a[]= {19,9,27,1,65,23};
		int min = 0,temp;
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println((i+1)+" value is "+a[i]);
		}
		
		System.out.println("\n");
		String[] b= {"mani","manisha","shiv","sweety","Deepthi"}; 
		for(int i=0;i<b.length;i++)
		{
			System.out.println((i+1)+" value is "+b[i]);
		}
		
		System.out.println("\n");
		
		String temp2;
		int min2 = 0;
		for(int i=0;i<b.length;i++)
		{
			min2=i;
			for(int j=i+1;j<b.length;j++)
			{
				if(b[j].compareTo(b[min2])<0)
				{
					min2=j;
				}
			}
			temp2=b[i];
			b[i]=b[min2];
			b[min2]=temp2;
		}
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println((i+1)+" value is "+b[i]);
		}
	}
}
