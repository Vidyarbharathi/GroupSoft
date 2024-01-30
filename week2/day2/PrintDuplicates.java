package week2.day2;

public class PrintDuplicates {

	public static void main(String[] args) {
	  
		
		int[] array={12,14,15,14,12,17,15};
		
	
		/*
		 * for(int i=0;i<array.length;i++) { for(int j=i+1;j<array.length;j++) {
		 * if(array[i]==array[j]) { System.out.println(array[i]); } } }
		 */
		
		for(int i=0;i<array.length-1;i++) {
			if(array[i]==array[i+1]) {
				System.out.println(array[i]);
				
			}
		}
		
		
		
		
	}

}
