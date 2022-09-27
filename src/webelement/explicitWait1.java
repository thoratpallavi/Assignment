package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait1 {
	
	@SuppressWarnings("unused")
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    driver.get("https://demo.actitime.com/login.do");
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).click();
	    //Thread.sleep(2000);
	    String expectedurl="https://demo.actitime.com/user/submit_tt.do";
	    wait.until(ExpectedConditions.urlToBe(expectedurl));
	    String actualurl = driver.getCurrentUrl();
	    System.out.println(actualurl);
	    if(actualurl.equals(expectedurl)) {
	    	
	    	System.out.println("Pass:url is correct");
	    }else {
	    	
	    	System.out.println("Fail:Url is incorrect");
	    }
	    

}
}
