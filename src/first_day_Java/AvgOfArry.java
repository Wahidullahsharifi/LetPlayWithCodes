package first_day_Java;

public class AvgOfArry {
	
	public static void main(String[] args) {
		
	

	int [] number = {1,3,44,5};
	int mx=number[0];
	int mn=number[0];
	double sum=0;
	double avg=0;
	
	for(int i=0; i<=number.length-1;i++) {
		sum=sum+number[i];
		if(number[i]>mx) {
			mx=number[i];
		}if(number[i]<mn) {
			mn=number[i];
	}
	}
	System.out.println(mx);
	System.out.println(mn);
	System.out.println(sum);
	System.out.println(sum/number.length);
	}}
