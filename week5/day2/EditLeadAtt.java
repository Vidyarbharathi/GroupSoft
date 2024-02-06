package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLeadAtt {
	
	@Test(dependsOnMethods ="testng.CreateLeadAtt.createLead")
	public void editLead() {
	 ChromeDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();


	driver.close();


}
}
