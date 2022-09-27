package WebdriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition {
	public static void main (String[]args)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
    ChromeDriver driver= new ChromeDriver();

    driver.get("https://www.google.com/");
    Point pt =driver.manage().window().getPosition();               // get postion
    System.out.println("startX="+pt.getX());              
    System.out.println("startY="+pt.getY());

}
}