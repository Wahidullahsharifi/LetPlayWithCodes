package first_day_Java;

public class SeperatUpandLowerchr {
	
	public static void main(String[] args) {
		
		
		//serprate the Upper Character from lower Character and also print it with count;
		
			String names="Ls Oh a Vr i f Ei";
			//char [] name=names.toCharArray();
			
			String UpperC="";
			String LowerC="";
			int Uppercount=0;
			int Lowercount=0;
			
			for(int i=0;i<names.length();i++) {
				char c=names.charAt(i); 
				
				if(c>=65 && c<=90) {
					UpperC+=c;
					Uppercount++;
				}else {
					LowerC+=c;
					Lowercount++;
				}
			}
			
			System.out.println("the Upper chars are  : "+UpperC + "=" +Uppercount+
					"  and\nlower chars are  : " + LowerC.replaceAll(" ",  "")+ "=" +Lowercount);
	}

}
