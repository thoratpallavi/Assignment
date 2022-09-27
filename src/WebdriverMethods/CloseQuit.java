package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuit {
	public static void main (String[]args)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
    ChromeDriver driver= new ChromeDriver();
    driver.get("https://demo.actitime.com/login.do");
    driver.close();                                                   // close
   // driver.quit();                                                 // quit
    

}
}
