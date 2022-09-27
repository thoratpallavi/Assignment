package WebdriverMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetPageSource {

public static void main(String[]args)  {
		
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		String expectedpagesource = "Please identify yourself";
		String actualpagesource = driver.getPageSource();
		//System.out.println(element);
		if(actualpagesource.contains(expectedpagesource)) {
			System.out.println("pass:Element is present");
		}else {
			System.out.println("Fail:Element is not present");
		}
		
}
}
//complete source of the webpage