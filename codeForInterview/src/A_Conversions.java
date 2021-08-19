import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_Conversions {

	public static void main(String[] args) {
//		convertArrayToListVV();
		convertIntToAllTypes();
//		convertStringToAllTypes();
		
	}
	
	static void convertArrayToListVV() {
		int[] arr = {5, 8, 12, 45, 1, 71, 23};
		
//		converting array to ArrayList
		List<int[]> l = Arrays.asList(arr);
		
//		l.add(1, new int[] {2,54, 3});  -> this generate java.lang.UnsupportedOperationException;
//		System.out.println(l);
		
		List<int[]> al = new ArrayList<>(l);
		al.add(0, new int[] {2,54, 3});
		System.out.println(al);
		
		Integer a[] = new Integer[] { 10, 20, 30, 40 };
        List<Integer> list = Arrays.asList(a);
        System.out.println("The list is: " + list);
        
        
		String str[] = { "Apple", "Banana" };
		List<String> lit = Arrays.asList(str);
		List<String> sl = new ArrayList<>(lit);
		sl.add("Mango");
		System.out.println(sl);
		
		
//		converting List to array
		List<int[]> la = new ArrayList<>();
		la.add(new int[]{2, 3});
		la.add(new int[]{6, 8});
		la.add(new int[]{9, 6});
		int[][] la2 = la.toArray(new int[la.size()][]);
		for(int i=0;i<la2.length;i++) {
			for(int j=0;j<la2[0].length;j++)
				System.out.printf("%d ", la2[i][j]);
			System.out.printf("\n");
		}
		
	}

	static void convertIntToAllTypes() {
		int num = 100; // 65=A, 97=a
		
		System.out.printf("int to string is = %s\n", Integer.toString(num));
		System.out.printf("int to string is = %s\n", String.valueOf(num));
		System.out.printf("int to string is = %s\n", String.format("%d",num));
		System.out.printf("int to char is = %c\n", (char)num);
		System.out.printf("int to char is = %c\n", (char)(num+'0'));
		System.out.printf("int to float is = %f\n", (float)num);
		System.out.println("int to long is = " +Long.valueOf(num));
		System.out.println("int to double is = " +Double.valueOf(num));
	
	
		String temp = "12345";
		int[] newGuess = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		    newGuess[i] = temp.charAt(i) - '0';
		for(int i:newGuess)
			System.out.println(i);
	}
	
	static void convertStringToAllTypes() {
		String s1 = "Manisha";
		String s2 = "10";
		System.out.printf("string to int is = %i", Integer.parseInt(s2));
	}
}
