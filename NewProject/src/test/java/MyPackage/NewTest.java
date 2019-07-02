package MyPackage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import functions.CebuPacificFunctions;
import pages.cebuPacific;

public class NewTest {	
	
	WebDriver driver;
	WebDriverWait wait;
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
  @Test
  public void test() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mshamsaee\\eclipse-workspace\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	  driver.get("https://www.cebupacificair.com/");
	  
	  cebuPacific cebuPac = new cebuPacific(driver);
	  
	  try {
		    Thread.sleep(2000);
	  } catch(InterruptedException e) {
		    System.out.println("got interrupted!");
	  }
	  
	 wait = new WebDriverWait(driver, 10);
	 
	 driver.switchTo().frame(3);
	 wait.until(ExpectedConditions.visibilityOf(cebuPac.chatBox));

	 if(cebuPac.chatBox.isDisplayed()) {
		  
		 cebuPac.closeChat.click();
	 }
	 
	 driver.switchTo().defaultContent();
                                  
	 if(cebuPac.departureStation.getAttribute("value") != "Manila") {
	//	 cebuPac.departureStation.sendKeys(Keys.ENTER);
	 } 
	 
	// wait.until(ExpectedConditions.elementToBeClickable(cebuPac.btnSignIn));
	 cebuPac.btnSignIn.click();
	 
	 CebuPacificFunctions func = new CebuPacificFunctions();
	 Assert.assertEquals(cebuPac.txtEmail.isDisplayed(), true);
	 func.login("miky@cp.com","pass");
  }
}
