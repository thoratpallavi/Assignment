package WebdriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
	public static void main (String[]args)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
    ChromeDriver driver= new ChromeDriver();

    driver.get("https://www.google.com/");
    Point targetPosition= new Point(5,5);
   
	driver.manage().window().setPosition(targetPosition);               // set postion
    //System.out.println("startX="+targetPosition.getX());              
   // System.out.println("startY="+targetPosition.getY());


}
}