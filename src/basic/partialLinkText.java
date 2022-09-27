package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText {
	public static void main (String[]args)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
    WebDriver driver= new ChromeDriver();

    driver.get("https://demo.actitime.com/login.do");

    driver.findElement(By.partialLinkText("Forgot your")).click();


}
}
// if the link is long then we copy the some part of that link and paste here.