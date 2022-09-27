package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		  WebElement element = driver.findElement(By.id("username"));   //here address is there
		  driver.navigate().refresh();  
		 element.sendKeys("admin");                //after refreshing adress will be change so we get stale element exception for that weuse POM

}
}
