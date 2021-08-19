package tcs_digital;
import java.util.*;

public class TravelAgency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total[] = {0,0,0,0,0};
		int votes[][] = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
		String cities[] = {"Malaysia","Australia","Germany","Dubai","France"};
		int i, j, flag=0, max = 0, temp;
		boolean b=false; 
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				temp = sc.nextInt();
				votes[i][j] = temp;
				if(temp<1 && temp>5)
					b = true;
			}
		}
		if(!b) {
			for(i=0; i<5; i++)
			 {
				 for(j=0; j<5; j++)
				 {
					 if(votes[i][j]==1)
					 {
						 total[j] = total[j] + 1;
					 }
				 }
			 }
			 for(i=0; i<5; i++)
			 {
				 if(total[i]>max)
				 {
					 max = total[i];
				 }
			 }
			 for(i=0; i<5; i++)
			 {
				 if(total[i]==max)
				 {
					 System.out.println(cities[i]);
				 }
			 }

		}else
			System.out.println("INVALD INPUT");
	}

}
