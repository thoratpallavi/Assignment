package WebdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	public static void main (String[]args)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
ChromeDriver driver= new ChromeDriver();

driver.get("https://www.flipkart.com/");
Dimension dim=driver.manage().window().getSize();                  //get size
System.out.println("width="+dim.getWidth() );                      //get width
System.out.println("height="+dim.getHeight() );                    //get height


	}
}
