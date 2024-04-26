package first_day_Java;

import java.util.HashMap;

public class FindTheSecondLastString {
	
	
	public static void main(String[] args) {
		
		String name="My is name is Wahidullah Sharifi";
		
		int a=name.indexOf("My is name");
		
		int b=name.indexOf("is Wahidullah");
		
		
		String rev="";
		String secName=name.substring(a, b-1);
		System.out.println(secName);
		
		for(int i=secName.length()-1;i>=0;i--) {
			rev+=secName.charAt(i);
		}
		System.out.println(rev);
		
		
		char []kt=name.toCharArray();
		
		HashMap<Character, Integer> chr= new HashMap<>();
		
		for(char c: kt) {
			
			if(chr.containsKey(c)) {
				chr.put(c,  chr.get(c)+1);
				
				
			}else
				chr.put(c, 1);
		}System.out.println(chr);
		
		
		
		
	}

}
