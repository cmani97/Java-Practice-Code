package sortingAlgorithms;

public class InsertionSort {
	public static void main(String args[])
	{
		int a[]= {19,9,27,1,65,23};
		int temp,j;
		for(int i=0;i<a.length;i++)
		{
//			temp=a[i];
//			j=i;
//			while(j>0&&a[j-1]>temp)
//			{
//				a[j]=a[j-1];
//				j=j-1;
//			}
//			a[j]=temp;
			for(j=i;j>0;j--) {
				if(a[j]<a[j-1])
				{
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println((i+1)+" value is "+a[i]);
		}
	}
}
