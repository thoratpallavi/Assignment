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

public class jio {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    driver.get("https://www.jio.com/");
	  driver.findElement(By.xpath("(//input[@class='stretch searchInput'])[1]")).click();
	  List<WebElement> element = driver.findElements(By.xpath("//div[@class='item-text j-text-body-xs']"));
	   
	   for(WebElement ele : element) {
		   
		   System.out.println(ele.getText());
	   } 
       driver.findElement(By.id("topnav-search")).sendKeys("Recharge");
      
	    List<WebElement> element1 = driver.findElements(By.xpath("//li[@class='pkv-searchresult-item dynamic-suggestion']"));
	    for(WebElement ele1 : element1) {
			   
			   System.out.println(ele1.getText());
	    }
	   
		   }

	  	    
	
	
	}

