package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class disablefieldjs1 {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
	    driver.findElement(By.partialLinkText("jdk-11.0.15_linux-aarch64_bin.deb")).click();
	    WebElement text=driver.findElement(By.linkText("Download jdk-11.0.15_linux-aarch64_bin.deb"));
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	   jse.executeScript("arguments[0].click()",text);

}
}
