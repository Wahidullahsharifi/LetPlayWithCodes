package first_day_Java;

import java.util.Arrays;

public class ArraysMinMax {
	
	public static void main(String[] args) {
		
		 int[] arr = {4, 7, 2, 9, 1, 5}; 

	        // Sort the array in ascending order
	        Arrays.sort(arr);

	        // The minimum element is the first element of the sorted array
	        int min = arr[0];

	        // The maximum element is the last element of the sorted array
	        int max = arr[arr.length - 1];

	        System.out.println("Minimum number: " + min);
	        System.out.println("Maximum number: " + max);
	}

}
