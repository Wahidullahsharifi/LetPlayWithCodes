package first_day_Java;

import java.util.HashMap;


public class FindTheDublicatInString {
	
	public static void main(String[] args) {	
		
		findDuplicate("i i i love to love to see Afghanistan see Afghanistan");
		findDuplicate("i,i,i,k,k,k,want,to,want");
		
	}
	
	
	    public static void findDuplicate(String input) {
	        String[] words = input.split(",");
	        HashMap<String, Integer> chr = new HashMap<>();

	        for (String c : words) {
	            Integer freq = chr.get(c);
	            if (freq == null) {
	                freq = 0;
	            }
	            chr.put(c, freq + 1); 
}
	        System.out.println(chr);
	        	    } 
}

