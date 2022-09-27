package webelement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SshotTimeDate {
	public static void main (String[]args) throws  IOException
	{
         LocalDateTime ldt = LocalDateTime.now();
         String timestamp = ldt.toString().replace(':', '-');
         System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    driver.get("https://www.google.com/");
	    TakesScreenshot ts= (TakesScreenshot) driver;
	    File tempfile = ts.getScreenshotAs(OutputType.FILE);    
	    //System.out.println(tempfile.getAbsolutePath());
	    //Thread.sleep(90000);
	     File destfile = new File("./errorshot/google"+timestamp+".png");
	      FileUtils.copyFile(tempfile,destfile);


}

	}

