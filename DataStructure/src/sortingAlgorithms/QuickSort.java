package sortingAlgorithms;

public class QuickSort {
	
	public static void main(String args[])
	{
		/*
		 * int n=2; int fact=1; for(int i=1;i<n;i++) { fact*=(i+1); }
		 * System.out.println(fact);
		 */
		int[] arr= {15,9,7,5,13,18,11,16};
		int length=arr.length;
		
		QuickSort qs=new QuickSort();
		qs.QSRecursion(arr,0,length-1);
		qs.printArr(arr);
	}
	int partition(int arr[],int low,int high)
	{
		int pivot=arr[(low+high)/2];
		while(low<=high)
		{
			while(arr[low]<pivot)
			{
				low++;
			}
			while(arr[high]>pivot)
			{
				high--;
			}
			if(low<=high)
			{
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				
				low++;
				high--;
			}
		}
		return low;
	}
	void QSRecursion(int[] arr,int low,int high)
	{
		int pi=partition(arr,low,high);
		if(low<pi-1)
		{
			QSRecursion(arr,low,pi-1);
		}
		if(pi<high)
		{
			QSRecursion(arr,pi,high);
		}
	}
	void printArr(int[] arr)
	{
		for(int i:arr)
		{
			System.out.println(" "+i);
		}
	}
}
