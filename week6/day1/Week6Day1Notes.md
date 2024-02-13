# Today's Agenda:
     10:30 - 11:00 -> POM Introduction
     11:00 - 12:00 -> Sequential Execution
     12:00 - 12:30 -> Activity

# Page Object Model:
    pom.xml -> pom-> project object model

# POM -> Page Object Model
     - Design Pattern
     - Best practices to code

# Page Navigation:
   - LoginPage
       enterUsername
       enterPassword
       clickLoginButton
   - WelcomePage
       clickCRMSFALink
   - MyHomePage
       clickLeadsLink
   - MyLeadsPage
       clickCreateLeadLink
       clickFindLeadsLink 
       clickMergeLeadsLink
   - CreatLeadPage
       enterCompanyName
       enterFirstName
       enterLastName
       clickCreateLeadButton
   - ViewLeadPage
       verifyLeads
       clickEditButton
       clickDeleteButton
       clickDuplicateLeadButton                    


# Steps to implement POM:
   - Create a new Project and have all the required libraries in the pom.xml 
   - Create 3 packages
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


For sequential execution wth POM _TestNG:
   driver - > static
For Parallel Execution:
   driver -> should not be static   
   Create parameterized Constructor in each classes     
   Pass the driver in each constructor      


