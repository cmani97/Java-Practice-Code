package regExpress;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExpress1 {
	public static void main(String args[])
	{
		/*
		Pattern p = Pattern.compile(".an");
		Matcher m = p.matcher("man");
		boolean b = m.matches();
		System.out.println(b);
		*/
		
		boolean b2 = Pattern.compile("..c").matcher("mac").matches();
		System.out.println(b2);
		
		System.out.println("a-z  "+Pattern.matches("[a-z]+", "mani")); //1 or more
		System.out.println("^a-z  "+Pattern.matches("[^a-z]{10}", "mani")); // 10 exactly
		System.out.println("0-9  "+Pattern.matches("[0-9]{2,10}", "12345"));
		System.out.println("a-zA-Z0-9  "+Pattern.matches("[a-zA-Z0-9]", "mani123"));  //only 1
		System.out.println("mani  "+Pattern.matches("[mani]*", "mani"));  //0 or more 
		System.out.println("^a  "+Pattern.matches("[^a]", "mini"));  // only 1
		System.out.println("[MH][ani]  "+Pattern.matches("[MH][x]*[ani]+", "Mxxxxani"));  //  1 or more
		System.out.println("[MH][ani]  "+Pattern.matches("[MH][x]*[ani]*", "Mxxxxani"));  //  1 or more
		System.out.println("[MH][ani]  "+Pattern.matches("[MH][x]?[ani]?", "M"));  //  1 or more
		System.out.println("casino  "+Pattern.matches("[$T][G][$T]*", "TG$"));  //  1 or more

		System.out.println("^a ?  "+Pattern.matches("[^a]+?", "mani"));  // ? means optional
		System.out.println("d  "+Pattern.matches("\\d", "1"));  // only digit
		System.out.println("d+  "+Pattern.matches("\\d+", "1a"));  // only digits
		System.out.println("D  "+Pattern.matches("\\D", "m"));  // except digit
		System.out.println("D+  "+Pattern.matches("\\D+", "m3ni"));  // 

	}
}
