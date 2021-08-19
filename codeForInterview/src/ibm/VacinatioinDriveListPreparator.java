package ibm;

import java.util.regex.Pattern;

public class VacinatioinDriveListPreparator {

	public static void main(String[] args) { //com = comborbidity
		// TODO Auto-generated method stub
		String adhar = "1234 5678 1222", dob = "01/01/1998", com = "yes";
		
		
		
//		System.out.println(Pattern.matches("[0-9]{4}[\\s]{1}[0-9]{4}[\\s]{1}[0-9]{4}", adhar));
//		System.out.println();
		calVacDriveList(adhar, dob, com);

	}
	
	public static void calVacDriveList(String adhar, String dob, String com) {
		if(!Pattern.matches("[0-9]{4}[\\s]{1}[0-9]{4}[\\s]{1}[0-9]{4}", adhar)) {
			System.out.println("Invalid adhar number");
			return;
		}
		if(!Pattern.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}", dob)) {
			System.out.println("Invalid DOB");
			return;
		}
		if(com != "yes" && com!= "no") {
			System.out.println("Invalid input");
			return;
		}
		
		String y = dob.split("/")[2];
		int year = Integer.parseInt(y);
	}

}
