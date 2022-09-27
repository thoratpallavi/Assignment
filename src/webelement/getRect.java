package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect {
	@SuppressWarnings("unused")
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/login/");
	    Rectangle element = driver.findElement(By.id("email")).getRect();
	    System.out.println("Height:"+element.getHeight());
	    System.out.println("Width:"+element.getWidth());
	    System.out.println("Start X:"+element.getX());
	    System.out.println("Start Y:"+element.getY());

}
}
