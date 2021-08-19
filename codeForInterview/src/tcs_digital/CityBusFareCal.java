package tcs_digital;

import java.util.Scanner;

public class CityBusFareCal {

	public static void main(String[] args) {
		int Path[] =  {800, 600, 750, 900, 1400, 1200, 1100, 1500};
		String Source, Destination;
		String BusStops[] = {"TH", "GA", "IC", "HA", "TE","LU","NI","CA"};
		float fare=0;
		Scanner sc = new Scanner(System.in);
		Source = sc.nextLine().toUpperCase();
		Destination = sc.nextLine().toUpperCase();
		if(Source != Destination) {			
			for(int i=0;i<Path.length;i++) {
				if(Source.equals(BusStops[i])) {
					for(int j=i; j<Path.length;j++) {
						if(BusStops[j].equals(Destination))
							break;
						fare += Path[j];
						if(j==7) {
							j = -1;
						}
					}
					break;
				}
			}
			System.out.println(Math.floor(fare*0.005)+" INR");
		}else
			System.out.println("");
		
	}

}
