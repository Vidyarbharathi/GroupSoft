package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLeadAtt {
	
	//@Test(invocationCount = 3,threadPoolSize = 2)
	
	//@Test(invocationCount = 3,invocationTimeOut = 5000)
	
	@Test
	public void createLead() {
	 ChromeDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SF")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dilip");

	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
	driver.findElement(By.className("smallSubmit")).click();

	driver.close();


}
}
