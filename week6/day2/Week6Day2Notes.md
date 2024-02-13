### Today's Agenda:
      > 10:30 - 11:00 -> POM with Excel Integration
      > 11:00 - 11:15 -> Workout
      > 11:15 - 12:15 -> POM_Multilingual
      > 12:15 - 12:30 -> Workout


# Steps to implement POM:
   - Create a new Project and have all the required libraries in the pom.xml 
   - Create 4 packages
        base
           - Create a ProjectSpecificMethods and have the preCondition() and postCondition()
           - Declare the driver as static 
        pages
           - Create classes for each page
           - All these classes should extend ProjectSpecificMethods
           - Inside each page create methods for each action
           - If an action stays in the same page then add return this
           - If an action takes you to another page create object for that particular page and return the object
        testcases
           - Create classes for each testcase
           - Create RunLogin class and create a method runLogin and annotate with @Test
           - Each Testclasses should extend ProjectSpecificMethods
           - Inside each class create a method and annotate with @Test
           - Inside the test method create object for the pages and call the required methods
        utils
           - Have ReadExcel class    

# POM with Excel Integration:
   - Create data folder inside the project and have excel sheets inside the data folder 
          Login
          CreateLead
   - Create utils package and have the ReadExcel class inside it
   - In the ProjectSpecificMethods Create sendData() and annotate with @DataProvider
   - Call the readExcel() inside sendData and return the data
   - Create fileName as a global variable in the PSM
   - Create setValues()  to mention the fileName in each testcase and annotate with @BeforeTest 
   - In the @Test() use dataProvider attribute to receive the data 
   - Pass arguments into the @Test() and in each method in pages replace the hardcoded data by passing input    arguments

# POM with Multilingual:
    - Create property files under src/main/resources
         - Right click -> src/main/resources -> Click New -> Click Other -> Double click General
         -> Double Click File -> Give a filename with .properties as the extension
         config.en.properties
         config.fr.properties
         
#language
language = fr


#timeouts
implicitWait  = 20

#credentails
username = DemoCSR2
password = crmsfa

#WelcomePage
welcome = Bienvenue  

#MyHomePage
leadslink = Prospects

#MyLeadsPage
createLeadLink = un prospect



    - Add owner library in pom.xml
         <dependency>
			<groupId>org.aeonbits.owner</groupId>
			<artifactId>owner</artifactId>
			<version>1.0.12</version>
		</dependency>
    - Create config package under src/main/java
           - Create an Interface called ConfigurationManager which should extend Config
           package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config.fr.properties")
public interface ConfigurationManager extends Config{
	
	@Key("implicitWait")
	int getImplicitlyWait();
	
	@Key("username")
	String getUsername();
	
	@Key("password")
	String getPassword();
	
	@Key("welcome")
	String getWelcomeMsg();
	
	@Key("leadslink")
	String getLeadsLink();
	
	@Key("createLeadLink")
	String getCreateLeadLink();

}
    - Create Configuration class and create a static method inside this
    package config;

import org.aeonbits.owner.ConfigCache;

public class Configuration {


	public static ConfigurationManager configuration() {
		return 	ConfigCache.getOrCreate(ConfigurationManager.class);

	}

}
        - Go to each method and call the respective method to get the value from the property file
        int timeOuts = Configuration.configuration().getImplicitlyWait();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOuts));
        driver.findElement(By.id("username")).sendKeys(Configuration.configuration().getUsername());
     
