package functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.cebuPacific;

public class CebuPacificFunctions {
	
	WebDriver driver;
/*	public CebuPacificFunctions (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}*/
	
	cebuPacific cebuPac = new cebuPacific(driver);
	
	public void login(String email, String password) {
		cebuPac.txtEmail.sendKeys(email);
		cebuPac.txtPassword.sendKeys(password);
	}

}
