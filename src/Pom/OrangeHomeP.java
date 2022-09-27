package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHomeP {
public WebDriver driver;

    
    @FindBy(id="welcome")
    private WebElement welcome;
    
    @FindBy(xpath="//a[text()='Logout']")
    private WebElement logoutbutton;

	
	public OrangeHomeP(WebDriver driver) {
		this.driver=driver;
    	PageFactory.initElements(driver, this);
    }

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
	
    public OrangeLoginP OrangeHomeP() {
    	logoutbutton.click();
    	return new OrangeLoginP(driver);
    	
    }


}
