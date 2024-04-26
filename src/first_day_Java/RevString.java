package first_day_Java;

public class RevString {
	
	

	public static void main(String[] args) {
		
		
		RevString("wahidullah sharifi");
		RevString("Omer");
		RevString("Nabjiullah");
		

		int number =  120;
        double descount= 33.3;
        boolean maritalStutes= true;
        char  CharterName='c';

        String  name= "My name is Najbullah";
        
        System.out.println(name);
		
		
	}
	
	
	
	
	public static void RevString(String name) {
		
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev+=name.charAt(i);
//			System.out.println();
			
		}System.out.println(rev);
	}
	

}
