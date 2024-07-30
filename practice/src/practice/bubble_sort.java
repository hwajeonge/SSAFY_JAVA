package practice;

import java.util.Arrays;

public class bubble_sort {
	public static void main(String[] args) {
		int[] arr = {5,2,9,1,5,6};
		
		for(int i = arr.length-1; i>0; i--) {
			for(int j = 0; j<i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
