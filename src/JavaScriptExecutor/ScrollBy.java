package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollBy {
	public static void main (String[]args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    driver.get("https://www.google.com/doodles");
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	   // jse.executeScript("window.scrollBy(0,3000)");  
	    
	    
	    for(;;) {
	    	try {
	    		
	    		driver.findElement(By.linkText("Mother's Day 2022 (May 30)")).click();
	    	}
	    	catch(NoSuchElementException e)
	    	{
	    		 jse.executeScript("window.scrollBy(0,3000)");
	    	}
	    }
	
	   
	   
	    
}
}
//completely scroll up 
