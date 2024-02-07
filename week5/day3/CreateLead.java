package week5;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod{

	@DataProvider(name="getData")
	public String[][] setData(){
		String[][] data=new String[2][3];
		
		data[0][0]="TestLeaf";
		data[0][1]="Dilip";
		data[0][2]="Kumar";
		
		data[1][0]="TestLeaf";
		data[1][1]="Subraja";
		data[1][2]="S";
		
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void createLead(String comName,String fName,String lName) {
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comName);
	
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.className("smallSubmit")).click();

	
	}
}
