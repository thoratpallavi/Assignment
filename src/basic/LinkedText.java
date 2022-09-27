package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText {
	public static void main (String[]args)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
    WebDriver driver= new ChromeDriver();

    driver.get("https://demo.actitime.com/login.do");

    driver.findElement(By.linkText("Forgot your password?")).click();


}
}
//there are 4 web element to click on perticular link use click() method.
//for that goto webpage inspect that forgot password inside that 
//there is linktext present in(> linketext<a> ).copy that link text 
