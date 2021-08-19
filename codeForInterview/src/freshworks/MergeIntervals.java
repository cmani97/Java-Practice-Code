package freshworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
		int arr[][] = { {6,8}, {1,9}, {2,4}, {4,7} }; //{{1, 3},{2, 6},{8, 10},{15, 18}}; // {{1, 4},{4, 5}};  //{ {6,8}, {1,9}, {2,4}, {4,7} };
		int a[][] = merge(arr);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++)
				System.out.printf("%d ", a[i][j]);
			System.out.printf("\n");
		}
	}

	public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b)->Integer.compare(a[0], b[0]));
        
//        for(int i=0;i<intervals.length;i++) {
//			for(int j=0;j<intervals[0].length;j++)
//				System.out.printf("%d ", intervals[i][j]);
//			System.out.printf("\n");
//		}
        
        int r = intervals.length;
        List<int[]> list = new ArrayList<int[]>();
        int i, max, min;
        min = intervals[0][0];
        max = intervals[0][1];
        for(i=1;i<r;i++){
            if(max>=intervals[i][0] ){
                max = Math.max(max, intervals[i][1]);
            }
            else{
                list.add(new int[]{min, max});
                min = intervals[i][0];
                max = intervals[i][1];
            }
        }
        list.add(new int[]{min, max});
        return list.toArray(new int[list.size()][]);
    }
}
