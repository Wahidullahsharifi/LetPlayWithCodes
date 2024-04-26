package first_day_Java;

public class CountOfVowels {
	public static void main(String[] args) {
		
	
	
	String word="Faridiaabbiee";
	
	char [] c=word.toCharArray();
	
	
	int count=0;
	for(char d: c) {
		if( (d=='a' || d=='A') || (d=='e' || d=='E')  || (d=='i' || d=='I') 
		|| (d=='o' || d=='O') || (d=='u' || d=='U')){
			count++;
		}
		
	}System.out.println(count);
	
	

} 
}