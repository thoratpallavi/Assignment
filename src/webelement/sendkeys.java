package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("https://demo.actitime.com/login.do");
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    
	   // driver.findElement(By.id("loginButton" )).sendKeys(Keys.ENTER);
	   // driver.findElement(By.xpath("//div[text()='Login ']" )).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("//div[text()='Login ']" )).sendKeys(null);

}
}
//in this program without using click method we can click using sendKeys(Key.ENTER)webelement method,key=enum and ENTER=string. line no.19
//here we not use text in src code i.e 'login 'here space is present due to this we get elementnotinteractable exception. line no.20 we cant perform any operation with space.
//if we putt null values inside either username,passward,login i.e in any send keys, we get illegalargumentexception line no.21