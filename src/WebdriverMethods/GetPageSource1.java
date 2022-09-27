package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource1 {
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    ChromeDriver driver= new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    String actualpagesource = driver.getPageSource();
	    String expectedpagesource = "Please identify yourself";
	    if(actualpagesource.contains(expectedpagesource))                     // contains
	    {
	    	System.out.println("pass: text is present");
	    }
	    else {
	    	System.out.println("fail: text is incorrect");
	    }

}
}