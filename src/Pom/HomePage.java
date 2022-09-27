package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	@FindBy(id="logoutLink")
    private WebElement logoutbutton;
	
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
    	PageFactory.initElements(driver, this);
    }

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
	
    public LoginPage HomePage() {
    	logoutbutton.click();
    	return new LoginPage(driver);
    	
    }

	
	

}
