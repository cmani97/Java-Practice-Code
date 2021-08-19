package tcs;
import java.util.*;

public class RemoveDuplicate {
	public  int removeDuplicates(int arr[], int n) {
		if(n==0||n==1)
			return n;
		int temp[] = new int[n];
		int r = 0;
		for(int i=0;i<n;i++) {
			int num = arr[i];
			int flag = 0;
			for(int j=0;j<=r;j++) {
				if(arr[i]==temp[j])
					flag = 1;
			}
			if(flag==0) {
				temp[r]=arr[i];
				r += 1;
			}
				
		}
		for (int i=0; i<r; i++) {
			arr[i] = temp[i];
//			System.out.println(arr[i]);
		}
		return r;
	}
	public static void main(String[] args) {
		RemoveDuplicate rd = new RemoveDuplicate();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		int n = rd.removeDuplicates(arr, size);
		System.out.println("n = "+n);
		for (int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
// another method is
		HashSet<Integer> unique =new HashSet<Integer>();
		for(int i=0;i<size;i++)
			unique.add(arr[i]);
		Iterator irt = unique.iterator();
		while(irt.hasNext())
			System.out.print(irt.next()+" ");
	}

}
