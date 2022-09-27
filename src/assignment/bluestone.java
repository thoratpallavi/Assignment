package assignment;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.zeromq.ZStar.Set;

public class bluestone {
	public static void main (String[]args) throws InterruptedException
	{
		
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    driver.get("https://www.bluestone.com/");
	   driver.findElement(By.xpath("//span[text()='Not now']")).click();	   
	   WebElement ele = driver.findElement(By.xpath("//a[text()='Rings ']"));
	    Actions actions=new Actions(driver);
	    actions.moveToElement(ele).perform();
	    driver.findElement(By.xpath("(//a[contains(@href,'https://www.bluestone.com/jewellery/diamond-rings.html')])[1]")).click();
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
		   jse.executeScript("window.scrollBy(0,500)");       //scroll down
		  driver.findElement(By.xpath("//img[@alt='The Celisse Band Ring']")).click();
		  
		  
		  
		  
		 java.util.Set<String> window = driver.getWindowHandles();
		 Iterator<String> iter = window.iterator();
		 String mainwindow=iter.next();
		 String childwindow=iter.next();
		 driver.switchTo().window(childwindow);
		 
		 
		 
		 // Actions actions1=new Actions(driver);
		  
		   //WebElement element = driver.findElement(By.id("buy-now"));
		
		   //actions1.moveToElement(element, 100, 0).click().perform();
		   
		 // java.util.Set<String> window = driver.getWindowHandles();
		  JavascriptExecutor jse1=(JavascriptExecutor)driver;
		  jse1.executeScript("window.scrollBy(0,500)");
		  //Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='Submit'])[1]")).click();
		    	
		
	}
		
		  
	
}
