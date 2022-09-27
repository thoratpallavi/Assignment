package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext2 {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("https://demo.actitime.com/login.do");
	    String element=driver.findElement(By.xpath("//td[@id='adminCredentialsHeader']/following-sibling::td[contains(text(),'Username: ')]")).getText();
	     System.out.println(element);

}
}
