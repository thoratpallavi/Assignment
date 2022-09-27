package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(id="username")
	private WebElement usernametextfield;
	@FindBy(name="pwd")
	private WebElement passwordtextfield;
	@FindBy(id="loginButton")
	private WebElement loginbutton;
    public LoginPage(WebDriver driver) {                  //
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
	public WebElement getUsernametextfield() {
		return usernametextfield;
	}
	
	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}
	
	
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public HomePage LoginPage(String userdata,String passworddata) {      //all login credential put here instead of in main page 
		usernametextfield.sendKeys(userdata);
		passwordtextfield.sendKeys(passworddata);
		loginbutton.click();
		return new HomePage(driver);
	}
	

	

}
