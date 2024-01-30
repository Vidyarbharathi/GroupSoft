package week2.day1;

public class PallindromeNumber {

	public static void main(String[] args) {
		
		int input=12121;
		int temp,rem;
		
		int org=input;
		
		//given number is a pallindrome
		//123 ==321 -->not a pallindrome
		//121 == 121 -->pallindrome
		
		//123  -->3 -->first position -->123/10 -->12
		//123%10 -->3 
		//temp-->3
		//12 -->2 -->second position
		//temp =32
		//1 -->next postion
		//temp=321;
		
		
		for(temp=0;org>0;org=org/10) {
			
			rem=org%10;//rem=3
			temp=(temp*10)+rem; //(0*10)+3 -->temp=3
			
		}
		
		//first iteration -->123>0 -->r=3 -->temp=3 -->123/10 -->org=12
		//seconditeration  -->temp=3 ;12>0 -->rem=2 -->temp = (3*10)+2 --->32 -->org =1
		//thrid iteration -->temp=32 ;1>0 -->rem=1 -->temp(32*10)+1 -->321 -->
		
		
		if(temp==input) {
			System.out.println("The given number is pallindrome");
		}
		else {
			System.out.println("The given number is not a pallindrome");
		}
		
		
		
		//temp=0;
		//while(org>0){
	//	rem=org%10;//rem=3
	//	temp=(temp*10)+rem; 
		//org=org/10;
	//}
		

	}

}
