package ibm;

import java.util.Arrays;

public class RevindCharExceptFirLastofIndWord {

	public static void main(String[] args) {
		String str = "this is the first program reversal";
		
		System.out.println(revString(str));
	}

	public static String revString(String str) {
		String arr[] = str.split(" ");
		String result = "";
		for(int i=0;i<arr.length;i++) {
			String s = arr[i];
			String rev = "";
			if(s.length()>2) {
				rev += s.substring(0,1);
				for(int j=s.length()-2;j>0;j--) {
					rev += s.substring(j,j+1);
				}
				rev += s.substring(s.length()-1, s.length());
			}else {
				rev = s;
			}
			arr[i] = rev;
			result += rev;
			if(i<arr.length-1)
				result += " ";
		}
		System.out.println(Arrays.toString(arr));
//		or
		System.out.println(String.join(" ", arr));
//		or
		return result;
	}
}
