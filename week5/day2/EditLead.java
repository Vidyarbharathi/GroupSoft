package testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditLead  extends ProjectSpecificMethod{
	
	@Test(dependsOnMethods = "testng.CreateLead.createLead")
	public void editLead() {
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
	}

}
