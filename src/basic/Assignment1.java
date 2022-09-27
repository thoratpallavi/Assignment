package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("https://demo.actitime.com/login.do");
	    String actualtitle = driver.getTitle();
	    System.out.println(actualtitle);
	    driver.findElement(By.id("keepLoggedInCheckBox")).click();
	   
	    
	  
	    
	    
	}
}