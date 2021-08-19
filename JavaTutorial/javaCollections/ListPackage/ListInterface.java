package ListPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListInterface {

	public static void main(String[] args) {
		 List<String> fruitList = new ArrayList<>();    
		 fruitList.add("Mango");    
		 fruitList.add("Banana");    
		 fruitList.add("Apple");    
		 fruitList.add("Strawberry");  
		 Collections.sort(fruitList);
		 System.out.println("Printing List1: "+fruitList);  
		 
		 //Converting ArrayList to Array  
		 String[] array = fruitList.toArray(new String[fruitList.size()]);    
		 System.out.println("Printing Array1: "+Arrays.toString(array));  
		 System.out.println("Printing List2: "+fruitList);  
		 
		 System.out.println("Returning element: "+fruitList.get(1));//it will return the 2nd element, because index starts from 0  
		 //changing the element  
		 fruitList.set(1,"Dates"); 
		 System.out.println("Printing List: "+fruitList);
		 
		 Collections.sort(fruitList);  
		   //Traversing list through the for-each loop  
		  for(String fruit:fruitList)  
			  System.out.println(fruit); 
		  ListIterator<String> itr=fruitList.listIterator();    
	      System.out.println("Traversing elements in forward direction");    
	      while(itr.hasNext()){    
	    	  System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
	      }
	      
	      List<List<Integer>> arr = new ArrayList<>();
	      List<Integer>  l1 = new ArrayList<>();
	      l1.add(1);l1.add(2);l1.add(3);
	      List<Integer>  l2 = new ArrayList<>();
	      l2.add(1);l2.add(2);l2.add(3);
	      List<Integer>  l3 = new ArrayList<>();
	      l3.add(1);l3.add(2);l3.add(6);
	      arr.add(l1);arr.add(l2);arr.add(l3);
	      System.out.println(diagonalDifference(arr));
		 
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
        int len = arr.size();
        int left=0, right=0;
        for(int i=0;i<len;i++){
            left += arr.get(i).get(i);
        }
//        System.out.println(left);
        int j =0;
        for(int i=len-1;i>=0;i--){
            right += arr.get(j).get(i);
            j++;
        }
//        System.out.println(right);
        
        return Math.abs(left-right);
    }
}
