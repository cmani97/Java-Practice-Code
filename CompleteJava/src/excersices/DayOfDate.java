package excersices;

import java.util.Scanner;

public class DayOfDate {
	public static void main(String agrs[])
	{
		System.out.println("Enter date:");
		Scanner sc = new Scanner(System.in);
		int date, month, year,flag = 0,s = 0;
		date = sc.nextInt();
		month = sc.nextInt();
		year = sc.nextInt();
		//System.out.println(date+","+month+","+year);
		
		int[] month_days = {31,28,31,30,31,30,31,30,31,30,31};
		if(year%4==0)
		{
			flag = 1;
			month_days[1] = 29;
		}
		for(int i=0;i<month-1;i++)
			s += month_days[i];
		System.out.println(s);
		s += date;
		s += year;
		System.out.println(s);
		//int current_month = month_days[month-1];
		s %= 7;
		
		System.out.println(s);
		
	}
}
