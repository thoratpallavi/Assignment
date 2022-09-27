package WebdriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetWindowHandles {
public static void main(String[]args)  {
		
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("http://leafground.com/pages/Window.html");
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
       Set<String> window = driver.getWindowHandles();
       for(String st:window) {            //to get multiple ids we use for each loop
    	   
    	   System.out.println(st);
           driver.switchTo().window(st);           //give parent wincontrol to child window
    	  System.out.println(driver.getTitle()); //we can not distinguish wich id is for which window so we use get title.
    	   System.out.println(driver.getCurrentUrl());
    	 
    
    String actualtitle= driver.getTitle();
    String Expectedtitle="TestLeaf - Interact with Windows";
    
    
    if(actualtitle.contains(Expectedtitle)) {
    	
    	System.out.println("Title is present");
    }
    else {
    	System.out.println("Title is not present");
    	
    }
    
    	   
       }
}
}



