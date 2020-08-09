package sortingAlgorithms;

public class HeapSort {
	public static void main(String args[])
	{
		int[] arr = {12, 11, 13, 10, 17, 15, 48, 33};
		HeapSort hs = new HeapSort();
		int len = arr.length;
		hs.sort(arr, len);
		
		for(int i:arr)
		{
			System.out.println(" "+i);
		}
		
	} 
	void sort(int[] arr,int len) {
		for(int i=len/2-1;i>=0;i--) {
			heapify(arr, len, i);
		}
		for(int i=len-1;i>=0;i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}
	void heapify(int[] arr,int n,int i) {
		int largest = i;
		int le = 2*largest+1;
		int ri = 2*largest+2;
		if(le < n && arr[le]>arr[largest]) {
			largest = le;
		}
		if(ri < n && arr[ri]> arr[largest]) {
			largest = ri;
		}
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr, n, largest);
		}
	}
}

