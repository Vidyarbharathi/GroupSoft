package week3.day3;

public class BankAccount {
	
  private long accNumber;
  
  // setter method
  // set the values for the private variable
  //  this -> to differentiate the local variable and the global variable if they have the same name
  //       -> this represents the current class instance
  
    public void setAccNo(long accNumber) {
    	this.accNumber=accNumber;
    	
    }
    
    //getter method -> to read the value of the private variable
    public long getAccNo() {
    	
       return accNumber;		

	}
    
    

  
  public static void main(String[] args) {
	  
	  BankAccount ba = new BankAccount();
	  ba.setAccNo(873847398493l);
	  long accNo = ba.getAccNo();
	  System.out.println(accNo);
	  
	 
  

}
}