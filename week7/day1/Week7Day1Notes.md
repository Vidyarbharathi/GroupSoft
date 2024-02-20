# Framework:
   - Lead Architect (5-7 yrs of exp)
   - Tools - > To automate web application -> Selenium
     Testcase execution -> TestNG
     Design Pattern -> PageObjectModel
     BDD -> Cucumber
     Excel -> ApachePOI
     Automation summary report -> Extent Report

# Interview Questions:
1. Explain about the framework you have used in your project
       - Brief description of the Framework
       - Componenents present inside the framework
       - Hierarchy
       - Execution flow

    a. Brief description of the Framework    
          - Makaia framework -> Selenium -> testng -> ApachePoi -> POM -> extent report
    b. Components
         - design package
             Browser, Element Interfaces
                Browser is to have all the unimplemented methods related to browser activities
                Element is to have all the unimplemented methods related to Element activities
         - selenium.api.base
              SeleniumBase 
                 This is the library of our framework which implements Browser, Element
                 This is also called as Wrapper Class where we have all the wrapper methods
                 This class holds all the reusable methods with proper Exception Handling
         - testng.api.base
              ProjectSpecificMethods
                  This holds all the common methods specific to the project
                     preCondition(), postCondition(),sendData()
         - utils
              This package to have the external resources for the project
                 DataLibrary - to read data from excel
                 Reporter - to generate automation HTML summary report           
         - pages
             pages package will have classes for each pages
         - testcases
               testcases package will have classes for each testcase
               
    c. Hierarchy
        DriverInstance
          Reporter
            SeleniumBase
               ProjectSpecificMethods
                  Pages
                  testcases

    d. Exceution flow:
          @BS     ----------------->   startReport() -> Reporter

            @BT   ------------------>  setValues()   -> Inside each testcase

               @BC  ---------------->  startTestCase() -> Reporter

                  @DP  --------------> fetchData()     -> PSM

                    @BM -------------> preCondition()  -> PSM

                      @Test ---------> runLogin()      -> Inside each testcase

                    @AM     ---------> postCondition() -> PSM

                @AC         ---------> NIL

            @AT             ---------> NIL

         @AS                ----------> endResult()    -> Reporter                          




