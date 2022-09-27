package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect2 {
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demo.actitime.com/login.do");
	    Point element1 = driver.findElement(By.id("username")).getLocation();
	    Point element = driver.findElement(By.name("pwd")).getLocation();
	    
	    
	   // System.out.println("Start X:"+element.getX());
	    //System.out.println("Start X:"+element1.getX());
	   
	    if(element1.getX()==element.getX()) {
	    	System.out.println("x coordinates of both element are same ");
	    }

}
}
