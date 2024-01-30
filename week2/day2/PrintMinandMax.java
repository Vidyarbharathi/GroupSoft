package week2.day2;

import java.util.Arrays;

import week1.day2.LearnMethods;

public class PrintMinandMax {

	public static void main(String[] args) {
		
		LearnMethods m=new LearnMethods();

		int[] scores = { 89, 78, 46, 90, 100 };
		// 46,78,89,90,100
		int max = 0;
		int min = 0;
		// iterate into array
		// score[0] > score[1]
		// max=score[0]
		// min =score[1]
		/*
		 * for(int i=0;i<scores.length;i++) {
		 *  for(int j=i+1;j<scores.length;j++)
		 * if(scores[i]>scores[j]) { 
		 * max=scores[i]; } else if(scores[i]<scores[j]) {
		 * min=scores[i]; } }
		 */

		Arrays.sort(scores);

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

		System.out.println("The Min value from scores array is  " + scores[0]);
		System.out.println("The Max value from scores array is  " + scores[scores.length - 1]);

		// find duplicates from the array
		// int[] array={12,14,15,14,12,17,15};

	}

}
