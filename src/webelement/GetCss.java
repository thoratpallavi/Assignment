package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetCss {
public static void main(String[]args)  {
		
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://facebook.com");
		String expectedcolor="rgba(24, 119, 242, 1)";
		String actualcolor = driver.findElement(By.name("login")).getCssValue("background-color"); //goto computed and there is background color
		//System.out.println(element);   //after printing it add a into rgb i.e rgba a means alpha i.e transperent colour and its value is 1. becoz of it cannot affect colour rgb
        if(actualcolor.contains(expectedcolor)) {
        	System.out.println("pass");
        }
        else {
        	System.out.println("fail");
        	
        	
        }
        //to verify the targeted element is style or not.
}
}
