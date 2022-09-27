package Pom1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pom.HomePage;
import Pom.LoginPage;

public class HLPage {
	public static void main(String[]args) {
		
			System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
			
			driver.get("https://demo.actitime.com/login.do");
			//LoginPage lp= new LoginPage(driver);
			//PageFactory.initElements(driver, lp);
			/*lp.getUsernametextfield().sendKeys("admin");
			driver.navigate().refresh(); 
			
			
			lp.getUsernametextfield().sendKeys("admin");
			lp.getPasswordtextfield().sendKeys("manager");
			lp.getLoginbutton().click();*/
			//lp.LoginPage("admin","manager");
			
		    //HomePage hp= new HomePage(driver);
		   // PageFactory.initElements(driver, hp);
		    
		   //hp.HomePage();
			new LoginPage(driver).LoginPage("admin","manager").HomePage();
	}

}
