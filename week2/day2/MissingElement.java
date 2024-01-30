package week2.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int [] arr= {1,2,6,3,4};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		/*
		 * for(int i=1;i<=arr.length;i++) { if(i!=arr[i-1]) { System.out.println(i);
		 * break; } }
		 */
		Arrays.sort(arr);
		int j=0;
		for(int i=arr[j];i<=arr.length;i++) {
			if(i!=arr[j]) {
				System.out.println(i);
				break;
			}else {
				j++;
			}
		}
		
		
		
	}

}
