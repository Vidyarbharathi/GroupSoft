package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveDuplicates_Amazon {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		
		List<WebElement> allPrices = driver.findElements(By.className("a-price-whole"));
		
		Set<Integer> unique = new TreeSet<>();
 		for (int i = 0; i < allPrices.size(); i++) {
			String text = allPrices.get(i).getText();//44,999
		    String replacedString = text.replaceAll(",", "");//44999
		    //convert String to Integer/Double/Float
		    int actPrice = Integer.parseInt(replacedString);
		    unique.add(actPrice);
		}
 		System.out.println(unique);
 		//convert list to Set to use get()
 		List<Integer> list = new ArrayList<>(unique);
 		System.out.println(list.get(0));
	}
		
}
