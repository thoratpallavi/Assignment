package AutoI3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autoit {
	public static void main (String[]args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    driver.get("https://demo.guru99.com/test/upload/");
	    driver.findElement(By.id("uploadmode1")).click();
	    Thread.sleep(2000);
	    Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\ai\\fileuploadepopup.exe");
	

}
}
