package ibm;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MaxOccurOfChar {

	public static void main(String[] args) {
		String s = "On scale of 1 to 11"; // web application
		maxOccurOfChar(s);
		
	}
	public static void maxOccurOfChar(String str) {
		TreeMap<Character, Integer> tm = new TreeMap<>();
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(Character.isLetter(c) || Character.isDigit(c)) {
				if(tm.containsKey(c)) {
					tm.replace(c, tm.get(c)+1);
				}else {
					tm.put(c, 1);
				}
			}
		}
		System.out.println(tm);
		Integer max = tm.values().stream().max(Integer::compare).get();
		for(Map.Entry m:tm.entrySet()) {
			if(m.getValue()==max)
				System.out.println(m.getKey());
		}
			
	}

//	Migratory Birds
	public static int migratoryBirds(List<Integer> arr) {
	    
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(int a:arr){
            if(tm.containsKey(a)){
                tm.replace(a, tm.get(a)+1);
            }else{
                tm.put(a, 1);
            }
        }
        Integer max = tm.values().stream().max(Integer::compare).get();
        for(Map.Entry m:tm.entrySet()){
            if(m.getValue()==max){
                return (int)m.getKey();
            }
        }
        return 0;
    }
}
