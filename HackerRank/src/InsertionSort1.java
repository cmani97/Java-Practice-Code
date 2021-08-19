
public class InsertionSort1 {
	
	static void insertionSort1(int n, int[] arr) {
        int temp = arr[n-1];
        for(int i=n-2; i>=0; i--){
            if(arr[i]<temp) {
                arr[i+1] = temp;
                for(int j=0;j<n;j++)
                    System.out.print(arr[j]+" ");
                System.out.println();
            	break;
            }else {
                arr[i+1] = arr[i];
                for(int j=0;j<n;j++)
	                System.out.print(arr[j]+" ");
	            System.out.println();
                if(i==0) {
                    arr[i] = temp;
                    for(int j=0;j<n;j++)
    	                System.out.print(arr[j]+" ");
    	            System.out.println();
                }
	            
            }
        }

    }
	public static void main(String[] args) {
		System.out.println();
		int n = 5;
		int[] arr = {2, 4, 6, 8, 3};
		insertionSort1(n, arr);
	}

}
