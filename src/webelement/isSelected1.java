package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected1 {
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	    WebElement element = driver.findElement(By.xpath("//label[text()='Female']/parent::span[contains(@class,'_5k_2 _5dba')]//input[contains(@type,'radio')]"));
	    if(element.isSelected()) {
	    	System.out.println("True:checkbox is selected");
	    	
	    }
	    else {
	    	
	    	System.out.println("False:checkbox is not selected");
	    }
	    WebElement element1 = driver.findElement(By.xpath("//label[text()='Male']/parent::span[contains(@class,'_5k_2 _5dba')]//input[contains(@type,'radio')]"));
	    if(element1.isSelected()) {
	    	System.out.println("True:checkbox is selected");
	    	
	    }
	    else {
	    	
	    	System.out.println("False:checkbox is not selected");
	    }
	   

}
}
