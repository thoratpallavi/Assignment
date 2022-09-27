package WebdriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GWHsClose {
public static void main(String[]args)  {
		
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("http://leafground.com/pages/Window.html");
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		 Set<String> window = driver.getWindowHandles();
		//driver.close();    //close parent window 
		int count=0;                              //1st initialise the count 0
		for(String st: window) {
			count++;                             // increase count
			driver.switchTo().window(st);        // transfer the driver control
			if(count>1) {                       // if count is greater than 1 then cose all window
				driver.close();             // close only child windows using java i.e count
			}
		}
		

}
}
