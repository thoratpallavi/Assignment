package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintHeightJs {
	public static void main(String[]args) {


	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
	driver.get("https://www.naukri.com/");
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	Object obj = jse.executeScript("return document.body.scrollHeight");
	long height=(long) obj;
	System.out.println("Current URL:"+height);
}
}
