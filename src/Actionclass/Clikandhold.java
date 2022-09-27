package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Clikandhold {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	    WebElement element = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	    WebElement element1 = driver.findElement(By.id("column-2"));
	    Actions actions=new Actions(driver);
	    
	    actions.clickAndHold(element).moveToElement(element1).release().perform();
	    


}
}
//it is same as drag and drop.1st click and hold targeted element 2nd inspect the position where we have to move and use moveToElement and then use relase
//method.