package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Getcss1 {
	public static void main(String[]args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
	driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.id("loginButton" )).click();
	Thread.sleep(2000);
	String expectedcolor="rgba(206, 1, 0, 1)";
	String actualcolor = driver.findElement(By.xpath("//span[@class='errormsg' and not(@id='errorSpan')]")).getCssValue("color");
	System.out.println(actualcolor);
	 if(actualcolor.contains(expectedcolor)) {
     	System.out.println("pass");
     }
     else {
     	System.out.println("fail");
     	
     	
     }

	

}
}
