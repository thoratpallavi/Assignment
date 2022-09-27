package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class password {
	public static void main (String[]args)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
    WebDriver driver= new ChromeDriver();

    driver.get("https://demo.actitime.com/login.do");
  // WebElement ele=driver.findElement(By.name("pwd"));
  // ele.sendKeys("Qspiders");
    driver.findElement(By.name("pwd")).sendKeys("Qspiders");

}
}
//to find perticular element in webpage.by is abstract class name is locators.there are 8 locators 
//that are static methods.then pass the value to that username text field using sendkeys.
//first goto password text field inspect that field first preference given to id if id is not present in src code 
//then preference given to name.
//instesd of storing into ele reference variable we can write code optimization line
//i.e driver.findElement(By.id("username"))
///instedad of pwd if we write  pwd1 we get no such element exception. in password text field we don't get anything.
//becoz that element(pwd1) not found in src code
