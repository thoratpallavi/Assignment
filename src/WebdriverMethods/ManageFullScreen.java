package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ManageFullScreen {
	public static void main (String[]args)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
    ChromeDriver driver= new ChromeDriver();

    driver.get("https://www.google.com/");
    driver.manage().window().fullscreen();                //fullscreen
}
}
