package week3.day4;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);

		List<WebElement> mobileNames = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

		List<WebElement> mobilePrices = driver.findElements(By.className("a-price-whole"));

		// Create a Map with key -> mobileNames and value as mobilePrice
		// Iterate through the mobilenames.size
		// add each entries into the map
		// Print the map in the console

		Map<String, Double> map = new LinkedHashMap<String, Double>();
		for (int i = 0; i < mobileNames.size(); i++) {
			String names = mobileNames.get(i).getText();
			String replaceAll = mobilePrices.get(i).getText().replaceAll(",", "");
			double price = Double.parseDouble(replaceAll);
			map.put(names, price);

		}

		System.out.println(map);

	}
}
