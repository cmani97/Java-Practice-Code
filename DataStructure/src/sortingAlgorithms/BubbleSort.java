package sortingAlgorithms;

public class BubbleSort {
	public static void main(String args[])
	{
		int a[]= {36,19,29,12,5};
		int temp1;
		for(int i=0;i<a.length;i++)
		{
			int flag1=0;
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp1=a[j];
					a[j]=a[j+1];
					a[j+1]=temp1;
					flag1=1;
				}
			}
			if(flag1==0)
			{
				break;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println((i+1)+" value is "+a[i]);
		}
		System.out.println("\n");
		String[] b= {"mani","manisha","shiv","sweety","Deepthi"}; 
		for(int i=0;i<a.length;i++)
		{
			System.out.println((i+1)+" value is "+b[i]);
		}
		
		System.out.println("\n");
		
		String temp2;
		for(int i=0;i<b.length;i++)
		{
			int flag2=0;
			for(int j=0;j<b.length-1-i;j++)
			{
				if(b[j].compareTo(b[j+1])>0)
				{
					temp2=b[j];
					b[j]=b[j+1];
					b[j+1]=temp2;
					flag2=1;
				}
			}
			if(flag2==0)
			{
				break;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println((i+1)+" value is "+b[i]);
		}
	}
}
