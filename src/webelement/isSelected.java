package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {
	@SuppressWarnings("unused")
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demo.actitime.com/login.do");
	    WebElement element = driver.findElement(By.id("keepLoggedInCheckBox"));
	    if(element.isSelected()) {
	    	System.out.println("True:checkbox is selected");
	    	
	    }
	    else {
	    	
	    	System.out.println("False:checkbox is not selected");
	    }
	    element.click();
	    if(element.isSelected()) {
	    	System.out.println("True:checkbox is selected");
	    	
	    }
	    else {
	    	
	    	System.out.println("False:checkbox is not selected");
	    }

}
}
//isSelected 
	
