package MyPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import context.googleContext;
import pages.elements;

public class GoogleTestNG {
	
	WebDriver driver;
	elements elem;
	googleContext data = new googleContext();
	
	@BeforeTest(groups = "Priority1")
	public void googleData() throws IOException {

		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(System.getProperty("propertyfile","C:\\testing\\NewProject\\src\\test\\java\\data\\google.properties"));
		prop.load(input);
		
		data.baseURL = prop.getProperty("baseURL");
		data.searchItem = prop.getProperty("searchItem");
	}
	
	@BeforeClass(groups = "Priority1")
	public void openBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mshamsaee\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Start of Google Test");
	}
	
	@AfterClass(groups = "Priority1")
	public void closeBrowser() throws IOException {
		System.out.println("End of Google Test");
		driver.close();
		driver.quit();
	}
	
  @Test(groups = "Priority1")
  public void googleTest() throws IOException {
	  	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(data.baseURL);
		
		elem = new elements(driver);
		
		elem.inputItem(data.searchItem);
		
		Assert.assertEquals(elem.getTitle().contains(data.searchItem), true);
  }
}
