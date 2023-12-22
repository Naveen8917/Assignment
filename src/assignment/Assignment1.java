package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//Open the browser
		WebDriver driver=new ChromeDriver();
		//enter url for flipkart
		driver.get("https://www.flipkart.com/");
		//type iphone 14 in search bar
		driver.findElement(By.name("q")).sendKeys("iphone 14");
		Thread.sleep(2000);
		//find all the auto suggestions and print the count
		List<WebElement> AutoSugg = driver.findElements(By.xpath("//span[contains(text(),'iphone 14')]"));
		int count = AutoSugg.size();
		System.out.println("Count="+count);
		//print the text of auto suggestion
		String text = AutoSugg.get(2).getText();
		System.out.println(text);

	}

}
