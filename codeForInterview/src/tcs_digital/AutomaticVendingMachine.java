package tcs_digital;

import java.util.*;

public class AutomaticVendingMachine {

	public static void main(String[] args) {
		String coffe[] = {"Espresso Coffee","Cappuccino Coffee","Latte Coffee"};
		String tea[] = {"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};
		String soups[] = {"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};
		String beverage[] = {"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};
		Scanner sc = new Scanner(System.in); 
		String mm;
		int sm, i;
		mm = sc.nextLine().toLowerCase();
		sm = sc.nextInt();
		System.out.println("Welcome to CCD!");
		if(mm.equals("c")) {
			for(i=0;i<coffe.length;i++) {
				if(i == sm-1) {
					System.out.println("Enjoy your "+coffe[i]);
					break;
				}
			}
		}else if(mm.equals("t")) {
			for(i=0;i<tea.length;i++) {
				if(i == sm-1) {
					System.out.println("Enjoy your "+tea[i]);
					break;
				}
			}
		}else if(mm.equals("s")) {
			for(i=0;i<soups.length;i++) {
				if(i == sm-1) {
					System.out.println("Enjoy your "+soups[i]);
					break;
				}
			}
		}else if(mm.equals("b")) {
			for(i=0;i<beverage.length;i++) {
				if(i == sm-1) {
					System.out.println("Enjoy your "+beverage[i]);
					break;
				}
			}
		}
		else
			System.out.println("INVALID OPTION!");
		
		
	}

}
