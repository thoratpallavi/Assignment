package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagname {

	@SuppressWarnings("unused")
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.google.com/");
	    String element1 = "img";                                          //expected tagname
	    String element = driver.findElement(By.cssSelector("*[alt='Google']")).getTagName();//actualtagname
	    
	    if(element1.equals(element)) {
	    	
	    	System.out.println("Pass: tagname is correct");
	    }else {
	    	
	    	System.out.println("Fail: tagname is incorrect");
	    	
	    }
	   
	    
	    
	    
	    
	}
}
//here we put* becoz before comparing you put tagname as img.so there is no use of to compare.so,we put *.