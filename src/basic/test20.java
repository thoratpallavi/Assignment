package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test20 {
	public static void main (String[]args)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
    WebDriver driver= new ChromeDriver();

    driver.get("https://demo.actitime.com/login.do");
  // WebElement ele=driver.findElement(By.id("username"));
    driver.findElement(By.id("username")).sendKeys("Qspiders");
   //driver.findElement(By.id(" "));
  
   

}


}
//to find perticular element in webpage.by is abstract class name is locators.there are 8 locators 
//that are static methods.then pass the value to that username text field using sendkeys.
//first goto password text field into webpage inspect that field first preference given to id it is present there.
//instedad of username if we write  username1 we get no such element exception. in username text field we don't get anything.
//becoz that element(username1) not found in src code
//instesd of storing into ele reference variable we can write code optimization line
//i.e driver.findElement(By.id("username")).sendKeys("Qspiders");
