package tcs_digital;
import java.util.*;

public class IPLCricketMatch {

	public static void main(String[] args) {
		ArrayList<String> team = new ArrayList<String>();
		ArrayList<String> matches = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		String name = "" ;
		int i, j, len, count=0;
		for(i=0;;) {
			name = sc.nextLine().toUpperCase();
			if(name.equals("Q"))
				break;
			team.add(name);
		}
		len = team.size();
		
		if(len>2 & len<13) {
			for(i=0;i<len-1;i++) {
				for(j=i;j<len-1;j++) {
					matches.add(team.get(i)+"-VS-"+team.get(j+1));
					count += 1;
				}
			}
			System.out.println("TOTAL MATCHES: "+count);
			for(i=0;i<matches.size();i++)
				System.out.println(matches.get(i));
		}else
			System.out.println("INVALID INPUT");
	}

}
