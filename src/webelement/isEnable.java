package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable {
	
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demo.actitime.com/login.do");
	    WebElement element = driver.findElement(By.id("username"));
	    if(element.isEnabled()) {
	    	
	    	System.out.println("pass:Textfield is enable");
	    }
	    else {
	    	
	    	System.out.println("Fail:Textfield is not enable");
	    }
	   WebElement element1 = driver.findElement(By.name("pwd"));
	    if(element1.isEnabled()) {
	    	
	    	System.out.println("pass:Textfield is enable");
	    }
	    else {
	    	
	    	System.out.println("Fail:Textfield is not enable");
	    }

}
}
//input is present in the src code for is enable.isEnable method os used to check if the text field is enable to write something or not. if it is enable then we get pass.if not enable it returns fail.
