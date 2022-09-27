package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLoginP {
	public WebDriver driver;
	@FindBy(id="txtUsername")
	private WebElement usernametextfield;
	@FindBy(id="txtPassword")
	private WebElement passwordtextfield;
	@FindBy(id="btnLogin")
	private WebElement loginbutton;
    public OrangeLoginP(WebDriver driver) {                  //
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
	public WebDriver getDriver() {
		return driver;
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
	public OrangeHomeP OrangeLoginP(String userdata,String passworddata) {      //all login credential put here instead of in main page 
		usernametextfield.sendKeys(userdata);
		passwordtextfield.sendKeys(passworddata);
		loginbutton.click();
		return new OrangeHomeP(driver);
	}
	


}
