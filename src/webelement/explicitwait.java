package webelement;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {
	
	@SuppressWarnings("unused")
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));     // it is used for find element
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).click();
	    String expectedtitle = "actiTIME - Enter Time-Track";
	    wait.until(ExpectedConditions.titleIs(expectedtitle));
	    //Thread.sleep(2000);
	    //String expectedtitle = "actiTIME - Enter Time-Track";
	    String actualtitle = driver.getTitle();                           // here no find element is present so use thread.sleep
		System.out.println(actualtitle);
		if(actualtitle.equals(expectedtitle)) {
			
			System.out.println("pass:Title is same");
		}else {
			
			System.out.println("Fail:Title is different");
		}
	}
}
//create object webdriverwait wait-new webdriverwait(driver,(Duration.ofSeconds(15)
//1st login after login. get the title of webpage line no.31 to get the title use print statement.but here weget title of login page
//not the homepage title.for that we use thread.sleep to slow down.to verify use if else for that put expected title.line no.30.
// don't use thread.sleep and compare we get title different.again use thread.sleep we get output as pass.instead of using thread.sleep 
//we use explicitwait().for that write line no.22 and line no.28 here we want title use titleIs(expectedtitle) so we have to write 
//line no.30 before the line of 28.becoz before use we have to initialise.
