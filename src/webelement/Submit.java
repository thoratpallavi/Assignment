package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demo.vtiger.com/vtigercrm/");
	   driver.findElement(By.id("username")).clear();
	   driver.findElement(By.id("username")).sendKeys("admin");
	   driver.findElement(By.id("password")).clear();
	   driver.findElement(By.id("password")).sendKeys("Test@123");
	    driver.findElement(By.xpath("//button[text()='Sign in']")).submit();

}
}
//it perform same action as click.it is in the form of type='submit' and it is in the form tag<form>  </form>.if we use submit button it will 
//until next page will open.if we are using click method after click on sign in it immediately perform next opertion so,we get no such element exception
//so for that we have to use thread.sleep.