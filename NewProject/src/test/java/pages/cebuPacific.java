package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cebuPacific {
	
	public cebuPacific (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@class='_30ss _3-8j']") public WebElement chatBox;
	@FindBy(xpath="//*[@class='_2t-5']") public WebElement closeChat;
	@FindBy(id="FromStation") public WebElement departureStation;
	@FindBy(xpath="//li//a[text()='SIGN IN']") public WebElement btnSignIn;
	@FindBy(id="Email") public WebElement txtEmail;
	@FindBy(id="Password") public WebElement txtPassword;
	
	public void login(String email, String password) {
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(password);
	}
}
