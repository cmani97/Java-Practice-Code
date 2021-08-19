package tcs;

public class CodeCheck {

	public static void main(String[] args){
//		int a[] = {1,2};
//		System.out.println("Hello ");
//		System.out.println("User");
//		System.out.println(a[1]);
//		float b = (float) 2.0;
//		System.out.printf("%.2f\n", (float)a[1]);
//		System.out.printf("%.2f\n", (float)0);
//		System.out.printf("\n%s", a[1]);
		
//		int $ = 5;
		int i,j, x=0;
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				x=(i+j-1);
				System.out.print(x);
				break;
			}
			
		}
		System.out.print(x);
	}

}
