package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RgbToHexa {
	public static void main(String[]args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
		 String actualvalue = driver.findElement(By.name("login" )).getCssValue("background-color");
		 System.out.println(actualvalue);
		 String expectedhexavalue = "#1877f2";
		 String actualhexavalue = Color.fromString(actualvalue).asHex();
		 System.out.println(actualhexavalue);
		 if(actualhexavalue.equals(expectedhexavalue)) {
			 
			 System.out.println("pass:value is same");	 
		 }else {
			 System.out.println("fail:value is different");
			 
		 }

}
}
