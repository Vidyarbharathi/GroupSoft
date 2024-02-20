# Extent Reports:
      - library called aventstack
           <!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
<dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>3.1.5</version>
</dependency>
    - Can attach Screenshot for each steps
    - Can have report based on different author
    - Can have report based on different Category
    - Consolidated dashboard with graphs

# Extent Classes:
   - ExtentHTMLReporter
   - ExtentReport
   - ExtentTest
   - MediaEntityBuilder


@BS                           -----> startReport()
   
   @BT                        -----> setValues()
      
     @BC                      -----> testDetails()

         @DP                 -------> sendData()
           
           @BM               -------> preCondition()

             @Test           -------> runLogin(),runCreateLead()

           @AM               -------> postCondition()
 
       @AC                   -------> Nil

   @AT                       --------> Nil

@AS                          --------> stopReport()


# Questions:
 1. Explain the execution flow of your project
 





