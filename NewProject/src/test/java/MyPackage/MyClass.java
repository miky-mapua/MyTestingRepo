package MyPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class MyClass {
	
	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mshamsaee\\eclipse-workspace\\chromedriver.exe");
		WebDriver driverChrome = new ChromeDriver();
		//WebDriver driverIE = new InternetExplorerDriver();
		
		//String googleURL = "http://google.com";
		String googleURL = "http://newtours.demoaut.com/mercurywelcome.php";
		driverChrome.get(googleURL);
		//driverIE.get(googleURL);
		
		//WebElement search = driverChrome.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
		//search.sendKeys("LinkedIn");
		
		Thread.sleep(5000);
		
		//Click search button using xpath
		/*WebElement searchButton = driverChrome.findElement(By.xpath("//input[@value='Google Search']"));
		searchButton.click();*/
		
		WebElement userName = driverChrome.findElement(By.xpath("//input[@name='userName']"));
		userName.sendKeys("miky");
		
		WebElement password = driverChrome.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("miky12345");
		
		
		
		Actions act = new Actions(driverChrome);
		//Action.MoveToElement
		act.keyDown(Keys.ENTER).build().perform();
		
		
		//To press ENTER key using keyboard rather than webelement
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(200);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}