package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {
	@SuppressWarnings("unused")
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("https://demo.actitime.com/login.do");
	    String expectedtext="Please identify yourself";
	    String actualtext=driver.findElement(By.id("headerContainer")).getText();
	   // String element=driver.findElement(By.id("headerContainer")).getText();
	   // System.out.println(element);
	    if(actualtext.contains(expectedtext)) {
	    	System.out.println("Pass: text is correct");
	    }
	    else {
	    	System.out.println("Fail: text is incorrect");
	    	
	    }
}
}
//if you want any text from the website then we use gettext webelement method.line no.18,19
//verify text i.e to compare expected and actual text line no.16,17,20-26
