package first_day_Java;

public class CountOfVowels {
	public static void main(String[] args) {
		
	
	
<<<<<<< HEAD
	String word="FaridKhan Sharifi iaabbiee";
=======
	String word="FaridSharifiiaabbiee";
>>>>>>> cddd05357f40828bcec1c65300e0decd3f22e856
	
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
