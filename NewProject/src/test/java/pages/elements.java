package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elements {
	
	WebDriver driver;
	
	@FindBy(xpath="(//input[contains(text(),'')])[3]") 
	WebElement searchField;
	
	public elements (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void inputItem (String searchItem) {
		searchField.sendKeys(searchItem);
		searchField.sendKeys(Keys.ENTER);
	}
	
	public String getTitle () {
		return driver.getTitle();
	}
	
}
