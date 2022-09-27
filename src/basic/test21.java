package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test21 {
	public static void main (String[]args)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
    WebDriver driver= new ChromeDriver();

    driver.get("https://demo.actitime.com/login.do");
  
    driver.findElement(By.className("textField pwdfield")).sendKeys("Qspiders");

}
}


//for password with the help of classname locator we get invalid selector inspection.becoz after inspecting password there is class name 
//inside class name space is presnt between textfield pwdfield.so we cant take class 