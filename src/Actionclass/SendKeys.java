package Actionclass;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendKeys {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    driver.get("https://jqueryui.com/draggable/");
	    Actions actions=new Actions(driver);
	    actions.sendKeys(Keys.PAGE_DOWN).perform();
	    Thread.sleep(2000);
	    actions.sendKeys(Keys.PAGE_UP).perform();
	    
	    
	    
	   
	    

}
}
