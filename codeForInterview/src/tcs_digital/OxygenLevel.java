package tcs_digital;

import java.util.Scanner;

public class OxygenLevel {

	public static void main(String[] args) {
		int a[] = {0, 0, 0};
		Scanner sc = new Scanner(System.in);
		
		int temp, count=0;
		boolean b=false;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				temp = sc.nextInt();
				if(temp>0 & temp<=100) {
					a[j] += temp;
				}else {
					a[j] += temp;
					b = true;
				}
			}
		}
		if(b == true) {
			System.out.println("INVALD INPUT");
		}else {
			int max = 0;
			for(int i=0;i<3;i++) {
				a[i] = a[i]/3;
				if(max<a[i])
					max = a[i];
			}
			if(max<70) {
				System.out.println("All trainees are unfit");
			}
			else {
				for(int i=0;i<3;i++) {
					if(a[i]>=max)
						System.out.println("Trinee Number: "+ (i+1));
				}
			}
		}
		

	}

}
