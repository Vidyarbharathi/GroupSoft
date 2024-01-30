package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.className("ui-selectonemenu"));

		// Special class to handle the dropdown element

		Select dd = new Select(dropdown);// arg will be the webelement //click on the drpdown

		// 3 methods supports select the value from the dropdown
		dd.selectByIndex(1); // position of the element

		Thread.sleep(2000); // wait statement-->pause the execution for the given time period

		// dd.selectByValue(null); // Value attribute

		dd.selectByVisibleText("Puppeteer"); // using black text

	}

}
