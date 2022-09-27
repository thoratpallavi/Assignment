package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplay {
	@SuppressWarnings("unused")
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demo.actitime.com/login.do");
	    WebElement element = driver.findElement(By.id("username"));
	    if(element.isDisplayed()) {
	    	System.out.println("Pass:username is displayed");
	    	
	    }
	    else {
	    	
	    	System.out.println("Faile:username is not displayed");
	    }

}
}
//to check targated elememt is displayed in website or not.
