package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RgbToHex1 {
	public static void main(String[]args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("loginButton" )).click();
		Thread.sleep(2000);
		
		 String actualvalue = driver.findElement(By.xpath("//span[@class='errormsg' and not(@id='errorSpan')]" )).getCssValue("color");
		 System.out.println(actualvalue);
		 String expectedhexavalue = "#ce0100";
		 String actualhexavalue = Color.fromString(actualvalue).asHex();
		 System.out.println(actualhexavalue);
		 if(actualhexavalue.equals(expectedhexavalue)) {
			 
			 System.out.println("pass:value is same");	 
		 }else {
			 System.out.println("fail:value is different");
			 
		 }

}
}
