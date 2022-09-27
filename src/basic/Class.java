package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {
	public static void main (String[]args)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
    WebDriver driver= new ChromeDriver();

    driver.get("https://demo.actitime.com/login.do");
  // WebElement ele=driver.findElement(By.name("pwd"));
  // ele.sendKeys("Qspiders");
    driver.findElement(By.className("textField")).sendKeys("Qspiders");

}
}
//to find perticular element in webpage.by is abstract class name is locators.there are 8 locators 
//that are static methods.then pass the value to that username text field using sendkeys.
//first goto password text field inspect that field first preference given to id if id is not present in src code 
//then preference given to name.then preference given to className 
//we not use class becoze they have more duplicates  .in flipkart example we get more duplicate values
