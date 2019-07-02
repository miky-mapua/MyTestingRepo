package MyPackage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class GoogleTest {
	
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mshamsaee\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		WebElement searchField = driver.findElement(By.xpath("(//input[contains(text(),'')])[3]"));
		searchField.sendKeys("Facebook");
		searchField.sendKeys(Keys.ENTER);
		
		assertEquals(driver.getTitle().contains("Facebook"), false);
		
		driver.close();
	}
	
}
