package arrays;
import java.util.*;

public class ParkingDilemma {

	private static int carParkingRoof(List<Integer> a, int k) {  //3  // 3  //4
		int min = Integer.MAX_VALUE;
		Collections.sort(a);
		int len = a.size();  // 4 // 4  //4
		for(int i=0;i<len-k+1;i++) { // 6, 2, 7, 12  // 2, 10, 8, 17  // 1, 2, 3, 10 
			int temp = a.get(i+k-1)-a.get(i)+1;
			if(min>temp) min = temp;
		}
		
		return min;   // 6 // 9  // 10
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> arr = new ArrayList<>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
			arr.add(sc.nextInt());
		int k = sc.nextInt();
		int num = carParkingRoof(arr, k);
		System.out.println(num);
	}

}
