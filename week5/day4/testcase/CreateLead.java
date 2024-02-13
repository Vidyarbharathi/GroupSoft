package week5.day4.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateLead extends BaseClass{
	
	@BeforeTest(alwaysRun = true)
	public void setValues() {
		fileName="CreateLead";

	}
	
	
	@Test(dataProvider = "sendData",groups="smoke")
	public void createLeadTestcase(String cName,String fName, String lName,String pNo) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pNo);
		driver.findElement(By.name("submitButton")).click();
		String actText = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		String expText ="Subraj";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actText, expText);
		//sa.assertAll();
		
	}

}
