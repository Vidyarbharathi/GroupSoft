package week3.day4;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] nums = {2,5,4,2,7,6,7,5,3};
		
		//Output=[2,5,4,7,6,3] //  Insertion order -> LinkedHashSet
		//Output=[2,3,4,5,6,7] //  Sorted order    -> TreeSet
		
		Set<Integer> unique = new HashSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			unique.add(nums[i]);//nums[1]=5
		}
		System.out.println(unique);
		
		
	}

}
