# Today's Agenda:
     > 10:30 - 11:00 -> POM _ ThreadLocal
     > 11:00 - 12:00 -> Exception Handling
     > 12:00 - 12:30 -> Extent report


# POM with ThreadLocal:
=======================
   POM _ TestNG
    - To support Sequential and parallel execution Constructor should be created
   ThreadLocal 
    -  Java Class  

# Steps:          
   - private static final ThreadLocal<ChromeDriver> cDriver = new ThreadLocal<ChromeDriver>();
   private:
     - The variable can be accessed only within the class
   static+final
    - Constant - Cannot change the variable value
   ThreadLocal 
     - Java Class for Thread safety
   <ChromeDriver>
     - The type of driver to access
    cDriver
     - variable

  - To access the private variable 
    getter and setter methods
    
    Sets the current thread's copy of this thread-local variableto the specified value.
  - public void setDriver() {
		cDriver.set(new ChromeDriver());

	}	

    Returns the value in the current thread's copy of thisthread-local variable
	public ChromeDriver getDriver() {
		return  cDriver.get();
	}
# Exception:
    - Abnormal behaviour which disrupts the program execution
    - Compile Time Exception / Checked exception
    - RunTime Exception / UnChecked Exceptions
        NoSuchElementException
        StaleElementReferenceException
        NoSuchWindowException
        NoAlertPresentException
        TimeOutException
        ElementNotInteractableException
        ArrayOutOfBoundsException
    

# Exception Handling:
    - Apply try/catch block
    - catch block will be executed only when there is an exception
    - We cannot have try block alone
    - We cannot have catch block alone
    - All Exceptions are classes
    - Exception is the super class of all Exceptions
    - RunTimeException -> Exception -> Throwable
    - Finally block will execute irrespective of the exceptions
    - try should be followed with either finally/catch/ catch & finally


  try       try       try
  catch     catch          try
            catch          catch
            catch     catch

# throw
# throws            
    



