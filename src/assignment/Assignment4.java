package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.jio.com/en-in/help-support/call-us#/");
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@role='menubar']//a"));
		 Actions actions=new Actions(driver);
		   actions.keyDown(Keys.CONTROL);  
		   for(WebElement ele:elements) {  
	    	   actions.click(ele);         
	       }
		   actions.keyUp(Keys.CONTROL);    
	       actions.perform();  
		
				
	

}
}
