package arrays;
import java.util.*;

public class RovelControl {

	private static int roverMove(int n, String[] moves) {
		int i=0, j=0;
		for(int k=0;k<moves.length;k++) {
			String temp = moves[k];
			if(temp.equals("UP") && i>0)
				i--;
			else if(temp.equals("RIGHT") && j<n-1)
				j++;
			else if(temp.equals("LEFT") && j>0)
				j--;
			else if(temp.equals("DOWN") && i<n-1)
				i++;
		}
		return (i*n)+j;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n = ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("enter m = ");
		int m = Integer.parseInt(sc.nextLine());
		String[] arr = new String[m]; //{"RIGHT", "UP", "DOWN","LEFT","DOWN", "DOWN"};
		for(int i=0;i<m;i++) {
			System.out.println("enter arr["+i+"] = ");
			arr[i] = sc.nextLine();
		}
		System.out.println(roverMove(n, arr));
	}

}
