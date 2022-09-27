package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkart {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    WebElement ele = driver.findElement(By.xpath("//div[text()='Electronics']"));
	    Actions actions=new Actions(driver);
	    actions.moveToElement(ele).perform();
	    driver.findElement(By.xpath("//a[text()='Audio']")).click();
	    WebElement ele1 = driver.findElement(By.xpath("//span[text()='Electronics']"));
	    actions.moveToElement(ele1).perform();
	    driver.findElement(By.xpath("//a[text()='Realme']")).click();
	   // driver.findElement(By.xpath("//div[text()='realme 9 5G (Stargaze White, 64 GB)']/../..//div[@class='_30jeq3 _1_WHN1']")).click();
	   //WebElement ele2 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	   // actions.click(ele2).perform();
	    //JavascriptExecutor jse=(JavascriptExecutor) driver;
	 // jse.executeScript("arguments[0].click()",ele2);
	  
	    
	    
	    
	    
	    
}
}
