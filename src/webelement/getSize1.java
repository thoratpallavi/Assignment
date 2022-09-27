package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize1 {
	@SuppressWarnings("unused")
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/login/");
	    Dimension element = driver.findElement(By.id("email")).getSize();
	    System.out.println("Height:"+element.getHeight());
	    System.out.println("Width:"+element.getWidth());
	    Dimension element1 = driver.findElement(By.id("pass")).getSize();
	    System.out.println("Height:"+element1.getHeight());
	    System.out.println("width:"+element1.getWidth());
	    
	      
	      

}
}
