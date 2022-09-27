package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize {

	public static void main (String[]args)
	{
	  System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
	    
      driver.get("https://demo.actitime.com/login.do");
     Dimension username = driver.findElement(By.id("username")).getSize();
      System.out.println("Height:"+username.getHeight());
      System.out.println("Height:"+username.getWidth());
      

}
}
