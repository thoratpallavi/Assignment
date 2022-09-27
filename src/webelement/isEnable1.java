package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable1 {
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://live.skillrary.com/testing-app/");
	    WebElement element = driver.findElement(By.cssSelector("input[class='form-control']"));
	    if(element.isEnabled()) {
	    	
	    	System.out.println("pass:Textfield is enable");
	    }
	    else {
	    	
	    	System.out.println("Fail:Textfield is not enable");
	    }

}
}