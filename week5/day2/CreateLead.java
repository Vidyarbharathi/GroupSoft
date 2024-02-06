package testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod{

	@Test
	public void createLead() {
		
		driver.findElement(By.xpath("//a[text()='Lead']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dilip");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.className("smallSubmit")).click();

	
	}
}
