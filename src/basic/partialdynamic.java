package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialdynamic {
	public static void main (String[]args)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
    ChromeDriver driver= new ChromeDriver();
    driver.get("https://demo.actitime.com/login.do");
    WebElement ele = driver.findElement(By.xpath("//nobr[contains(text(),'Online')]"));
    System.out.println(ele);
    }
}
