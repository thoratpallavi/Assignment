package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect1 {
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demo.actitime.com/login.do");
	    Rectangle element = driver.findElement(By.name("pwd")).getRect();
	    System.out.println("Height:"+element.getHeight());
	    System.out.println("Width:"+element.getWidth());
	    System.out.println("Start X:"+element.getX());
	    System.out.println("Start Y:"+element.getY());


}
}
