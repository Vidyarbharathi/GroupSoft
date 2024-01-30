package week2.day2;

public class LearnArray {

	public static void main(String[] args) {
		
		//Declaration of array
		//1.Literal declaration
		//datatype[] variablename={values};
		//datatype varaiblename[]={values};
		
		//2.Using object
		//datatype[] variablename=new datatype[size];
		//new keyword always creates a new memory 
		
		//Array -collection of item of samedatatype- non primitive datatype -->class in java
		//Size of array will fixed
		//size -->count of elements
		
		
		int[] scores= {89,78,46,90,100};
		String[] names= {"Deepali","Triveni","Vidhi"};
		
		
		int length = scores.length;//to get the count of elements in the array;		
		System.out.println(length);
		
		//accessing the elements are based on the position of the element in the array
		
		System.out.println(scores);// print the memory location of the array
		//to get a particular value from the array
		
		//use position of the element to retreive it
		
		System.out.println(scores[2]);
		
		//to access last element
		System.out.println(scores[length-1]);
		
		
		for(int i=0;i<length;i++) {
			System.out.println(scores[i]);
		}
		
		
		for(int i=length-1;i>=0;i--) {
			System.out.println(scores[i]);
		}
		
		
		int[] arr=new int[3];
		arr[0]=1;
		arr[1]=4;
		arr[2]=8;
	//	arr[3]=9;
			

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}

}
