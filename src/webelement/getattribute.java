package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute {

	@SuppressWarnings("unused")
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    

	    driver.get("https://demo.actitime.com/login.do");
	    String element=driver.findElement(By.id("username")).getAttribute("type");   // here we get value for type attribute name is text.
	    
	     System.out.println(element);
	     String element1=driver.findElement(By.id("username")).getAttribute("placeholder");   // here we get value for placeholder attribute name is username.
		    
	     System.out.println(element1);
	     String element2=driver.findElement(By.id("username")).getAttribute("qspiders");   // here we use attribute name qspiders which is not present in source code we get null  
		    
	     System.out.println(element2);
	     String element3=driver.findElement(By.id("username")).getAttribute("value");   // here we use attribute name as value which is present in source code but don't have any value then we get empty.
		    
	     System.out.println(element3);
	     String element4=driver.findElement(By.id("username")).getAttribute("value");   // here we use attribute name as value which is present in source code but don't have any value then we get emptyto check it is empty or not use empty method.
		    
	     System.out.println(element4.isEmpty());
	     
	     
	     
	     
	     
	     
}
}
