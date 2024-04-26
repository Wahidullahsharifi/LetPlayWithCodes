package first_day_Java;

import java.util.HashMap;

public class CountOfWords {
	
	public static void main(String[] args) {
		
	
	
	String name="AAAaaaaa BBBEEECCC";
	String kk=name.replaceAll(" " , "");
	char [] k=kk.toCharArray();
	
	
	
	HashMap<Character, Integer> chr= new HashMap<>();
	
	for(char c: k) {
		if(chr.containsKey(c)) {
			chr.put(c, chr.get(c)+1);
		}else
			chr.put(c, 1);
	}
	System.out.println(chr);

}}
