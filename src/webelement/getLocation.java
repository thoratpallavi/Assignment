package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {
 
	@SuppressWarnings("unused")
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/login/");
	    Point element = driver.findElement(By.id("email")).getLocation();
	    System.out.println("start X:"+element.getX());
	    System.out.println("start Y:"+element.getY());
	    
}
}
