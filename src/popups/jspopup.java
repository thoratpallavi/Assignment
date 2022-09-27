package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jspopup {

	@SuppressWarnings("unused")
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    driver.get("https://licindia.in/");
	    WebElement element =driver.findElement(By.xpath("//a[contains(text(),'Pay Premium through ')]"));//after inspecting and clicking itis not clickin
	   JavascriptExecutor jse=(JavascriptExecutor)driver;    //
	    jse.executeScript("arguments[0].click()",element);
	    driver.switchTo().alert().accept();
	    //driver.switchTo().alert().dismiss();
	   // String text = driver.switchTo().alert().getText();
	    //System.out.println(text);
	    }
}
