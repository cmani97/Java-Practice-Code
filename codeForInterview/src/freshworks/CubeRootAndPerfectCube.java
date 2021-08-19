package freshworks;

public class CubeRootAndPerfectCube {

	
	public static void main(String[] args) {
		int n = 27;
		
		System.out.println("Cube root of "+n+" is = "+cubeRoot(n));
		System.out.println("perfect cube of "+n+" is = "+perfectCube(n));
		System.out.println("min count is = "+minimumMoves("00100", 2));
		
	}
	public static int minimumMoves(String s, int d) {
        int count = 0;
        int i=0, j;
        while(i<=s.length()-d){
            int flag = 0;
            for(j=i;j<i+d;j++){
                if(s.charAt(j)=='1')
                    flag++;
            }
            if(flag<=0)
                count++;
            i++;   
        }
        return count;
    }
	static double cubeRoot(int n) {
		double start = 0, end = n, e = 0.0000001;
		
		while(true) {
			double mid = (start+end)/2;
			double diff;
			if(n>(mid*mid*mid))
				diff = (n-(mid*mid*mid));
			else
				diff = ((mid*mid*mid)-n);
			
			if(diff<=e)
				return mid;
			
			if((mid*mid*mid)>n)
				end = mid;
			else
				start = mid;
		}
	}
	
	static int perfectCube(int n) {
		for(int i=0;i<=n;i++) {
			if(i*i*i==n)
				return i;
			else if(i*i*i>n)
				return -1;
		}
		return -1;
	}
}
