package searchingAlgorithms;

public class BinarySearch {

	
//	public static void main(String args[])
//	{
//		int[] arr= {5,9,22,33,54,65,72,99};
//		int li=0;
//		int hi=arr.length-1;
//		int mi=(li+hi)/2;
//		int item=55;
//		while(li<=hi)
//		{
//			if(arr[mi]==item)
//			{
//				System.out.println("element is found at "+mi+" index position");
//				break;
//			}
//			else if(arr[mi]<item)
//			{
//				li=li+1;
//			}
//			else
//			{
//				hi=hi-1;
//			}
//			mi=(li+hi)/2;
//		}
//		if(li>hi)
//		{
//			System.out.println("Element is not found");
//		}
//	}
	public static void main(String args[]) {
		int[] arr= new int[100];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+",");
		}
		System.out.print("\n");
		int li=0;
		int hi=arr.length-1;
		int mi=(li+hi)/2;
		int item=9;
		int guess = 1;
		while(true) {
			if(arr[mi] == item) {
				System.out.println("item found at position "+(mi+1));
				System.out.print("\n no of guesses are "+guess);
				break;
			} else {
				if(item > arr[mi]) {
					li = mi;
					mi = (li+hi)/2;
					System.out.println("too low ");
					guess += 1;
				}else {
					hi = mi;
					mi = (li+hi)/2;
					System.out.println("too high ");
					guess += 1;
				}
			}
			if(li> hi) {
				System.out.print("item not found");
				break;
			}
		}
	}
	
}
