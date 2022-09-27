package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("https://demo.actitime.com/login.do");
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    
	    driver.findElement(By.id("loginButton" )).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[text()='Time-Track']" )).click();

	    driver.findElement(By.xpath("//div[text()='Tasks']" )).click();
	    driver.findElement(By.xpath("//div[text()='Reports']" )).click();
	    driver.findElement(By.xpath("//div[text()='Users']" )).click();
	    driver.findElement(By.xpath("   //a[text()='Logout']" )).click();
		  
	  
	    
	 
	    

}
}
