package week4.day2;

import org.openqa.selenium.By;

public class Login extends BaseClass{
	
	public void enterUsername() {
       	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
 
	}
	
	public static void main(String[] args) {
		Login bc = new Login();
		bc.launchBrowser();
		bc.loadURL();
		bc.enterUsername();
	}

}
