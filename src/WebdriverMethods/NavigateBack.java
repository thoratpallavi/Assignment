package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBack {
	public static void main (String[]args)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
    ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.get("https://demo.actitime.com/login.do");
    //driver.navigate();
    driver.navigate().back();                                      //navigate back to url.
    
    

}
}
