package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	@SuppressWarnings("unused")
	public static void main(String[]args)
	{
       System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demo.actitime.com/login.do");
       driver.findElement(By.id("username")).sendKeys("admin");
       driver.findElement(By.name("pwd")).sendKeys("manager");
       driver.findElement(By.id("loginButton")).click();
       
       
        
        
	}

}
