package arrays;

public class ReverseArray {
	
	static int[] reverseArray(int[] a) {
        int len = a.length;
        int arr[] = new int[len];
        int k=0;
        for(int i=len-1; i>=0;i--){
            arr[k] = a[i];
            k++;
        }
        return arr;
    }
	public static void main(String[] args) {
		int arrCount = 4;
		int[] arr = {1,2,3,4};
		int[] res = reverseArray(arr);
		for(int i=0;i<arrCount;i++)
			System.out.print(res[i]+" ");
	}

}
