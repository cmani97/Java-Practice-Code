package tcs_digital;
import java.util.*;

public class PurchaseItems {

	public static void main(String[] args) {
		int prices[] = {50, 100, 40, 200, 300};
		int i, j, s=0;
		float total=0;
		Scanner sc = new Scanner(System.in);
		String in,q;
		char member;
		in = sc.nextLine();
		q = sc.nextLine();
		member = sc.nextLine().charAt(0);
		String IN[] = in.split(" ");
		String Q[] = q.split(" ");
		try {
			for(i=0;i<IN.length;i++) {
				for(j=0;j<prices.length;j++) {
					s = Integer.parseInt(IN[i]);
					if(s == j+1) {
						total += prices[j]*Integer.parseInt(Q[i]);
					}
				}
			}
			if(total>=1000) {
				if(member == 'Y') {
					total = total - (total*15/100);
					System.out.print(total+" INR");
				}else{
					total = total - (total*10/100);
					System.out.print(total+" INR");
				}
			}else if(total<1000) {
				System.out.print(total+" INR");
			}
		}catch(Exception e) {
			System.out.println("INVALID INPUT");
		}
		
		
		
		
		
	}

}
