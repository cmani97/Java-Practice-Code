package tcs_digital;
import java.util.*;

public class PlaceOrder {

	public static void main(String[] args) {
		double prices[] = {80.0, 130.0, 100.0, 80.0, 90.0, 110.0, 120.0, 140.0, 70.0, 80.0};
		int mNum, q, i;
		double total=0;
		String more = "";
		Scanner sc = new Scanner(System.in);
		do {
			mNum = Integer.parseInt(sc.nextLine());
			q = Integer.parseInt(sc.nextLine());
			if(mNum>0 & mNum<11 & q>0 & q<21) {
				total = total+(prices[mNum-1]*q);
			}else {
				System.out.println("INVALID INPUT");
				break;
			}
			more = sc.nextLine();
		}while(more.equals("Y"));
		System.out.println("Total Amount: "+total+" INR");

	}

}
