package tcs;
import java.io.*;
import java.util.*;

public class fitnessExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int oxy[][] = new int[3][3];
		int avg[] = new int[3];;
		int i,j, flag=0, a=0;
		for(i=0;i<3;i++) {
			a=0;
			for(j=0;j<3;j++) {
				oxy[i][j] = sc.nextInt();
				a += oxy[i][j];
				if(oxy[i][j]<1 && oxy[i][j]>100) 
					flag = 1;
			}
			avg[i] = a/3;
		}
		if(flag == 1)
			System.out.println("INVALID INPUT");
		else {
			int max_a = 0;
			for(i=0;i<3;i++) {
				if(max_a<avg[i])
					max_a = avg[i];
			}
			
			if(max_a<70)
				System.out.println("All trainees are unfit");
			else {
				for(i=0;i<3;i++) {
					if(avg[i]==max_a) {
						System.out.println("Trainee Numer:"+(i+1));
					}
				}
			}
		}
	}

}
