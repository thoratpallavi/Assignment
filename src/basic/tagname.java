package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
	public static void main (String[]args)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
    WebDriver driver= new ChromeDriver();

    driver.get("https://demo.actitime.com/login.do");
  // WebElement ele=driver.findElement(By.name("pwd"));
  // ele.sendKeys("Qspiders");
    driver.findElement(By.tagName("input"));

}
}
//input is tagname for both username and password.in this we dont pass any value to this text field becoz there is no value assign to input.
//for name=pwd is stored,for username =username value is store after inspectinf.so we dont go for tagname.