package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {
	public static void main (String[]args)
	{
	
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://shop.malaicha.com/login");
    
  
    driver.findElement(By.id("button[type='submit']")).click();

}
}
