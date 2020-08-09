package sortingAlgorithms;

public class MergeSort {
	
	int[] array;
	int[] tempArr;
	int length;
	
	public static void main(String args[])
	{
		int[] inputArr= {48,36,13,52,1,94,21,63};
		MergeSort ms=new MergeSort();
		ms.sort(inputArr);
		
		for(int i:inputArr)
		{
			System.out.println(" "+i);
		}
		
	}
	
	public void sort(int inpArr[])
	{
		this.array=inpArr;
		this.length=inpArr.length;
		this.tempArr=new int[length];
		divide(0,length-1);
	}
	
	public void divide(int lowerIndex,int higherIndex)
	{
		if(lowerIndex<higherIndex)
		{
			int middle=(lowerIndex+higherIndex)/2;
			divide(lowerIndex,middle);//sort left side array  // (0,3)=>m=1,[(0,1)=>m=0,[(0,0)=>false, (1,1)=>false], (2,3)=>m=2,[(2,2)=false, (3,3)=>false]]
			divide(middle+1,higherIndex);//sort right side array (4,6)=>m=5,[(4,5)=>m=4,[(4,4)=>false, (5,5)=>false], (6,6)=>false]
			
			mergeArray(lowerIndex,middle,higherIndex);
		}
	}
	
	public void mergeArray(int lowerIndex,int middle,int higherIndex)
	{
		for(int i=lowerIndex;i<=higherIndex;i++)
		{
			tempArr[i]=array[i];
		}
		
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		while(i<=middle&&j<=higherIndex)
		{
			if(tempArr[i]<=tempArr[j])
			{
				array[k]=tempArr[i];
				i++;
			}
			else {
				array[k]=tempArr[j];
				j++;
			}
			k++;
		}
		while(i<=middle)
		{
			array[k]=tempArr[i];
			k++;
			i++;
		}
		
	}
}
