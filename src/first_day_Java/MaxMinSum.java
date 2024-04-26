package first_day_Java;

public class MaxMinSum {
	
	
	
	
	public static void main(String[] args) {
		int [] bbb= {22,33,44,55,77};
		
		int maxnum=reMax(bbb);
		System.out.println(maxnum);
		reMax(bbb);
		
		int [] number = {1,3,44,5};
		int mx=number[0];
		int mn=number[0];
		int sum=0;
		double avg=0;
		
		for(int i=0; i<=number.length-1;i++) {
			sum=sum+number[i];
			if(number[i]>mx) {
				mx=number[i];
			}if(number[i]<mn) {
				mn=number[i];
		}
	
	
	
	}System.out.println(sum);
	System.out.println("max is : " +mx+ " and min is : " + mn);
	System.out.println(sum/bbb.length);
	
	}
	
	public static int  reMax(int []  max) {
		int Max =max[0];
		for(int j=0;j<=max.length-1;j++) {
			if(max[j]>Max) {
				Max=max[j];
			}
			
		}
		return Max;
		
		
	}

}
