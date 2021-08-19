package tcs;
import java.util.*;

public class BuyingTV {

	public static void main(String[] args) {
		int prices[] = {10000, 7000, 6000};
		int priceN, exchange, working, price, total;
		Scanner sc = new Scanner(System.in);
		priceN = sc.nextInt();
		exchange = sc.nextInt();
		working = sc.nextInt();
		if(priceN>0 & priceN<4) {
			price = prices[priceN-1];
			if(exchange == 1) {
				if(working==1) {
					total = price-(price*20/100);
					System.out.println(total+" INR");
				}else if(working == 2) {
					total = price-(price*2/100);
					System.out.println(total+" INR");
				}else
					System.out.println("INVALID INPUT");
			}else if(exchange == 2) {
				System.out.println(price+" INR");
			}else
				System.out.println("INVALID INPUT");				
		}
		else
			System.out.println("INVALID INPUT");
	}

}
