package findElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
	@SuppressWarnings("unused")
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    driver.get("https://demo.actitime.com/login.do");
	    List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	    for(WebElement ele:allLinks) {
	    	String text=ele.getText();
	    	if(!text.isEmpty()) {
	    		System.out.println(text);
	    	}
	    	
	    }

}
}
